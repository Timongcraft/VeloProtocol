package de.timongcraft.veloprotocol.network.protocol.inventory.item;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import de.timongcraft.veloprotocol.network.protocol.datacomponents.VeloDataComponentType;
import io.netty.buffer.ByteBuf;

public interface ComponentData {

    static void writeNonValued(VeloDataComponentType type, ByteBuf buf, ProtocolVersion version) {
        ProtocolUtils.writeVarInt(buf, type.getProtocolId(version));
    }

    default void write(ByteBuf buf, ProtocolVersion version) {
        writeNonValued(getType(), buf, version);
    }

    VeloDataComponentType getType();

}