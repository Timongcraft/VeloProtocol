package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.connection.MinecraftSessionHandler;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.VeloPacket;
import de.timongcraft.veloprotocol.utils.network.Position;
import io.github._4drian3d.vpacketevents.api.register.PacketRegistration;
import io.netty.buffer.ByteBuf;

/**
 * (latest) Resource Id: 'minecraft:open_sign_editor'
 */
@SuppressWarnings("unused")
public class SignEditorOpenPacket extends VeloPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(SignEditorOpenPacket.class)
                .direction(ProtocolUtils.Direction.CLIENTBOUND)
                .packetSupplier(SignEditorOpenPacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x2F, ProtocolVersion.MINECRAFT_1_18_2, encodeOnly)
                .mapping(0x2C, ProtocolVersion.MINECRAFT_1_19, encodeOnly)
                .mapping(0x2E, ProtocolVersion.MINECRAFT_1_19_1, encodeOnly)
                .mapping(0x2D, ProtocolVersion.MINECRAFT_1_19_3, encodeOnly)
                .mapping(0x31, ProtocolVersion.MINECRAFT_1_19_4, encodeOnly)
                .mapping(0x31, ProtocolVersion.MINECRAFT_1_20, encodeOnly)
                .mapping(0x32, ProtocolVersion.MINECRAFT_1_20_2, encodeOnly)
                .mapping(0x32, ProtocolVersion.MINECRAFT_1_20_3, encodeOnly)
                .mapping(0x34, ProtocolVersion.MINECRAFT_1_20_5, encodeOnly)
                .mapping(0x34, ProtocolVersion.MINECRAFT_1_21, encodeOnly)
                .mapping(0x36, ProtocolVersion.MINECRAFT_1_21_2, encodeOnly)
                .mapping(0x35, ProtocolVersion.MINECRAFT_1_21_5, encodeOnly)
                .register();
    }

    private Position position;
    private boolean frontText;

    public SignEditorOpenPacket() {}

    public SignEditorOpenPacket(Position position, boolean frontText) {
        this.position = position;
        this.frontText = frontText;
    }

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion protocolVersion) {
        decoded = true;

        position = Position.read(buf);
        frontText = buf.readBoolean();
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion protocolVersion) {
        position.write(buf);
        buf.writeBoolean(frontText);
    }

    @Override
    public boolean handle(MinecraftSessionHandler handler) {
        return false;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isFrontText() {
        return frontText;
    }

    public void setFrontText(boolean frontText) {
        this.frontText = frontText;
    }

}