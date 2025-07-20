package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.VeloPacket;
import de.timongcraft.veloprotocol.network.protocol.effects.VeloEntityEffect;
import de.timongcraft.veloprotocol.network.protocol.effects.VeloEntityEffects;
import io.github._4drian3d.vpacketevents.api.register.PacketRegistration;
import io.netty.buffer.ByteBuf;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * (latest) Resource Id: 'minecraft:remove_mob_effect'
 */
@SuppressWarnings("unused")
public class RemoveEntityEffectPacket extends VeloPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(RemoveEntityEffectPacket.class)
                .direction(ProtocolUtils.Direction.CLIENTBOUND)
                .packetSupplier(RemoveEntityEffectPacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x3B, MINECRAFT_1_18_2, encodeOnly)
                .mapping(0x39, MINECRAFT_1_19, encodeOnly)
                .mapping(0x3C, MINECRAFT_1_19_1, encodeOnly)
                .mapping(0x3B, MINECRAFT_1_19_3, encodeOnly)
                .mapping(0x3F, MINECRAFT_1_19_4, encodeOnly)
                .mapping(0x41, MINECRAFT_1_20_2, encodeOnly)
                .mapping(0x43, MINECRAFT_1_20_5, encodeOnly)
                .mapping(0x48, MINECRAFT_1_21_2, encodeOnly)
                .mapping(0x47, MINECRAFT_1_21_5, encodeOnly)
                .register();
    }

    private int entityId;
    private VeloEntityEffect effectType;

    private RemoveEntityEffectPacket() {}

    public RemoveEntityEffectPacket(int entityId, VeloEntityEffect effectType) {
        this.entityId = entityId;
        this.effectType = effectType;
    }

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        decoded = true;

        entityId = ProtocolUtils.readVarInt(buf);

        effectType = VeloEntityEffects.getFromProtocolId(ProtocolUtils.readVarInt(buf), version);
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        ProtocolUtils.writeVarInt(buf, entityId);

        ProtocolUtils.writeVarInt(buf, effectType.getProtocolId(version));
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public VeloEntityEffect getEffectType() {
        return effectType;
    }

    public void setEffectType(VeloEntityEffect effectType) {
        this.effectType = effectType;
    }

}