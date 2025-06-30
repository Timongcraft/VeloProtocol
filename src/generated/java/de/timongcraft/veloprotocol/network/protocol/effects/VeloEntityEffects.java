package de.timongcraft.veloprotocol.network.protocol.effects;

import com.velocitypowered.api.network.ProtocolVersion;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.veloprotocol.utils.network.protocol.ProtocolMappingsCache;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class VeloEntityEffects {

    private static final Map<ProtocolVersion, Map<Integer, VeloEntityEffect>> LOADED_VELO_ENTITY_EFFECTS_CACHE = new HashMap<>();

    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect ABSORPTION = load("minecraft:absorption");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect BAD_OMEN = load("minecraft:bad_omen");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect BLINDNESS = load("minecraft:blindness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect CONDUIT_POWER = load("minecraft:conduit_power");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloEntityEffect DARKNESS = load("minecraft:darkness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect DOLPHINS_GRACE = load("minecraft:dolphins_grace");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect FIRE_RESISTANCE = load("minecraft:fire_resistance");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect GLOWING = load("minecraft:glowing");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect HASTE = load("minecraft:haste");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect HEALTH_BOOST = load("minecraft:health_boost");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect HERO_OF_THE_VILLAGE = load("minecraft:hero_of_the_village");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect HUNGER = load("minecraft:hunger");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloEntityEffect INFESTED = load("minecraft:infested");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect INSTANT_DAMAGE = load("minecraft:instant_damage");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect INSTANT_HEALTH = load("minecraft:instant_health");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect INVISIBILITY = load("minecraft:invisibility");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect JUMP_BOOST = load("minecraft:jump_boost");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect LEVITATION = load("minecraft:levitation");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect LUCK = load("minecraft:luck");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect MINING_FATIGUE = load("minecraft:mining_fatigue");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect NAUSEA = load("minecraft:nausea");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect NIGHT_VISION = load("minecraft:night_vision");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloEntityEffect OOZING = load("minecraft:oozing");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect POISON = load("minecraft:poison");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloEntityEffect RAID_OMEN = load("minecraft:raid_omen");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect REGENERATION = load("minecraft:regeneration");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect RESISTANCE = load("minecraft:resistance");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect SATURATION = load("minecraft:saturation");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect SLOW_FALLING = load("minecraft:slow_falling");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect SLOWNESS = load("minecraft:slowness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect SPEED = load("minecraft:speed");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect STRENGTH = load("minecraft:strength");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloEntityEffect TRIAL_OMEN = load("minecraft:trial_omen");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect UNLUCK = load("minecraft:unluck");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect WATER_BREATHING = load("minecraft:water_breathing");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect WEAKNESS = load("minecraft:weakness");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloEntityEffect WEAVING = load("minecraft:weaving");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloEntityEffect WIND_CHARGED = load("minecraft:wind_charged");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloEntityEffect WITHER = load("minecraft:wither");

    public static VeloEntityEffect getFromProtocolId(int protocolId, ProtocolVersion protocolVersion) {
        return LOADED_VELO_ENTITY_EFFECTS_CACHE.get(protocolVersion).get(protocolId);
    }

    private static VeloEntityEffect load(String name) {
        VeloEntityEffect veloEntityEffect = new VeloEntityEffect(name, getProtocolIds(name));

        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_18_2, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_18_2), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_19), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_1, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_19_1), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_3, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_19_3), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_4, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_19_4), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_20), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_2, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_20_2), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_3, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_20_3), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_5, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_20_5), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_21), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_2, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_21_2), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_4, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_21_4), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_5, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_21_5), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_6, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_21_6), veloEntityEffect);
        LOADED_VELO_ENTITY_EFFECTS_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_7, unused -> new HashMap<>())
                .put(veloEntityEffect.getProtocolId(ProtocolVersion.MINECRAFT_1_21_7), veloEntityEffect);

        return veloEntityEffect;
    }

    private static int[] getProtocolIds(String name) {
        ProtocolVersion[] supportedVersions = VeloEntityEffect.SUPPORTED_VERSIONS;
        int[] protocolIds = new int[supportedVersions.length];

        for (int i = 0; i < supportedVersions.length; i++) {
            int nameProtocolId = ProtocolMappingsCache.RESOURCE_PROTOCOL_MAPPINGS.get(supportedVersions[i])
                    .mappings().get("minecraft:mob_effect").getOrDefault(name, -1);
            protocolIds[i] = nameProtocolId;
        }

        return protocolIds;
    }

}