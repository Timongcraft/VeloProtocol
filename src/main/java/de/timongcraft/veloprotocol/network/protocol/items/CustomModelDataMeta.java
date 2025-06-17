package de.timongcraft.veloprotocol.network.protocol.items;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.veloprotocol.network.protocol.datacomponents.VeloDataComponentTypes;
import io.netty.buffer.ByteBuf;
import net.kyori.adventure.nbt.CompoundBinaryTag;

@SuppressWarnings("unused")
@Since(ProtocolVersion.MINECRAFT_1_20_2)
public class CustomModelDataMeta extends AbstractMeta {

    private int customModelData;

    public CustomModelDataMeta(int customModelData) {
        this.customModelData = customModelData;
    }

    @Override
    protected void writeComponent(ByteBuf buf, ProtocolVersion version) {
        ProtocolUtils.writeVarInt(buf, VeloDataComponentTypes.CUSTOM_MODEL_DATA.getProtocolId(version));

        if (version.lessThan(ProtocolVersion.MINECRAFT_1_21_4)) {
            ProtocolUtils.writeVarInt(buf, customModelData);
        }
    }

    @Override
    protected void writeNbt(CompoundBinaryTag.Builder rootNbt, ProtocolVersion version) {
        rootNbt.putInt("CustomModelData", customModelData);
    }

    public int getCustomModelData() {
        return customModelData;
    }

    public CustomModelDataMeta setCustomModelData(int customModelData) {
        this.customModelData = customModelData;
        return this;
    }

}