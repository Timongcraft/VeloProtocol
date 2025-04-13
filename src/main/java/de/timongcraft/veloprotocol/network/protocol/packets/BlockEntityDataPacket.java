package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.connection.MinecraftSessionHandler;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.VeloPacket;
import de.timongcraft.veloprotocol.network.protocol.blockentities.VeloBlockEntityType;
import de.timongcraft.veloprotocol.network.protocol.blockentities.VeloBlockEntityTypes;
import de.timongcraft.veloprotocol.utils.network.Position;
import io.github._4drian3d.vpacketevents.api.register.PacketRegistration;
import io.netty.buffer.ByteBuf;
import net.kyori.adventure.nbt.BinaryTagIO;
import net.kyori.adventure.nbt.CompoundBinaryTag;

/**
 * (latest) Resource Id: 'minecraft:block_entity_data'
 */
@SuppressWarnings("unused")
public class BlockEntityDataPacket extends VeloPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(BlockEntityDataPacket.class)
                .direction(ProtocolUtils.Direction.CLIENTBOUND)
                .packetSupplier(BlockEntityDataPacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x0A, ProtocolVersion.MINECRAFT_1_18_2, encodeOnly)
                .mapping(0x07, ProtocolVersion.MINECRAFT_1_19, encodeOnly)
                .mapping(0x08, ProtocolVersion.MINECRAFT_1_19_4, encodeOnly)
                .mapping(0x07, ProtocolVersion.MINECRAFT_1_20_2, encodeOnly)
                .mapping(0x06, ProtocolVersion.MINECRAFT_1_21_5, encodeOnly)
                .register();
    }

    private Position position;
    private VeloBlockEntityType type;
    private CompoundBinaryTag nbt;

    public BlockEntityDataPacket() {}

    public BlockEntityDataPacket(Position position, VeloBlockEntityType type, CompoundBinaryTag nbt) {
        this.position = position;
        this.type = type;
        this.nbt = nbt;
    }

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        decoded = true;

        position = Position.read(buf);
        type = VeloBlockEntityTypes.getFromProtocolId(ProtocolUtils.readVarInt(buf), version);
        nbt = ProtocolUtils.readCompoundTag(buf, version, BinaryTagIO.reader());
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        position.write(buf);
        ProtocolUtils.writeVarInt(buf, type.getProtocolId(version));
        ProtocolUtils.writeBinaryTag(buf, version, nbt);
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

    public VeloBlockEntityType getType() {
        return type;
    }

    public void setType(VeloBlockEntityType type) {
        this.type = type;
    }

    public CompoundBinaryTag getNbt() {
        return nbt;
    }

    public void setNbt(CompoundBinaryTag nbt) {
        this.nbt = nbt;
    }

}