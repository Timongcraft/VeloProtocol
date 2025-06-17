package de.timongcraft.veloprotocol.network.protocol.items;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.veloprotocol.utils.network.protocol.NBTWriter;
import io.netty.buffer.ByteBuf;
import net.kyori.adventure.nbt.CompoundBinaryTag;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
@ApiStatus.Internal
@Since(ProtocolVersion.MINECRAFT_1_20_2)
public class VeloItemMeta {

    private @Nullable PlayerHeadMeta playerHeadMeta;
    private @Nullable CustomModelDataMeta customModelDataMeta;

    public void writeComponentChanges(ByteBuf buf, ProtocolVersion version) {
        int componentCount = 0;

        if (playerHeadMeta != null) {
            componentCount++;
        }

        if (customModelDataMeta != null) {
            componentCount++;
        }

        ProtocolUtils.writeVarInt(buf, componentCount);
        ProtocolUtils.writeVarInt(buf, 0); // removed/empty components

        if (playerHeadMeta != null)
            playerHeadMeta.write(buf, version);

        if (customModelDataMeta != null) {
            customModelDataMeta.write(buf, version);
        }
    }

    @Deprecated
    public void writeNbt(ByteBuf buf, ProtocolVersion version) {
        if (playerHeadMeta != null || customModelDataMeta != null) {
            CompoundBinaryTag.Builder rootNbt = CompoundBinaryTag.builder();

            if (playerHeadMeta != null) {
                playerHeadMeta.write(rootNbt, version);
            }

            if (customModelDataMeta != null) {
                customModelDataMeta.write(rootNbt, version);
            }

            NBTWriter.writeCompound(buf, rootNbt.build(), version);
        } else {
            buf.writeByte(0);
        }
    }

    public @Nullable PlayerHeadMeta getPlayerHeadMeta() {
        return playerHeadMeta;
    }

    public VeloItemMeta setPlayerHeadMeta(@Nullable PlayerHeadMeta headMeta) {
        this.playerHeadMeta = headMeta;
        return this;
    }

    public @Nullable CustomModelDataMeta getCustomModelDataMeta() {
        return customModelDataMeta;
    }

    public VeloItemMeta setCustomModelDataMeta(@Nullable CustomModelDataMeta cmdMeta) {
        this.customModelDataMeta = cmdMeta;
        return this;
    }

}