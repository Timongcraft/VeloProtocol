package de.timongcraft.veloprotocol.network.protocol.blockentities;

import com.velocitypowered.api.network.ProtocolVersion;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.velopacketimpl.utils.annotations.Until;
import de.timongcraft.veloprotocol.utils.network.protocol.ProtocolMappingsCache;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class VeloBlockEntityTypes {

    private static final Map<ProtocolVersion, Map<Integer, VeloBlockEntityType>> LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE = new HashMap<>();

    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType BANNER = load("minecraft:banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType BARREL = load("minecraft:barrel");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType BEACON = load("minecraft:beacon");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType BED = load("minecraft:bed");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType BEEHIVE = load("minecraft:beehive");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType BELL = load("minecraft:bell");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType BLAST_FURNACE = load("minecraft:blast_furnace");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType BREWING_STAND = load("minecraft:brewing_stand");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloBlockEntityType BRUSHABLE_BLOCK = load("minecraft:brushable_block");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloBlockEntityType CALIBRATED_SCULK_SENSOR = load("minecraft:calibrated_sculk_sensor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType CAMPFIRE = load("minecraft:campfire");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType CHEST = load("minecraft:chest");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloBlockEntityType CHISELED_BOOKSHELF = load("minecraft:chiseled_bookshelf");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType COMMAND_BLOCK = load("minecraft:command_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType COMPARATOR = load("minecraft:comparator");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType CONDUIT = load("minecraft:conduit");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloBlockEntityType CRAFTER = load("minecraft:crafter");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloBlockEntityType CREAKING_HEART = load("minecraft:creaking_heart");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType DAYLIGHT_DETECTOR = load("minecraft:daylight_detector");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloBlockEntityType DECORATED_POT = load("minecraft:decorated_pot");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType DISPENSER = load("minecraft:dispenser");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType DROPPER = load("minecraft:dropper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType ENCHANTING_TABLE = load("minecraft:enchanting_table");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType END_GATEWAY = load("minecraft:end_gateway");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType END_PORTAL = load("minecraft:end_portal");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType ENDER_CHEST = load("minecraft:ender_chest");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType FURNACE = load("minecraft:furnace");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloBlockEntityType HANGING_SIGN = load("minecraft:hanging_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType HOPPER = load("minecraft:hopper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType JIGSAW = load("minecraft:jigsaw");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType JUKEBOX = load("minecraft:jukebox");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType LECTERN = load("minecraft:lectern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType MOB_SPAWNER = load("minecraft:mob_spawner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType PISTON = load("minecraft:piston");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloBlockEntityType SCULK_CATALYST = load("minecraft:sculk_catalyst");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType SCULK_SENSOR = load("minecraft:sculk_sensor");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloBlockEntityType SCULK_SHRIEKER = load("minecraft:sculk_shrieker");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType SHULKER_BOX = load("minecraft:shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType SIGN = load("minecraft:sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType SKULL = load("minecraft:skull");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType SMOKER = load("minecraft:smoker");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType STRUCTURE_BLOCK = load("minecraft:structure_block");
    @Since(ProtocolVersion.MINECRAFT_1_19_4) @Until(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloBlockEntityType SUSPICIOUS_SAND = load("minecraft:suspicious_sand");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloBlockEntityType TEST_BLOCK = load("minecraft:test_block");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloBlockEntityType TEST_INSTANCE_BLOCK = load("minecraft:test_instance_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloBlockEntityType TRAPPED_CHEST = load("minecraft:trapped_chest");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloBlockEntityType TRIAL_SPAWNER = load("minecraft:trial_spawner");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloBlockEntityType VAULT = load("minecraft:vault");

    public static VeloBlockEntityType getFromProtocolId(int protocolId, ProtocolVersion protocolVersion) {
        return LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.get(protocolVersion).get(protocolId);
    }

    private static VeloBlockEntityType load(String name) {
        VeloBlockEntityType veloBlockEntityType = new VeloBlockEntityType(name, getProtocolIds(name));

        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_18_2, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_18_2), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_19), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_1, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_19_1), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_3, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_19_3), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_4, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_19_4), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_20), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_2, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_20_2), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_3, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_20_3), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_5, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_20_5), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_21), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_2, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_2), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_4, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_4), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_5, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_5), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_6, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_6), veloBlockEntityType);
        LOADED_VELO_BLOCK_ENTITY_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_7, unused -> new HashMap<>())
                .put(veloBlockEntityType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_7), veloBlockEntityType);

        return veloBlockEntityType;
    }

    private static int[] getProtocolIds(String name) {
        ProtocolVersion[] supportedVersions = VeloBlockEntityType.SUPPORTED_VERSIONS;
        int[] protocolIds = new int[supportedVersions.length];

        for (int i = 0; i < supportedVersions.length; i++) {
            int nameProtocolId = ProtocolMappingsCache.RESOURCE_PROTOCOL_MAPPINGS.get(supportedVersions[i])
                    .mappings().get("minecraft:block_entity_type").getOrDefault(name, -1);
            protocolIds[i] = nameProtocolId;
        }

        return protocolIds;
    }

}