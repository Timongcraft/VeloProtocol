package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.connection.MinecraftSessionHandler;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.core.AbstractPacket;
import de.timongcraft.veloprotocol.utils.network.Position;
import io.github._4drian3d.vpacketevents.api.register.PacketRegistration;
import io.netty.buffer.ByteBuf;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * (latest) Resource Id: 'minecraft:open_sign_editor'
 */
@SuppressWarnings("unused")
public class SignEditorOpenPacket extends AbstractPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(SignEditorOpenPacket.class)
                .direction(ProtocolUtils.Direction.CLIENTBOUND)
                .packetSupplier(SignEditorOpenPacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x2F, MINECRAFT_1_18_2, encodeOnly)
                .mapping(0x2C, MINECRAFT_1_19, encodeOnly)
                .mapping(0x2E, MINECRAFT_1_19_1, encodeOnly)
                .mapping(0x2D, MINECRAFT_1_19_3, encodeOnly)
                .mapping(0x31, MINECRAFT_1_19_4, encodeOnly)
                .mapping(0x32, MINECRAFT_1_20_2, encodeOnly)
                .mapping(0x34, MINECRAFT_1_20_5, encodeOnly)
                .mapping(0x36, MINECRAFT_1_21_2, encodeOnly)
                .mapping(0x35, MINECRAFT_1_21_5, encodeOnly)
                .register();
    }

    private Position position;
    private boolean frontText;

    private SignEditorOpenPacket() {}

    public SignEditorOpenPacket(Position position, boolean frontText) {
        this.position = position;
        this.frontText = frontText;
    }

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        super.decode(buf, direction, version);

        position = Position.read(buf);

        frontText = buf.readBoolean();
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        position.write(buf);

        buf.writeBoolean(frontText);
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