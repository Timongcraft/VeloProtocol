package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.connection.MinecraftSessionHandler;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.VeloPacket;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.veloprotocol.utils.network.Position;
import io.github._4drian3d.vpacketevents.api.register.PacketRegistration;
import io.netty.buffer.ByteBuf;

/**
 * (latest) Resource Id: 'minecraft:sign_update'
 */
@SuppressWarnings("unused")
public class SignUpdatePacket extends VeloPacket {

    public static final int LINE_LENGTH_CAP = 384;

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(SignUpdatePacket.class)
                .direction(ProtocolUtils.Direction.SERVERBOUND)
                .packetSupplier(SignUpdatePacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x2B, ProtocolVersion.MINECRAFT_1_18_2, encodeOnly)
                .mapping(0x2D, ProtocolVersion.MINECRAFT_1_19, encodeOnly)
                .mapping(0x2E, ProtocolVersion.MINECRAFT_1_19_1, encodeOnly)
                .mapping(0x2E, ProtocolVersion.MINECRAFT_1_19_3, encodeOnly)
                .mapping(0x2E, ProtocolVersion.MINECRAFT_1_19_4, encodeOnly)
                .mapping(0x2E, ProtocolVersion.MINECRAFT_1_20, encodeOnly)
                .mapping(0x31, ProtocolVersion.MINECRAFT_1_20_2, encodeOnly)
                .mapping(0x32, ProtocolVersion.MINECRAFT_1_20_3, encodeOnly)
                .mapping(0x35, ProtocolVersion.MINECRAFT_1_20_5, encodeOnly)
                .mapping(0x35, ProtocolVersion.MINECRAFT_1_21, encodeOnly)
                .mapping(0x37, ProtocolVersion.MINECRAFT_1_21_2, encodeOnly)
                .mapping(0x39, ProtocolVersion.MINECRAFT_1_21_4, encodeOnly)
                .mapping(0x3A, ProtocolVersion.MINECRAFT_1_21_5, encodeOnly)
                .register();
    }

    private Position position;
    @Since(ProtocolVersion.MINECRAFT_1_20)
    private boolean frontText;
    private String[] lines = new String[4];

    public SignUpdatePacket() {}

    public SignUpdatePacket(Position position, boolean frontText, String[] lines) {
        this.position = position;
        this.frontText = frontText;
        this.lines = lines;
    }

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion protocolVersion) {
        decoded = true;

        position = Position.read(buf);

        if (protocolVersion.greaterThan(ProtocolVersion.MINECRAFT_1_19_4))
            frontText = buf.readBoolean();

        for (int i = 0; i < lines.length; i++)
            lines[i] = ProtocolUtils.readString(buf, LINE_LENGTH_CAP);
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion protocolVersion) {
        position.write(buf);


        if (protocolVersion.greaterThan(ProtocolVersion.MINECRAFT_1_19_4))
            buf.writeBoolean(frontText);

        for (String line : lines)
            ProtocolUtils.writeString(buf, line);
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

    @Since(ProtocolVersion.MINECRAFT_1_20)
    public boolean isFrontText() {
        return frontText;
    }

    @Since(ProtocolVersion.MINECRAFT_1_20)
    public void setFrontText(boolean frontText) {
        this.frontText = frontText;
    }

    public String[] getLines() {
        return lines;
    }

    public SignUpdatePacket setLine(int line, String lineContent) {
        if (line < 0 || line > 3) {
            throw new IllegalStateException("line needs to be no less than 0 and no greater than 3");
        }
        if (lineContent.length() > LINE_LENGTH_CAP) {
            throw new IllegalStateException("line can only be " + LINE_LENGTH_CAP + " chars long");
        }
        lines[line] = lineContent;
        return this;
    }

    public void setLines(String[] lines) {
        if (lines.length != 3) {
            throw new IllegalStateException("lines needs to be 3");
        }
        for (String line : lines) {
            if (line.length() > LINE_LENGTH_CAP) {
                throw new IllegalStateException("lines can only be " + LINE_LENGTH_CAP + " chars long");
            }
        }
        this.lines = lines;
    }

}