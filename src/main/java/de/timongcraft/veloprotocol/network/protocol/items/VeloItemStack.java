package de.timongcraft.veloprotocol.network.protocol.items;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import io.netty.buffer.ByteBuf;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

//todo: see temp commit
@ApiStatus.Internal
@Since(ProtocolVersion.MINECRAFT_1_20_2) // soon probably only 1.20.5+
public final class VeloItemStack {

    public static VeloItemStack of(VeloItemType itemType) {
        return new VeloItemStack(itemType, 1, null);
    }

    public static VeloItemStack of(VeloItemType itemType, int amount) {
        return new VeloItemStack(itemType, amount, null);
    }

    public static VeloItemStack of(VeloItemType itemType, int amount, VeloItemMeta meta) {
        return new VeloItemStack(itemType, amount, meta);
    }

    public static VeloItemStack of(ByteBuf buf, ProtocolVersion version) {
        //todo
        throw new UnsupportedOperationException("Not implemented");
    }

    private final VeloItemType itemType;
    private int amount;
    private final @Nullable VeloItemMeta meta;

    public VeloItemStack(VeloItemType itemType, int amount, @Nullable VeloItemMeta meta) {
        this.itemType = itemType;
        this.amount = amount;
        this.meta = meta;
    }

    public static void write(ByteBuf buf, VeloItemStack item, ProtocolVersion version) {
        if (version.greaterThan(ProtocolVersion.MINECRAFT_1_20_3)) {
            if (item == null) {
                ProtocolUtils.writeVarInt(buf, 0);
            } else {
                ProtocolUtils.writeVarInt(buf, item.amount);
                ProtocolUtils.writeVarInt(buf, item.itemType.getProtocolId(version));
                if (item.meta == null) {
                    ProtocolUtils.writeVarInt(buf, 0);
                    ProtocolUtils.writeVarInt(buf, 0);
                } else {
                    item.meta.writeComponentChanges(buf, version);
                }
            }
        } else {
            buf.writeBoolean(item != null);
            if (item != null) {
                ProtocolUtils.writeVarInt(buf, item.itemType.getProtocolId(version));
                buf.writeByte(item.amount);
                if (item.meta == null) {
                    buf.writeByte(0);
                } else {
                    item.meta.writeNbt(buf, version);
                }
            }
        }
    }

    public VeloItemType getItemType() {
        return itemType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public @Nullable VeloItemMeta getMeta() {
        return meta;
    }

}