package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.VeloPacket;
import io.github._4drian3d.vpacketevents.api.register.PacketRegistration;
import io.netty.buffer.ByteBuf;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * (latest) Resource Id: 'minecraft:container_close'
 */
@SuppressWarnings("unused")
public class ScreenClosePacket extends VeloPacket {

    public static void registerClientBound(boolean encodeOnly) {
        PacketRegistration.of(ScreenClosePacket.class)
                .direction(ProtocolUtils.Direction.CLIENTBOUND)
                .packetSupplier(ScreenClosePacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x13, MINECRAFT_1_18_2, encodeOnly)
                .mapping(0x10, MINECRAFT_1_19, encodeOnly)
                .mapping(0x0F, MINECRAFT_1_19_3, encodeOnly)
                .mapping(0x11, MINECRAFT_1_19_4, encodeOnly)
                .mapping(0x12, MINECRAFT_1_20_2, encodeOnly)
                .mapping(0x11, MINECRAFT_1_21_5, encodeOnly)
                .register();
    }

    public static void registerServerBound(boolean encodeOnly) {
        PacketRegistration.of(ScreenClosePacket.class)
                .direction(ProtocolUtils.Direction.SERVERBOUND)
                .packetSupplier(ScreenClosePacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x09, MINECRAFT_1_18_2, encodeOnly)
                .mapping(0x0B, MINECRAFT_1_19, encodeOnly)
                .mapping(0x0C, MINECRAFT_1_19_1, encodeOnly)
                .mapping(0x0B, MINECRAFT_1_19_3, encodeOnly)
                .mapping(0x0C, MINECRAFT_1_19_4, encodeOnly)
                .mapping(0x0E, MINECRAFT_1_20_2, encodeOnly)
                .mapping(0x0F, MINECRAFT_1_20_5, encodeOnly)
                .mapping(0x11, MINECRAFT_1_21_2, encodeOnly)
                .mapping(0x12, MINECRAFT_1_21_6, encodeOnly)
                .register();
    }

    private int windowId;

    private ScreenClosePacket() {}

    public ScreenClosePacket(int windowId) {
        this.windowId = windowId;
    }

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        decoded = true;

        if (version.noLessThan(MINECRAFT_1_21_2)) {
            windowId = ProtocolUtils.readVarInt(buf);
        } else {
            windowId = buf.readUnsignedByte();
        }
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        if (version.noLessThan(MINECRAFT_1_21_2)) {
            ProtocolUtils.writeVarInt(buf, windowId);
        } else {
            buf.writeByte(windowId);
        }
    }

    public int windowId() {
        return windowId;
    }

    public ScreenClosePacket windowId(int windowId) {
        this.windowId = windowId;
        return this;
    }

}