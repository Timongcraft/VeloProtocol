package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.connection.MinecraftSessionHandler;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.VeloPacket;
import de.timongcraft.veloprotocol.utils.network.Position;
import io.github._4drian3d.vpacketevents.api.register.PacketRegistration;
import io.netty.buffer.ByteBuf;
import org.jetbrains.annotations.ApiStatus;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * (latest) Resource Id: 'minecraft:block_update'
 */
@ApiStatus.Experimental
@SuppressWarnings("unused")
public class BlockUpdatePacket extends VeloPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(BlockUpdatePacket.class)
                .direction(ProtocolUtils.Direction.CLIENTBOUND)
                .packetSupplier(BlockUpdatePacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x0C, MINECRAFT_1_18_2, encodeOnly)
                .mapping(0x09, MINECRAFT_1_19, encodeOnly)
                .mapping(0x0A, MINECRAFT_1_19_4, encodeOnly)
                .mapping(0x09, MINECRAFT_1_20_2, encodeOnly)
                .mapping(0x08, MINECRAFT_1_21_5, encodeOnly)
                .register();
    }

    private Position position;

    /**
     * Currently there's no built-in way in VeloProtocol to get block state ids.
     *
     * <p>You can still obtain them via <a href="https://minecraft.wiki/w/Tutorials/Running_the_data_generator">data gen</a> ({@code --reports})
     * <br>in {@code generated\reports\blocks.json}
     */
    private int blockStateId;

    private BlockUpdatePacket() {}

    public BlockUpdatePacket(Position position, int blockStateId) {
        this.position = position;
        this.blockStateId = blockStateId;
    }

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        decoded = true;

        position = Position.read(buf);
        blockStateId = ProtocolUtils.readVarInt(buf);
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        position.write(buf);
        ProtocolUtils.writeVarInt(buf, blockStateId);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getBlockStateId() {
        return blockStateId;
    }

    public void setBlockStateId(int blockStateId) {
        this.blockStateId = blockStateId;
    }

}