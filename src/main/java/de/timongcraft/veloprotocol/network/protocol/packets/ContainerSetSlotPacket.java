package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.core.AbstractPacket;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.veloprotocol.network.protocol.inventory.item.VeloItemStack;
import io.github._4drian3d.vpacketevents.api.register.PacketRegistration;
import io.netty.buffer.ByteBuf;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * (latest) Resource Id: 'minecraft:container_set_slot'
 */
@SuppressWarnings("unused")
@Since(ProtocolVersion.MINECRAFT_1_20_5)
public class ContainerSetSlotPacket extends AbstractPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(ContainerSetSlotPacket.class)
                .direction(ProtocolUtils.Direction.CLIENTBOUND)
                .packetSupplier(ContainerSetSlotPacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x15, MINECRAFT_1_20_5, encodeOnly)
                .mapping(0x14, MINECRAFT_1_21_5, encodeOnly)
                .register();
    }

    private ContainerSetSlotPacket() {}

    public ContainerSetSlotPacket(int windowId, int stateId, short slotId, VeloItemStack stack) {
        this.windowId = windowId;
        this.stateId = stateId;
        this.slotId = slotId;
        this.stack = stack;
    }

    private int windowId;
    private int stateId;
    private short slotId;
    private VeloItemStack stack;

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        throw new UnsupportedOperationException("Not implemented, requires VeloItemStack to be decodable");

        /*if (version.noLessThan(MINECRAFT_1_21_2)) {
            windowId = ProtocolUtils.readVarInt(buf);
        } else {
            windowId = buf.readUnsignedByte();
        }
        stateId = ProtocolUtils.readVarInt(buf);
        slotId = buf.readShort();
        stack = VeloItemStack.ofOpt(buf, version);*/
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        if (version.noLessThan(MINECRAFT_1_21_2)) {
            ProtocolUtils.writeVarInt(buf, windowId);
        } else {
            buf.writeByte(windowId);
        }
        ProtocolUtils.writeVarInt(buf, stateId);
        buf.writeShort(slotId);
        stack.writeOpt(buf, version);
    }

    public int getWindowId() {
        return windowId;
    }

    public void setWindowId(int windowId) {
        this.windowId = windowId;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public short getSlotId() {
        return slotId;
    }

    public void setSlotId(short slotId) {
        this.slotId = slotId;
    }

    public VeloItemStack getStack() {
        return stack;
    }

    public void setStack(VeloItemStack stack) {
        this.stack = stack;
    }

}