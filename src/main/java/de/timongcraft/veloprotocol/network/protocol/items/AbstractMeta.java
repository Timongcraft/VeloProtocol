package de.timongcraft.veloprotocol.network.protocol.items;

import com.velocitypowered.api.network.ProtocolVersion;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import io.netty.buffer.ByteBuf;
import net.kyori.adventure.nbt.CompoundBinaryTag;

import java.util.Objects;

@Since(ProtocolVersion.MINECRAFT_1_20_2)
public abstract class AbstractMeta {

    public void write(ByteBuf buf, ProtocolVersion version) {
        if (version.noGreaterThan(ProtocolVersion.MINECRAFT_1_20_3)) {
            throw new IllegalArgumentException("Data can only be directly written in >=766");
        }

        write(buf, null, version);
    }

    @Deprecated
    public void write(CompoundBinaryTag.Builder rootNbt, ProtocolVersion version) {
        if (version.greaterThan(ProtocolVersion.MINECRAFT_1_20_3)) {
            throw new IllegalArgumentException("Data can only be written to nbt in <=765");
        }

        write(null, rootNbt, version);
    }

    public void write(ByteBuf buf, CompoundBinaryTag.Builder rootNbt, ProtocolVersion version) {
        if (version.greaterThan(ProtocolVersion.MINECRAFT_1_20_3)) {
            Objects.requireNonNull(buf, "Data needs to be directly written in >=766");

            writeComponent(buf, version);
        } else {
            Objects.requireNonNull(rootNbt, "Data needs to be written to nbt in <=765");

            writeNbt(rootNbt, version);
        }
    }

    protected abstract void writeComponent(ByteBuf buf, ProtocolVersion version);

    @Deprecated
    protected abstract void writeNbt(CompoundBinaryTag.Builder rootNbt, ProtocolVersion version);

}