package de.timongcraft.veloprotocol.apis;

import com.google.common.annotations.Beta;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.DisconnectEvent;
import com.velocitypowered.api.event.player.ServerPostConnectEvent;
import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.api.proxy.ProxyServer;
import de.timongcraft.velopacketimpl.shaded.vpacketevents.api.event.PacketReceiveEvent;
import de.timongcraft.veloprotocol.events.PlayerClientLoadedWorldEvent;
import de.timongcraft.veloprotocol.network.protocol.packets.PlayerLoadedWorldPacket;
import org.jetbrains.annotations.Nullable;

import java.time.Duration;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings("removal")
@Deprecated(since = "1.3.3", forRemoval = true) // will be removed when the pull request is merged - https://github.com/PaperMC/Velocity/pull/1541
@Beta
public class PlayerLoadedWorldApi {

    private static final Duration NOTCHIAN_TIMEOUT = Duration.ofMillis(1500); // 60 ticks
    private static boolean REGISTERED;

    public static void register(Object pluginMainClass, ProxyServer proxyServer, @Nullable Duration timeout) {
        if (REGISTERED) return; // fail silently
        REGISTERED = true;

        PlayerLoadedWorldPacket.register(false);
        proxyServer.getEventManager().register(pluginMainClass, new PlayerLoadedWorldApi(pluginMainClass, proxyServer, timeout));
    }

    private final ProxyServer proxyServer;
    private final Object pluginMainClass;
    private final Duration timeout;
    private final Set<UUID> loadingPlayers;

    private PlayerLoadedWorldApi(Object pluginMainClass, ProxyServer proxyServer, @Nullable Duration timeout) {
        this.proxyServer = proxyServer;
        this.pluginMainClass = pluginMainClass;
        this.timeout = timeout != null ? timeout : NOTCHIAN_TIMEOUT;
        loadingPlayers = ConcurrentHashMap.newKeySet();
    }

    @Subscribe
    public void onPostConnect(ServerPostConnectEvent event) {
        if (event.getPlayer().getProtocolVersion().lessThan(ProtocolVersion.MINECRAFT_1_21_4)) return;
        loadingPlayers.add(event.getPlayer().getUniqueId());

        proxyServer.getScheduler().buildTask(pluginMainClass, () -> {
            loadingPlayers.remove(event.getPlayer().getUniqueId());
            if (!event.getPlayer().isActive()) return;
            proxyServer.getEventManager().fireAndForget(new PlayerClientLoadedWorldEvent(event.getPlayer(), true));
        }).delay(timeout).schedule();
    }

    @Subscribe
    public void onClientLoadedWorldPacket(PacketReceiveEvent event) {
        if (!(event.getPacket() instanceof PlayerLoadedWorldPacket)) return;
        loadingPlayers.remove(event.getPlayer().getUniqueId());
        proxyServer.getEventManager().fireAndForget(new PlayerClientLoadedWorldEvent(event.getPlayer(), false));
    }

    @Subscribe
    public void onDisconnect(DisconnectEvent event) {
        loadingPlayers.remove(event.getPlayer().getUniqueId());
    }

}