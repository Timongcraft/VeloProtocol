package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.VeloPacket;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.velopacketimpl.utils.annotations.Until;
import de.timongcraft.veloprotocol.network.protocol.effects.VeloEntityEffect;
import de.timongcraft.veloprotocol.network.protocol.effects.VeloEntityEffects;
import io.github._4drian3d.vpacketevents.api.register.PacketRegistration;
import io.netty.buffer.ByteBuf;
import net.kyori.adventure.nbt.BinaryTag;
import net.kyori.adventure.nbt.BinaryTagIO;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * (latest) Resource Id: 'minecraft:update_mob_effect'
 */
@SuppressWarnings("unused")
public class EntityEffectPacket extends VeloPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(EntityEffectPacket.class)
                .direction(ProtocolUtils.Direction.CLIENTBOUND)
                .packetSupplier(EntityEffectPacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x65, MINECRAFT_1_18_2, encodeOnly)
                .mapping(0x66, MINECRAFT_1_19, encodeOnly)
                .mapping(0x69, MINECRAFT_1_19_1, encodeOnly)
                .mapping(0x68, MINECRAFT_1_19_3, encodeOnly)
                .mapping(0x6C, MINECRAFT_1_19_4, encodeOnly)
                .mapping(0x6E, MINECRAFT_1_20_2, encodeOnly)
                .mapping(0x72, MINECRAFT_1_20_3, encodeOnly)
                .mapping(0x76, MINECRAFT_1_20_5, encodeOnly)
                .mapping(0x7D, MINECRAFT_1_21_2, encodeOnly)
                .register();
    }

    private int entityId;
    private VeloEntityEffect effectType;
    private int amplifier;
    private int duration;
    private List<Flag> flags;
    @Since(MINECRAFT_1_19)
    @Until(MINECRAFT_1_20_3)
    private @Nullable BinaryTag factorData;

    public EntityEffectPacket() {}

    public EntityEffectPacket(int entityId, VeloEntityEffect effectType, byte amplifier, int duration, List<Flag> flags, @Nullable BinaryTag factorData) {
        this.entityId = entityId;
        this.effectType = effectType;
        this.amplifier = amplifier;
        this.duration = duration;
        this.flags = flags;
        this.factorData = factorData;
    }

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion protocolVersion) {
        decoded = true;

        entityId = ProtocolUtils.readVarInt(buf);

        effectType = VeloEntityEffects.getFromProtocolId(ProtocolUtils.readVarInt(buf), protocolVersion);

        if (protocolVersion.noGreaterThan(MINECRAFT_1_20_3)) {
            amplifier = buf.readByte();
        } else {
            amplifier = ProtocolUtils.readVarInt(buf);
        }

        duration = ProtocolUtils.readVarInt(buf);

        int flagsBitmask = buf.readUnsignedByte();
        flags = new ArrayList<>();
        for (Flag flag : Flag.values()) {
            if ((flag.getBitmask() & flagsBitmask) == flag.getBitmask()) {
                flags.add(flag);
            }
        }

        if (protocolVersion.noLessThan(MINECRAFT_1_19)
                && protocolVersion.noGreaterThan(MINECRAFT_1_20_3)) {
            if (buf.readBoolean()) {
                factorData = ProtocolUtils.readBinaryTag(buf, protocolVersion, BinaryTagIO.reader());
            }
        }
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion protocolVersion) {
        ProtocolUtils.writeVarInt(buf, entityId);

        ProtocolUtils.writeVarInt(buf, effectType.getProtocolId(protocolVersion));

        if (protocolVersion.noGreaterThan(MINECRAFT_1_20_3)) {
            buf.writeByte(amplifier);
        } else {
            ProtocolUtils.writeVarInt(buf, amplifier);
        }

        ProtocolUtils.writeVarInt(buf, duration);

        int flagsBitmask = 0;
        for (Flag flag : flags) {
            flagsBitmask |= flag.getBitmask();
        }
        buf.writeByte(flagsBitmask);

        if (protocolVersion.noLessThan(MINECRAFT_1_19)
                && protocolVersion.noGreaterThan(MINECRAFT_1_20_3)) {
            buf.writeBoolean(factorData != null);

            if (factorData != null) {
                ProtocolUtils.writeBinaryTag(buf, protocolVersion, factorData);
            }
        }
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

    public int getAmplifier() {
        return amplifier;
    }

    public void setAmplifier(int amplifier) {
        this.amplifier = amplifier;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Flag> getFlags() {
        return flags;
    }

    public void setFlags(List<Flag> flags) {
        this.flags = flags;
    }

    @Since(MINECRAFT_1_19)
    @Until(MINECRAFT_1_20_3)
    @Nullable
    public BinaryTag getFactorData() {
        return factorData;
    }

    @Since(MINECRAFT_1_19)
    @Until(MINECRAFT_1_20_3)
    public void setFactorData(@Nullable BinaryTag factorData) {
        this.factorData = factorData;
    }

    public enum Flag {
        IS_AMBIENT(0x01),
        SHOW_PARTICLES(0x02),
        SHOW_ICON(0x04),
        @Since(MINECRAFT_1_20_5)
        BLEND(0x08);

        private final int bitmask;

        Flag(int bitmask) {
            this.bitmask = bitmask;
        }

        public int getBitmask() {
            return bitmask;
        }
    }

}