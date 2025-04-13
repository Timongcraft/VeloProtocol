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
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

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
    private final Map<UUID, PlayerClientLoadedWorldEvent.Cause> loadingPlayers;

    private PlayerLoadedWorldApi(Object pluginMainClass, ProxyServer proxyServer, @Nullable Duration timeout) {
        this.proxyServer = proxyServer;
        this.pluginMainClass = pluginMainClass;
        this.timeout = timeout != null ? timeout : NOTCHIAN_TIMEOUT;
        loadingPlayers = new ConcurrentHashMap<>();
    }

    @Subscribe
    public void onPostConnect(ServerPostConnectEvent event) {
        if (event.getPlayer().getProtocolVersion().lessThan(ProtocolVersion.MINECRAFT_1_21_4)) return;
        loadingPlayers.put(event.getPlayer().getUniqueId(), PlayerClientLoadedWorldEvent.Cause.SERVER_JOIN);

        proxyServer.getScheduler().buildTask(pluginMainClass, () -> {
            PlayerClientLoadedWorldEvent.Cause cause = loadingPlayers.remove(event.getPlayer().getUniqueId());
            if (cause == null) return;
            if (!event.getPlayer().isActive()) return;

            proxyServer.getEventManager().fireAndForget(new PlayerClientLoadedWorldEvent(event.getPlayer(), cause, true));
        }).delay(timeout).schedule();
    }

    @Subscribe
    public void onClientLoadedWorldPacket(PacketReceiveEvent event) {
        if (!(event.getPacket() instanceof PlayerLoadedWorldPacket)) return;
        PlayerClientLoadedWorldEvent.Cause cause = loadingPlayers.remove(event.getPlayer().getUniqueId());
        if (cause == null) return;

        proxyServer.getEventManager().fireAndForget(new PlayerClientLoadedWorldEvent(event.getPlayer(), cause, false));
    }

    @Subscribe
    public void onDisconnect(DisconnectEvent event) {
        loadingPlayers.remove(event.getPlayer().getUniqueId());
    }

}