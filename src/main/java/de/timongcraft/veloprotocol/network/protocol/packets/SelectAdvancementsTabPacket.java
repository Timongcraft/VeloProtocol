package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.core.AbstractPacket;
import de.timongcraft.velopacketimpl.shaded.vpacketevents.api.register.PacketRegistration;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.velopacketimpl.utils.network.protocol.ExProtocolUtils;
import io.netty.buffer.ByteBuf;
import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * (latest) Resource Id: 'minecraft:select_advancements_tab'
 */
@SuppressWarnings("unused")
@ApiStatus.Experimental
@Since(MINECRAFT_1_20_5)
public class SelectAdvancementsTabPacket extends AbstractPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(SelectAdvancementsTabPacket.class)
                .direction(ProtocolUtils.Direction.CLIENTBOUND)
                .packetSupplier(SelectAdvancementsTabPacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x4A, MINECRAFT_1_20_5, encodeOnly)
                .mapping(0x4F, MINECRAFT_1_21_2, encodeOnly)
                .mapping(0x4E, MINECRAFT_1_21_5, encodeOnly)
                .register();
    }

    private Action action;
    private @Nullable Key tabKey;

    private SelectAdvancementsTabPacket() {}

    public SelectAdvancementsTabPacket(Action action, @Nullable Key tabKey) {
        this.action = action;
        this.tabKey = tabKey;
    }

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        super.decode(buf, direction, version);

        action = ExProtocolUtils.readEnumByOrdinal(buf, Action.class);
        if (action == Action.OPEN_TAB) {
            tabKey = ProtocolUtils.readKey(buf);
        }
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        ExProtocolUtils.writeEnumOrdinal(buf, action);
        if (action == Action.OPEN_TAB) {
            Objects.requireNonNull(tabKey, "tabKey must not be null when action == OPEN_TAB");
            ProtocolUtils.writeKey(buf, tabKey);
        }
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public @Nullable Key getTabKey() {
        return tabKey;
    }

    public void setTabKey(@Nullable Key tabKey) {
        this.tabKey = tabKey;
    }

    public enum Action {

        OPEN_TAB, CLOSE_SCREEN

    }

}