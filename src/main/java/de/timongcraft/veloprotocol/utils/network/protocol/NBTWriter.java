package de.timongcraft.veloprotocol.utils.network.protocol;

import com.velocitypowered.api.network.ProtocolVersion;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.handler.codec.EncoderException;
import net.kyori.adventure.nbt.BinaryTagTypes;
import net.kyori.adventure.nbt.CompoundBinaryTag;

import java.io.DataOutput;
import java.io.IOException;

public class NBTWriter {

    public static void writeCompound(ByteBuf buf, CompoundBinaryTag tag, ProtocolVersion version) {
        try {
            DataOutput output = new ByteBufOutputStream(buf);
            output.writeByte(BinaryTagTypes.COMPOUND.id());
            if (version.lessThan(ProtocolVersion.MINECRAFT_1_20_2)) {
                output.writeUTF("");
            }
            BinaryTagTypes.COMPOUND.write(tag, output);
        } catch (IOException ignored) {
            throw new EncoderException("Unable to encode NBT CompoundTag");
        }
    }

}