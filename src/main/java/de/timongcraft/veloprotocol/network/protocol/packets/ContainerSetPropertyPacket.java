package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.core.AbstractPacket;
import io.github._4drian3d.vpacketevents.api.register.PacketRegistration;
import io.netty.buffer.ByteBuf;
import org.jetbrains.annotations.ApiStatus;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * (latest) Resource Id: 'minecraft:container_set_data'
 */
@SuppressWarnings("unused")
@ApiStatus.Experimental
public class ContainerSetPropertyPacket extends AbstractPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(ContainerSetPropertyPacket.class)
                .direction(ProtocolUtils.Direction.CLIENTBOUND)
                .packetSupplier(ContainerSetPropertyPacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x15, MINECRAFT_1_18_2, encodeOnly)
                .mapping(0x12, MINECRAFT_1_19, encodeOnly)
                .mapping(0x11, MINECRAFT_1_19_3, encodeOnly)
                .mapping(0x13, MINECRAFT_1_19_4, encodeOnly)
                .mapping(0x14, MINECRAFT_1_20_2, encodeOnly)
                .mapping(0x13, MINECRAFT_1_21_5, encodeOnly)
                .register();
    }

    private ContainerSetPropertyPacket() {}

    public ContainerSetPropertyPacket(short property, int windowId, short value) {
        this.property = property;
        this.windowId = windowId;
        this.value = value;
    }

    private int windowId;

    /**
     * Currently there's no way to get property IDs using <a href="https://minecraft.wiki/w/Tutorials/Running_the_data_generator">data gen</a>.
     *
     * <p>Though you should be able to look them up <a href="https://minecraft.wiki/w/Java_Edition_protocol/Packets#Set_Container_Property">on the wiki</a>>.
     */
    private short property;
    /**
     * Currently there's no way to get property values using <a href="https://minecraft.wiki/w/Tutorials/Running_the_data_generator">data gen</a>.
     *
     * <p>Though you should be able to look them up <a href="https://minecraft.wiki/w/Java_Edition_protocol/Packets#Set_Container_Property">on the wiki</a>>.
     */
    private short value;

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        if (version.noLessThan(MINECRAFT_1_21_2)) {
            windowId = ProtocolUtils.readVarInt(buf);
        } else {
            windowId = buf.readUnsignedByte();
        }
        property = buf.readShort();
        value = buf.readShort();
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        if (version.noLessThan(MINECRAFT_1_21_2)) {
            ProtocolUtils.writeVarInt(buf, windowId);
        } else {
            buf.writeByte(windowId);
        }
        buf.writeShort(property);
        buf.writeShort(value);
    }

    public int getWindowId() {
        return windowId;
    }

    public void setWindowId(int windowId) {
        this.windowId = windowId;
    }

    public short getProperty() {
        return property;
    }

    public void setProperty(short property) {
        this.property = property;
    }

    public short getValue() {
        return value;
    }

    public void setValue(short value) {
        this.value = value;
    }

}