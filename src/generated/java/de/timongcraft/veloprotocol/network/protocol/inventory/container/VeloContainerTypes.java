package de.timongcraft.veloprotocol.network.protocol.inventory.container;

import com.velocitypowered.api.network.ProtocolVersion;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.velopacketimpl.utils.annotations.Until;
import de.timongcraft.veloprotocol.utils.network.protocol.ProtocolMappingsCache;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class VeloContainerTypes {

    private static final Map<ProtocolVersion, Map<Integer, VeloContainerType>> LOADED_VELO_CONTAINER_TYPES_CACHE = new HashMap<>();

    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType ANVIL = load("minecraft:anvil");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType BEACON = load("minecraft:beacon");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType BLAST_FURNACE = load("minecraft:blast_furnace");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType BREWING_STAND = load("minecraft:brewing_stand");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType CARTOGRAPHY_TABLE = load("minecraft:cartography_table");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloContainerType CRAFTER_3X3 = load("minecraft:crafter_3x3");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType CRAFTING = load("minecraft:crafting");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType ENCHANTMENT = load("minecraft:enchantment");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType FURNACE = load("minecraft:furnace");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType GENERIC_3X3 = load("minecraft:generic_3x3");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType GENERIC_9X1 = load("minecraft:generic_9x1");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType GENERIC_9X2 = load("minecraft:generic_9x2");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType GENERIC_9X3 = load("minecraft:generic_9x3");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType GENERIC_9X4 = load("minecraft:generic_9x4");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType GENERIC_9X5 = load("minecraft:generic_9x5");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType GENERIC_9X6 = load("minecraft:generic_9x6");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType GRINDSTONE = load("minecraft:grindstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType HOPPER = load("minecraft:hopper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType LECTERN = load("minecraft:lectern");
    @Since(ProtocolVersion.MINECRAFT_1_19_4) @Until(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloContainerType LEGACY_SMITHING = load("minecraft:legacy_smithing");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType LOOM = load("minecraft:loom");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType MERCHANT = load("minecraft:merchant");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType SHULKER_BOX = load("minecraft:shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType SMITHING = load("minecraft:smithing");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType SMOKER = load("minecraft:smoker");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloContainerType STONECUTTER = load("minecraft:stonecutter");

    public static VeloContainerType getFromProtocolId(int protocolId, ProtocolVersion version) {
        return LOADED_VELO_CONTAINER_TYPES_CACHE.get(version).get(protocolId);
    }

    private static VeloContainerType load(String name) {
        VeloContainerType veloContainerType = new VeloContainerType(name, getProtocolIds(name));

        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_18_2, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_18_2), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_19), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_1, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_19_1), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_3, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_19_3), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_4, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_19_4), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_20), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_2, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_20_2), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_3, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_20_3), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_5, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_20_5), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_21), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_2, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_2), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_4, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_4), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_5, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_5), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_6, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_6), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_7, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_7), veloContainerType);
        LOADED_VELO_CONTAINER_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_9, unused -> new HashMap<>())
                .put(veloContainerType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_9), veloContainerType);

        return veloContainerType;
    }

    private static int[] getProtocolIds(String name) {
        ProtocolVersion[] supportedVersions = VeloContainerType.SUPPORTED_VERSIONS;
        int[] protocolIds = new int[supportedVersions.length];

        for (int i = 0; i < supportedVersions.length; i++) {
            int nameProtocolId = ProtocolMappingsCache.RESOURCE_PROTOCOL_MAPPINGS.get(supportedVersions[i])
                    .mappings().get("minecraft:menu").getOrDefault(name, -1);
            protocolIds[i] = nameProtocolId;
        }

        return protocolIds;
    }

}