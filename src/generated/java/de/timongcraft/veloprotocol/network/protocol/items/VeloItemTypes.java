package de.timongcraft.veloprotocol.network.protocol.items;

import com.velocitypowered.api.network.ProtocolVersion;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.velopacketimpl.utils.annotations.Until;
import de.timongcraft.veloprotocol.utils.network.protocol.ProtocolMappingsCache;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class VeloItemTypes {

    private static final Map<ProtocolVersion, Map<Integer, VeloItemType>> LOADED_VELO_ITEM_TYPES_CACHE = new HashMap<>();

    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_BOAT = load("minecraft:acacia_boat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_BUTTON = load("minecraft:acacia_button");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType ACACIA_CHEST_BOAT = load("minecraft:acacia_chest_boat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_DOOR = load("minecraft:acacia_door");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_FENCE = load("minecraft:acacia_fence");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_FENCE_GATE = load("minecraft:acacia_fence_gate");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType ACACIA_HANGING_SIGN = load("minecraft:acacia_hanging_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_LEAVES = load("minecraft:acacia_leaves");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_LOG = load("minecraft:acacia_log");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_PLANKS = load("minecraft:acacia_planks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_PRESSURE_PLATE = load("minecraft:acacia_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_SAPLING = load("minecraft:acacia_sapling");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_SIGN = load("minecraft:acacia_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_SLAB = load("minecraft:acacia_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_STAIRS = load("minecraft:acacia_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_TRAPDOOR = load("minecraft:acacia_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACACIA_WOOD = load("minecraft:acacia_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ACTIVATOR_RAIL = load("minecraft:activator_rail");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType AIR = load("minecraft:air");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType ALLAY_SPAWN_EGG = load("minecraft:allay_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ALLIUM = load("minecraft:allium");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType AMETHYST_BLOCK = load("minecraft:amethyst_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType AMETHYST_CLUSTER = load("minecraft:amethyst_cluster");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType AMETHYST_SHARD = load("minecraft:amethyst_shard");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ANCIENT_DEBRIS = load("minecraft:ancient_debris");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ANDESITE = load("minecraft:andesite");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ANDESITE_SLAB = load("minecraft:andesite_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ANDESITE_STAIRS = load("minecraft:andesite_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ANDESITE_WALL = load("minecraft:andesite_wall");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType ANGLER_POTTERY_SHERD = load("minecraft:angler_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ANVIL = load("minecraft:anvil");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType APPLE = load("minecraft:apple");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType ARCHER_POTTERY_SHERD = load("minecraft:archer_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType ARMADILLO_SCUTE = load("minecraft:armadillo_scute");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType ARMADILLO_SPAWN_EGG = load("minecraft:armadillo_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ARMOR_STAND = load("minecraft:armor_stand");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType ARMS_UP_POTTERY_SHERD = load("minecraft:arms_up_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ARROW = load("minecraft:arrow");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType AXOLOTL_BUCKET = load("minecraft:axolotl_bucket");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType AXOLOTL_SPAWN_EGG = load("minecraft:axolotl_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType AZALEA = load("minecraft:azalea");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType AZALEA_LEAVES = load("minecraft:azalea_leaves");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType AZURE_BLUET = load("minecraft:azure_bluet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BAKED_POTATO = load("minecraft:baked_potato");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BAMBOO = load("minecraft:bamboo");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_BLOCK = load("minecraft:bamboo_block");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_BUTTON = load("minecraft:bamboo_button");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_CHEST_RAFT = load("minecraft:bamboo_chest_raft");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_DOOR = load("minecraft:bamboo_door");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_FENCE = load("minecraft:bamboo_fence");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_FENCE_GATE = load("minecraft:bamboo_fence_gate");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_HANGING_SIGN = load("minecraft:bamboo_hanging_sign");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_MOSAIC = load("minecraft:bamboo_mosaic");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_MOSAIC_SLAB = load("minecraft:bamboo_mosaic_slab");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_MOSAIC_STAIRS = load("minecraft:bamboo_mosaic_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_PLANKS = load("minecraft:bamboo_planks");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_PRESSURE_PLATE = load("minecraft:bamboo_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_RAFT = load("minecraft:bamboo_raft");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_SIGN = load("minecraft:bamboo_sign");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_SLAB = load("minecraft:bamboo_slab");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_STAIRS = load("minecraft:bamboo_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BAMBOO_TRAPDOOR = load("minecraft:bamboo_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BARREL = load("minecraft:barrel");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BARRIER = load("minecraft:barrier");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BASALT = load("minecraft:basalt");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BAT_SPAWN_EGG = load("minecraft:bat_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BEACON = load("minecraft:beacon");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BEDROCK = load("minecraft:bedrock");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BEE_NEST = load("minecraft:bee_nest");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BEE_SPAWN_EGG = load("minecraft:bee_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BEEF = load("minecraft:beef");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BEEHIVE = load("minecraft:beehive");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BEETROOT = load("minecraft:beetroot");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BEETROOT_SEEDS = load("minecraft:beetroot_seeds");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BEETROOT_SOUP = load("minecraft:beetroot_soup");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BELL = load("minecraft:bell");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIG_DRIPLEAF = load("minecraft:big_dripleaf");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_BOAT = load("minecraft:birch_boat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_BUTTON = load("minecraft:birch_button");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType BIRCH_CHEST_BOAT = load("minecraft:birch_chest_boat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_DOOR = load("minecraft:birch_door");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_FENCE = load("minecraft:birch_fence");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_FENCE_GATE = load("minecraft:birch_fence_gate");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType BIRCH_HANGING_SIGN = load("minecraft:birch_hanging_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_LEAVES = load("minecraft:birch_leaves");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_LOG = load("minecraft:birch_log");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_PLANKS = load("minecraft:birch_planks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_PRESSURE_PLATE = load("minecraft:birch_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_SAPLING = load("minecraft:birch_sapling");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_SIGN = load("minecraft:birch_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_SLAB = load("minecraft:birch_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_STAIRS = load("minecraft:birch_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_TRAPDOOR = load("minecraft:birch_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BIRCH_WOOD = load("minecraft:birch_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACK_BANNER = load("minecraft:black_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACK_BED = load("minecraft:black_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType BLACK_BUNDLE = load("minecraft:black_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACK_CANDLE = load("minecraft:black_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACK_CARPET = load("minecraft:black_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACK_CONCRETE = load("minecraft:black_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACK_CONCRETE_POWDER = load("minecraft:black_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACK_DYE = load("minecraft:black_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACK_GLAZED_TERRACOTTA = load("minecraft:black_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType BLACK_HARNESS = load("minecraft:black_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACK_SHULKER_BOX = load("minecraft:black_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACK_STAINED_GLASS = load("minecraft:black_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACK_STAINED_GLASS_PANE = load("minecraft:black_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACK_TERRACOTTA = load("minecraft:black_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACK_WOOL = load("minecraft:black_wool");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACKSTONE = load("minecraft:blackstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACKSTONE_SLAB = load("minecraft:blackstone_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACKSTONE_STAIRS = load("minecraft:blackstone_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLACKSTONE_WALL = load("minecraft:blackstone_wall");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType BLADE_POTTERY_SHERD = load("minecraft:blade_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLAST_FURNACE = load("minecraft:blast_furnace");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLAZE_POWDER = load("minecraft:blaze_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLAZE_ROD = load("minecraft:blaze_rod");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLAZE_SPAWN_EGG = load("minecraft:blaze_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_BANNER = load("minecraft:blue_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_BED = load("minecraft:blue_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType BLUE_BUNDLE = load("minecraft:blue_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_CANDLE = load("minecraft:blue_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_CARPET = load("minecraft:blue_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_CONCRETE = load("minecraft:blue_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_CONCRETE_POWDER = load("minecraft:blue_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_DYE = load("minecraft:blue_dye");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloItemType BLUE_EGG = load("minecraft:blue_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_GLAZED_TERRACOTTA = load("minecraft:blue_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType BLUE_HARNESS = load("minecraft:blue_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_ICE = load("minecraft:blue_ice");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_ORCHID = load("minecraft:blue_orchid");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_SHULKER_BOX = load("minecraft:blue_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_STAINED_GLASS = load("minecraft:blue_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_STAINED_GLASS_PANE = load("minecraft:blue_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_TERRACOTTA = load("minecraft:blue_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BLUE_WOOL = load("minecraft:blue_wool");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType BOGGED_SPAWN_EGG = load("minecraft:bogged_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType BOLT_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:bolt_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BONE = load("minecraft:bone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BONE_BLOCK = load("minecraft:bone_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BONE_MEAL = load("minecraft:bone_meal");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BOOK = load("minecraft:book");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BOOKSHELF = load("minecraft:bookshelf");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType BORDURE_INDENTED_BANNER_PATTERN = load("minecraft:bordure_indented_banner_pattern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BOW = load("minecraft:bow");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BOWL = load("minecraft:bowl");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BRAIN_CORAL = load("minecraft:brain_coral");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BRAIN_CORAL_BLOCK = load("minecraft:brain_coral_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BRAIN_CORAL_FAN = load("minecraft:brain_coral_fan");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BREAD = load("minecraft:bread");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType BREEZE_ROD = load("minecraft:breeze_rod");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType BREEZE_SPAWN_EGG = load("minecraft:breeze_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType BREWER_POTTERY_SHERD = load("minecraft:brewer_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BREWING_STAND = load("minecraft:brewing_stand");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BRICK = load("minecraft:brick");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BRICK_SLAB = load("minecraft:brick_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BRICK_STAIRS = load("minecraft:brick_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BRICK_WALL = load("minecraft:brick_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BRICKS = load("minecraft:bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_BANNER = load("minecraft:brown_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_BED = load("minecraft:brown_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType BROWN_BUNDLE = load("minecraft:brown_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_CANDLE = load("minecraft:brown_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_CARPET = load("minecraft:brown_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_CONCRETE = load("minecraft:brown_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_CONCRETE_POWDER = load("minecraft:brown_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_DYE = load("minecraft:brown_dye");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloItemType BROWN_EGG = load("minecraft:brown_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_GLAZED_TERRACOTTA = load("minecraft:brown_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType BROWN_HARNESS = load("minecraft:brown_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_MUSHROOM = load("minecraft:brown_mushroom");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_MUSHROOM_BLOCK = load("minecraft:brown_mushroom_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_SHULKER_BOX = load("minecraft:brown_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_STAINED_GLASS = load("minecraft:brown_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_STAINED_GLASS_PANE = load("minecraft:brown_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_TERRACOTTA = load("minecraft:brown_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BROWN_WOOL = load("minecraft:brown_wool");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType BRUSH = load("minecraft:brush");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BUBBLE_CORAL = load("minecraft:bubble_coral");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BUBBLE_CORAL_BLOCK = load("minecraft:bubble_coral_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BUBBLE_CORAL_FAN = load("minecraft:bubble_coral_fan");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BUCKET = load("minecraft:bucket");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BUDDING_AMETHYST = load("minecraft:budding_amethyst");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType BUNDLE = load("minecraft:bundle");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType BURN_POTTERY_SHERD = load("minecraft:burn_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloItemType BUSH = load("minecraft:bush");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CACTUS = load("minecraft:cactus");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloItemType CACTUS_FLOWER = load("minecraft:cactus_flower");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CAKE = load("minecraft:cake");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CALCITE = load("minecraft:calcite");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType CALIBRATED_SCULK_SENSOR = load("minecraft:calibrated_sculk_sensor");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType CAMEL_SPAWN_EGG = load("minecraft:camel_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CAMPFIRE = load("minecraft:campfire");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CANDLE = load("minecraft:candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CARROT = load("minecraft:carrot");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CARROT_ON_A_STICK = load("minecraft:carrot_on_a_stick");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CARTOGRAPHY_TABLE = load("minecraft:cartography_table");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CARVED_PUMPKIN = load("minecraft:carved_pumpkin");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CAT_SPAWN_EGG = load("minecraft:cat_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CAULDRON = load("minecraft:cauldron");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CAVE_SPIDER_SPAWN_EGG = load("minecraft:cave_spider_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHAIN = load("minecraft:chain");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHAIN_COMMAND_BLOCK = load("minecraft:chain_command_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHAINMAIL_BOOTS = load("minecraft:chainmail_boots");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHAINMAIL_CHESTPLATE = load("minecraft:chainmail_chestplate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHAINMAIL_HELMET = load("minecraft:chainmail_helmet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHAINMAIL_LEGGINGS = load("minecraft:chainmail_leggings");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHARCOAL = load("minecraft:charcoal");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_BOAT = load("minecraft:cherry_boat");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_BUTTON = load("minecraft:cherry_button");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_CHEST_BOAT = load("minecraft:cherry_chest_boat");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_DOOR = load("minecraft:cherry_door");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_FENCE = load("minecraft:cherry_fence");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_FENCE_GATE = load("minecraft:cherry_fence_gate");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_HANGING_SIGN = load("minecraft:cherry_hanging_sign");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_LEAVES = load("minecraft:cherry_leaves");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_LOG = load("minecraft:cherry_log");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_PLANKS = load("minecraft:cherry_planks");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_PRESSURE_PLATE = load("minecraft:cherry_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_SAPLING = load("minecraft:cherry_sapling");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_SIGN = load("minecraft:cherry_sign");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_SLAB = load("minecraft:cherry_slab");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_STAIRS = load("minecraft:cherry_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_TRAPDOOR = load("minecraft:cherry_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType CHERRY_WOOD = load("minecraft:cherry_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHEST = load("minecraft:chest");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHEST_MINECART = load("minecraft:chest_minecart");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHICKEN = load("minecraft:chicken");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHICKEN_SPAWN_EGG = load("minecraft:chicken_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHIPPED_ANVIL = load("minecraft:chipped_anvil");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType CHISELED_BOOKSHELF = load("minecraft:chiseled_bookshelf");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType CHISELED_COPPER = load("minecraft:chiseled_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHISELED_DEEPSLATE = load("minecraft:chiseled_deepslate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHISELED_NETHER_BRICKS = load("minecraft:chiseled_nether_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHISELED_POLISHED_BLACKSTONE = load("minecraft:chiseled_polished_blackstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHISELED_QUARTZ_BLOCK = load("minecraft:chiseled_quartz_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHISELED_RED_SANDSTONE = load("minecraft:chiseled_red_sandstone");
    @Since(ProtocolVersion.MINECRAFT_1_21_4)
    public static final VeloItemType CHISELED_RESIN_BRICKS = load("minecraft:chiseled_resin_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHISELED_SANDSTONE = load("minecraft:chiseled_sandstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHISELED_STONE_BRICKS = load("minecraft:chiseled_stone_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType CHISELED_TUFF = load("minecraft:chiseled_tuff");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType CHISELED_TUFF_BRICKS = load("minecraft:chiseled_tuff_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHORUS_FLOWER = load("minecraft:chorus_flower");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHORUS_FRUIT = load("minecraft:chorus_fruit");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CHORUS_PLANT = load("minecraft:chorus_plant");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CLAY = load("minecraft:clay");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CLAY_BALL = load("minecraft:clay_ball");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CLOCK = load("minecraft:clock");
    @Since(ProtocolVersion.MINECRAFT_1_21_4)
    public static final VeloItemType CLOSED_EYEBLOSSOM = load("minecraft:closed_eyeblossom");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COAL = load("minecraft:coal");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COAL_BLOCK = load("minecraft:coal_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COAL_ORE = load("minecraft:coal_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COARSE_DIRT = load("minecraft:coarse_dirt");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType COAST_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:coast_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COBBLED_DEEPSLATE = load("minecraft:cobbled_deepslate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COBBLED_DEEPSLATE_SLAB = load("minecraft:cobbled_deepslate_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COBBLED_DEEPSLATE_STAIRS = load("minecraft:cobbled_deepslate_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COBBLED_DEEPSLATE_WALL = load("minecraft:cobbled_deepslate_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COBBLESTONE = load("minecraft:cobblestone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COBBLESTONE_SLAB = load("minecraft:cobblestone_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COBBLESTONE_STAIRS = load("minecraft:cobblestone_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COBBLESTONE_WALL = load("minecraft:cobblestone_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COBWEB = load("minecraft:cobweb");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COCOA_BEANS = load("minecraft:cocoa_beans");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COD = load("minecraft:cod");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COD_BUCKET = load("minecraft:cod_bucket");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COD_SPAWN_EGG = load("minecraft:cod_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COMMAND_BLOCK = load("minecraft:command_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COMMAND_BLOCK_MINECART = load("minecraft:command_block_minecart");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COMPARATOR = load("minecraft:comparator");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COMPASS = load("minecraft:compass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COMPOSTER = load("minecraft:composter");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CONDUIT = load("minecraft:conduit");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COOKED_BEEF = load("minecraft:cooked_beef");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COOKED_CHICKEN = load("minecraft:cooked_chicken");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COOKED_COD = load("minecraft:cooked_cod");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COOKED_MUTTON = load("minecraft:cooked_mutton");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COOKED_PORKCHOP = load("minecraft:cooked_porkchop");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COOKED_RABBIT = load("minecraft:cooked_rabbit");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COOKED_SALMON = load("minecraft:cooked_salmon");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COOKIE = load("minecraft:cookie");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COPPER_BLOCK = load("minecraft:copper_block");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType COPPER_BULB = load("minecraft:copper_bulb");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType COPPER_DOOR = load("minecraft:copper_door");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType COPPER_GRATE = load("minecraft:copper_grate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COPPER_INGOT = load("minecraft:copper_ingot");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COPPER_ORE = load("minecraft:copper_ore");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType COPPER_TRAPDOOR = load("minecraft:copper_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CORNFLOWER = load("minecraft:cornflower");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType COW_SPAWN_EGG = load("minecraft:cow_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRACKED_DEEPSLATE_BRICKS = load("minecraft:cracked_deepslate_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRACKED_DEEPSLATE_TILES = load("minecraft:cracked_deepslate_tiles");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRACKED_NETHER_BRICKS = load("minecraft:cracked_nether_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRACKED_POLISHED_BLACKSTONE_BRICKS = load("minecraft:cracked_polished_blackstone_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRACKED_STONE_BRICKS = load("minecraft:cracked_stone_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType CRAFTER = load("minecraft:crafter");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRAFTING_TABLE = load("minecraft:crafting_table");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType CREAKING_HEART = load("minecraft:creaking_heart");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType CREAKING_SPAWN_EGG = load("minecraft:creaking_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CREEPER_BANNER_PATTERN = load("minecraft:creeper_banner_pattern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CREEPER_HEAD = load("minecraft:creeper_head");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CREEPER_SPAWN_EGG = load("minecraft:creeper_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_BUTTON = load("minecraft:crimson_button");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_DOOR = load("minecraft:crimson_door");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_FENCE = load("minecraft:crimson_fence");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_FENCE_GATE = load("minecraft:crimson_fence_gate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_FUNGUS = load("minecraft:crimson_fungus");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType CRIMSON_HANGING_SIGN = load("minecraft:crimson_hanging_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_HYPHAE = load("minecraft:crimson_hyphae");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_NYLIUM = load("minecraft:crimson_nylium");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_PLANKS = load("minecraft:crimson_planks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_PRESSURE_PLATE = load("minecraft:crimson_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_ROOTS = load("minecraft:crimson_roots");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_SIGN = load("minecraft:crimson_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_SLAB = load("minecraft:crimson_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_STAIRS = load("minecraft:crimson_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_STEM = load("minecraft:crimson_stem");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRIMSON_TRAPDOOR = load("minecraft:crimson_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CROSSBOW = load("minecraft:crossbow");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CRYING_OBSIDIAN = load("minecraft:crying_obsidian");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CUT_COPPER = load("minecraft:cut_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CUT_COPPER_SLAB = load("minecraft:cut_copper_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CUT_COPPER_STAIRS = load("minecraft:cut_copper_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CUT_RED_SANDSTONE = load("minecraft:cut_red_sandstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CUT_RED_SANDSTONE_SLAB = load("minecraft:cut_red_sandstone_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CUT_SANDSTONE = load("minecraft:cut_sandstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CUT_SANDSTONE_SLAB = load("minecraft:cut_sandstone_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CYAN_BANNER = load("minecraft:cyan_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CYAN_BED = load("minecraft:cyan_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType CYAN_BUNDLE = load("minecraft:cyan_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CYAN_CANDLE = load("minecraft:cyan_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CYAN_CARPET = load("minecraft:cyan_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CYAN_CONCRETE = load("minecraft:cyan_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CYAN_CONCRETE_POWDER = load("minecraft:cyan_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CYAN_DYE = load("minecraft:cyan_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CYAN_GLAZED_TERRACOTTA = load("minecraft:cyan_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType CYAN_HARNESS = load("minecraft:cyan_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CYAN_SHULKER_BOX = load("minecraft:cyan_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CYAN_STAINED_GLASS = load("minecraft:cyan_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CYAN_STAINED_GLASS_PANE = load("minecraft:cyan_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CYAN_TERRACOTTA = load("minecraft:cyan_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType CYAN_WOOL = load("minecraft:cyan_wool");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DAMAGED_ANVIL = load("minecraft:damaged_anvil");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DANDELION = load("minecraft:dandelion");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType DANGER_POTTERY_SHERD = load("minecraft:danger_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_BOAT = load("minecraft:dark_oak_boat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_BUTTON = load("minecraft:dark_oak_button");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType DARK_OAK_CHEST_BOAT = load("minecraft:dark_oak_chest_boat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_DOOR = load("minecraft:dark_oak_door");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_FENCE = load("minecraft:dark_oak_fence");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_FENCE_GATE = load("minecraft:dark_oak_fence_gate");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType DARK_OAK_HANGING_SIGN = load("minecraft:dark_oak_hanging_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_LEAVES = load("minecraft:dark_oak_leaves");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_LOG = load("minecraft:dark_oak_log");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_PLANKS = load("minecraft:dark_oak_planks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_PRESSURE_PLATE = load("minecraft:dark_oak_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_SAPLING = load("minecraft:dark_oak_sapling");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_SIGN = load("minecraft:dark_oak_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_SLAB = load("minecraft:dark_oak_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_STAIRS = load("minecraft:dark_oak_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_TRAPDOOR = load("minecraft:dark_oak_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_OAK_WOOD = load("minecraft:dark_oak_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_PRISMARINE = load("minecraft:dark_prismarine");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_PRISMARINE_SLAB = load("minecraft:dark_prismarine_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DARK_PRISMARINE_STAIRS = load("minecraft:dark_prismarine_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DAYLIGHT_DETECTOR = load("minecraft:daylight_detector");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_BRAIN_CORAL = load("minecraft:dead_brain_coral");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_BRAIN_CORAL_BLOCK = load("minecraft:dead_brain_coral_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_BRAIN_CORAL_FAN = load("minecraft:dead_brain_coral_fan");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_BUBBLE_CORAL = load("minecraft:dead_bubble_coral");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_BUBBLE_CORAL_BLOCK = load("minecraft:dead_bubble_coral_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_BUBBLE_CORAL_FAN = load("minecraft:dead_bubble_coral_fan");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_BUSH = load("minecraft:dead_bush");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_FIRE_CORAL = load("minecraft:dead_fire_coral");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_FIRE_CORAL_BLOCK = load("minecraft:dead_fire_coral_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_FIRE_CORAL_FAN = load("minecraft:dead_fire_coral_fan");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_HORN_CORAL = load("minecraft:dead_horn_coral");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_HORN_CORAL_BLOCK = load("minecraft:dead_horn_coral_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_HORN_CORAL_FAN = load("minecraft:dead_horn_coral_fan");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_TUBE_CORAL = load("minecraft:dead_tube_coral");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_TUBE_CORAL_BLOCK = load("minecraft:dead_tube_coral_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEAD_TUBE_CORAL_FAN = load("minecraft:dead_tube_coral_fan");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEBUG_STICK = load("minecraft:debug_stick");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType DECORATED_POT = load("minecraft:decorated_pot");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE = load("minecraft:deepslate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_BRICK_SLAB = load("minecraft:deepslate_brick_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_BRICK_STAIRS = load("minecraft:deepslate_brick_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_BRICK_WALL = load("minecraft:deepslate_brick_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_BRICKS = load("minecraft:deepslate_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_COAL_ORE = load("minecraft:deepslate_coal_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_COPPER_ORE = load("minecraft:deepslate_copper_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_DIAMOND_ORE = load("minecraft:deepslate_diamond_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_EMERALD_ORE = load("minecraft:deepslate_emerald_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_GOLD_ORE = load("minecraft:deepslate_gold_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_IRON_ORE = load("minecraft:deepslate_iron_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_LAPIS_ORE = load("minecraft:deepslate_lapis_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_REDSTONE_ORE = load("minecraft:deepslate_redstone_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_TILE_SLAB = load("minecraft:deepslate_tile_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_TILE_STAIRS = load("minecraft:deepslate_tile_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_TILE_WALL = load("minecraft:deepslate_tile_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DEEPSLATE_TILES = load("minecraft:deepslate_tiles");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DETECTOR_RAIL = load("minecraft:detector_rail");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIAMOND = load("minecraft:diamond");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIAMOND_AXE = load("minecraft:diamond_axe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIAMOND_BLOCK = load("minecraft:diamond_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIAMOND_BOOTS = load("minecraft:diamond_boots");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIAMOND_CHESTPLATE = load("minecraft:diamond_chestplate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIAMOND_HELMET = load("minecraft:diamond_helmet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIAMOND_HOE = load("minecraft:diamond_hoe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIAMOND_HORSE_ARMOR = load("minecraft:diamond_horse_armor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIAMOND_LEGGINGS = load("minecraft:diamond_leggings");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIAMOND_ORE = load("minecraft:diamond_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIAMOND_PICKAXE = load("minecraft:diamond_pickaxe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIAMOND_SHOVEL = load("minecraft:diamond_shovel");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIAMOND_SWORD = load("minecraft:diamond_sword");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIORITE = load("minecraft:diorite");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIORITE_SLAB = load("minecraft:diorite_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIORITE_STAIRS = load("minecraft:diorite_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIORITE_WALL = load("minecraft:diorite_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIRT = load("minecraft:dirt");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DIRT_PATH = load("minecraft:dirt_path");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType DISC_FRAGMENT_5 = load("minecraft:disc_fragment_5");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DISPENSER = load("minecraft:dispenser");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DOLPHIN_SPAWN_EGG = load("minecraft:dolphin_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DONKEY_SPAWN_EGG = load("minecraft:donkey_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DRAGON_BREATH = load("minecraft:dragon_breath");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DRAGON_EGG = load("minecraft:dragon_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DRAGON_HEAD = load("minecraft:dragon_head");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType DRIED_GHAST = load("minecraft:dried_ghast");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DRIED_KELP = load("minecraft:dried_kelp");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DRIED_KELP_BLOCK = load("minecraft:dried_kelp_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DRIPSTONE_BLOCK = load("minecraft:dripstone_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DROPPER = load("minecraft:dropper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType DROWNED_SPAWN_EGG = load("minecraft:drowned_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType DUNE_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:dune_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType ECHO_SHARD = load("minecraft:echo_shard");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType EGG = load("minecraft:egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ELDER_GUARDIAN_SPAWN_EGG = load("minecraft:elder_guardian_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ELYTRA = load("minecraft:elytra");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType EMERALD = load("minecraft:emerald");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType EMERALD_BLOCK = load("minecraft:emerald_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType EMERALD_ORE = load("minecraft:emerald_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ENCHANTED_BOOK = load("minecraft:enchanted_book");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ENCHANTED_GOLDEN_APPLE = load("minecraft:enchanted_golden_apple");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ENCHANTING_TABLE = load("minecraft:enchanting_table");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType END_CRYSTAL = load("minecraft:end_crystal");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType END_PORTAL_FRAME = load("minecraft:end_portal_frame");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType END_ROD = load("minecraft:end_rod");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType END_STONE = load("minecraft:end_stone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType END_STONE_BRICK_SLAB = load("minecraft:end_stone_brick_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType END_STONE_BRICK_STAIRS = load("minecraft:end_stone_brick_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType END_STONE_BRICK_WALL = load("minecraft:end_stone_brick_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType END_STONE_BRICKS = load("minecraft:end_stone_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ENDER_CHEST = load("minecraft:ender_chest");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType ENDER_DRAGON_SPAWN_EGG = load("minecraft:ender_dragon_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ENDER_EYE = load("minecraft:ender_eye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ENDER_PEARL = load("minecraft:ender_pearl");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ENDERMAN_SPAWN_EGG = load("minecraft:enderman_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ENDERMITE_SPAWN_EGG = load("minecraft:endermite_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType EVOKER_SPAWN_EGG = load("minecraft:evoker_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType EXPERIENCE_BOTTLE = load("minecraft:experience_bottle");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType EXPLORER_POTTERY_SHERD = load("minecraft:explorer_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType EXPOSED_CHISELED_COPPER = load("minecraft:exposed_chiseled_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType EXPOSED_COPPER = load("minecraft:exposed_copper");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType EXPOSED_COPPER_BULB = load("minecraft:exposed_copper_bulb");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType EXPOSED_COPPER_DOOR = load("minecraft:exposed_copper_door");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType EXPOSED_COPPER_GRATE = load("minecraft:exposed_copper_grate");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType EXPOSED_COPPER_TRAPDOOR = load("minecraft:exposed_copper_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType EXPOSED_CUT_COPPER = load("minecraft:exposed_cut_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType EXPOSED_CUT_COPPER_SLAB = load("minecraft:exposed_cut_copper_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType EXPOSED_CUT_COPPER_STAIRS = load("minecraft:exposed_cut_copper_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType EYE_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:eye_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FARMLAND = load("minecraft:farmland");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FEATHER = load("minecraft:feather");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FERMENTED_SPIDER_EYE = load("minecraft:fermented_spider_eye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FERN = load("minecraft:fern");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType FIELD_MASONED_BANNER_PATTERN = load("minecraft:field_masoned_banner_pattern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FILLED_MAP = load("minecraft:filled_map");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FIRE_CHARGE = load("minecraft:fire_charge");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FIRE_CORAL = load("minecraft:fire_coral");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FIRE_CORAL_BLOCK = load("minecraft:fire_coral_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FIRE_CORAL_FAN = load("minecraft:fire_coral_fan");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloItemType FIREFLY_BUSH = load("minecraft:firefly_bush");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FIREWORK_ROCKET = load("minecraft:firework_rocket");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FIREWORK_STAR = load("minecraft:firework_star");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FISHING_ROD = load("minecraft:fishing_rod");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FLETCHING_TABLE = load("minecraft:fletching_table");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FLINT = load("minecraft:flint");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FLINT_AND_STEEL = load("minecraft:flint_and_steel");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType FLOW_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:flow_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType FLOW_BANNER_PATTERN = load("minecraft:flow_banner_pattern");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType FLOW_POTTERY_SHERD = load("minecraft:flow_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FLOWER_BANNER_PATTERN = load("minecraft:flower_banner_pattern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FLOWER_POT = load("minecraft:flower_pot");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FLOWERING_AZALEA = load("minecraft:flowering_azalea");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FLOWERING_AZALEA_LEAVES = load("minecraft:flowering_azalea_leaves");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FOX_SPAWN_EGG = load("minecraft:fox_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType FRIEND_POTTERY_SHERD = load("minecraft:friend_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType FROG_SPAWN_EGG = load("minecraft:frog_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType FROGSPAWN = load("minecraft:frogspawn");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FURNACE = load("minecraft:furnace");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType FURNACE_MINECART = load("minecraft:furnace_minecart");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GHAST_SPAWN_EGG = load("minecraft:ghast_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GHAST_TEAR = load("minecraft:ghast_tear");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GILDED_BLACKSTONE = load("minecraft:gilded_blackstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GLASS = load("minecraft:glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GLASS_BOTTLE = load("minecraft:glass_bottle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GLASS_PANE = load("minecraft:glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GLISTERING_MELON_SLICE = load("minecraft:glistering_melon_slice");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GLOBE_BANNER_PATTERN = load("minecraft:globe_banner_pattern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GLOW_BERRIES = load("minecraft:glow_berries");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GLOW_INK_SAC = load("minecraft:glow_ink_sac");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GLOW_ITEM_FRAME = load("minecraft:glow_item_frame");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GLOW_LICHEN = load("minecraft:glow_lichen");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GLOW_SQUID_SPAWN_EGG = load("minecraft:glow_squid_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GLOWSTONE = load("minecraft:glowstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GLOWSTONE_DUST = load("minecraft:glowstone_dust");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType GOAT_HORN = load("minecraft:goat_horn");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOAT_SPAWN_EGG = load("minecraft:goat_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLD_BLOCK = load("minecraft:gold_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLD_INGOT = load("minecraft:gold_ingot");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLD_NUGGET = load("minecraft:gold_nugget");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLD_ORE = load("minecraft:gold_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLDEN_APPLE = load("minecraft:golden_apple");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLDEN_AXE = load("minecraft:golden_axe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLDEN_BOOTS = load("minecraft:golden_boots");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLDEN_CARROT = load("minecraft:golden_carrot");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLDEN_CHESTPLATE = load("minecraft:golden_chestplate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLDEN_HELMET = load("minecraft:golden_helmet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLDEN_HOE = load("minecraft:golden_hoe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLDEN_HORSE_ARMOR = load("minecraft:golden_horse_armor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLDEN_LEGGINGS = load("minecraft:golden_leggings");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLDEN_PICKAXE = load("minecraft:golden_pickaxe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLDEN_SHOVEL = load("minecraft:golden_shovel");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GOLDEN_SWORD = load("minecraft:golden_sword");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRANITE = load("minecraft:granite");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRANITE_SLAB = load("minecraft:granite_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRANITE_STAIRS = load("minecraft:granite_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRANITE_WALL = load("minecraft:granite_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2) @Until(ProtocolVersion.MINECRAFT_1_20_2)
    public static final VeloItemType GRASS = load("minecraft:grass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRASS_BLOCK = load("minecraft:grass_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAVEL = load("minecraft:gravel");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAY_BANNER = load("minecraft:gray_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAY_BED = load("minecraft:gray_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType GRAY_BUNDLE = load("minecraft:gray_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAY_CANDLE = load("minecraft:gray_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAY_CARPET = load("minecraft:gray_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAY_CONCRETE = load("minecraft:gray_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAY_CONCRETE_POWDER = load("minecraft:gray_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAY_DYE = load("minecraft:gray_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAY_GLAZED_TERRACOTTA = load("minecraft:gray_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType GRAY_HARNESS = load("minecraft:gray_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAY_SHULKER_BOX = load("minecraft:gray_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAY_STAINED_GLASS = load("minecraft:gray_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAY_STAINED_GLASS_PANE = load("minecraft:gray_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAY_TERRACOTTA = load("minecraft:gray_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRAY_WOOL = load("minecraft:gray_wool");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GREEN_BANNER = load("minecraft:green_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GREEN_BED = load("minecraft:green_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType GREEN_BUNDLE = load("minecraft:green_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GREEN_CANDLE = load("minecraft:green_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GREEN_CARPET = load("minecraft:green_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GREEN_CONCRETE = load("minecraft:green_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GREEN_CONCRETE_POWDER = load("minecraft:green_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GREEN_DYE = load("minecraft:green_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GREEN_GLAZED_TERRACOTTA = load("minecraft:green_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType GREEN_HARNESS = load("minecraft:green_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GREEN_SHULKER_BOX = load("minecraft:green_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GREEN_STAINED_GLASS = load("minecraft:green_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GREEN_STAINED_GLASS_PANE = load("minecraft:green_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GREEN_TERRACOTTA = load("minecraft:green_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GREEN_WOOL = load("minecraft:green_wool");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GRINDSTONE = load("minecraft:grindstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GUARDIAN_SPAWN_EGG = load("minecraft:guardian_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType GUNPOWDER = load("minecraft:gunpowder");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType GUSTER_BANNER_PATTERN = load("minecraft:guster_banner_pattern");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType GUSTER_POTTERY_SHERD = load("minecraft:guster_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HANGING_ROOTS = load("minecraft:hanging_roots");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType HAPPY_GHAST_SPAWN_EGG = load("minecraft:happy_ghast_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HAY_BLOCK = load("minecraft:hay_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HEART_OF_THE_SEA = load("minecraft:heart_of_the_sea");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType HEART_POTTERY_SHERD = load("minecraft:heart_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType HEARTBREAK_POTTERY_SHERD = load("minecraft:heartbreak_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType HEAVY_CORE = load("minecraft:heavy_core");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HEAVY_WEIGHTED_PRESSURE_PLATE = load("minecraft:heavy_weighted_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HOGLIN_SPAWN_EGG = load("minecraft:hoglin_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HONEY_BLOCK = load("minecraft:honey_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HONEY_BOTTLE = load("minecraft:honey_bottle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HONEYCOMB = load("minecraft:honeycomb");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HONEYCOMB_BLOCK = load("minecraft:honeycomb_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HOPPER = load("minecraft:hopper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HOPPER_MINECART = load("minecraft:hopper_minecart");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HORN_CORAL = load("minecraft:horn_coral");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HORN_CORAL_BLOCK = load("minecraft:horn_coral_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HORN_CORAL_FAN = load("minecraft:horn_coral_fan");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HORSE_SPAWN_EGG = load("minecraft:horse_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType HOST_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:host_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType HOWL_POTTERY_SHERD = load("minecraft:howl_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType HUSK_SPAWN_EGG = load("minecraft:husk_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ICE = load("minecraft:ice");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType INFESTED_CHISELED_STONE_BRICKS = load("minecraft:infested_chiseled_stone_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType INFESTED_COBBLESTONE = load("minecraft:infested_cobblestone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType INFESTED_CRACKED_STONE_BRICKS = load("minecraft:infested_cracked_stone_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType INFESTED_DEEPSLATE = load("minecraft:infested_deepslate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType INFESTED_MOSSY_STONE_BRICKS = load("minecraft:infested_mossy_stone_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType INFESTED_STONE = load("minecraft:infested_stone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType INFESTED_STONE_BRICKS = load("minecraft:infested_stone_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType INK_SAC = load("minecraft:ink_sac");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_AXE = load("minecraft:iron_axe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_BARS = load("minecraft:iron_bars");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_BLOCK = load("minecraft:iron_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_BOOTS = load("minecraft:iron_boots");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_CHESTPLATE = load("minecraft:iron_chestplate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_DOOR = load("minecraft:iron_door");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType IRON_GOLEM_SPAWN_EGG = load("minecraft:iron_golem_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_HELMET = load("minecraft:iron_helmet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_HOE = load("minecraft:iron_hoe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_HORSE_ARMOR = load("minecraft:iron_horse_armor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_INGOT = load("minecraft:iron_ingot");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_LEGGINGS = load("minecraft:iron_leggings");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_NUGGET = load("minecraft:iron_nugget");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_ORE = load("minecraft:iron_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_PICKAXE = load("minecraft:iron_pickaxe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_SHOVEL = load("minecraft:iron_shovel");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_SWORD = load("minecraft:iron_sword");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType IRON_TRAPDOOR = load("minecraft:iron_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ITEM_FRAME = load("minecraft:item_frame");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JACK_O_LANTERN = load("minecraft:jack_o_lantern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JIGSAW = load("minecraft:jigsaw");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUKEBOX = load("minecraft:jukebox");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_BOAT = load("minecraft:jungle_boat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_BUTTON = load("minecraft:jungle_button");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType JUNGLE_CHEST_BOAT = load("minecraft:jungle_chest_boat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_DOOR = load("minecraft:jungle_door");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_FENCE = load("minecraft:jungle_fence");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_FENCE_GATE = load("minecraft:jungle_fence_gate");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType JUNGLE_HANGING_SIGN = load("minecraft:jungle_hanging_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_LEAVES = load("minecraft:jungle_leaves");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_LOG = load("minecraft:jungle_log");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_PLANKS = load("minecraft:jungle_planks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_PRESSURE_PLATE = load("minecraft:jungle_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_SAPLING = load("minecraft:jungle_sapling");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_SIGN = load("minecraft:jungle_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_SLAB = load("minecraft:jungle_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_STAIRS = load("minecraft:jungle_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_TRAPDOOR = load("minecraft:jungle_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType JUNGLE_WOOD = load("minecraft:jungle_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType KELP = load("minecraft:kelp");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType KNOWLEDGE_BOOK = load("minecraft:knowledge_book");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LADDER = load("minecraft:ladder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LANTERN = load("minecraft:lantern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LAPIS_BLOCK = load("minecraft:lapis_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LAPIS_LAZULI = load("minecraft:lapis_lazuli");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LAPIS_ORE = load("minecraft:lapis_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LARGE_AMETHYST_BUD = load("minecraft:large_amethyst_bud");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LARGE_FERN = load("minecraft:large_fern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LAVA_BUCKET = load("minecraft:lava_bucket");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LEAD = load("minecraft:lead");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloItemType LEAF_LITTER = load("minecraft:leaf_litter");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LEATHER = load("minecraft:leather");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LEATHER_BOOTS = load("minecraft:leather_boots");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LEATHER_CHESTPLATE = load("minecraft:leather_chestplate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LEATHER_HELMET = load("minecraft:leather_helmet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LEATHER_HORSE_ARMOR = load("minecraft:leather_horse_armor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LEATHER_LEGGINGS = load("minecraft:leather_leggings");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LECTERN = load("minecraft:lectern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LEVER = load("minecraft:lever");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT = load("minecraft:light");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_BLUE_BANNER = load("minecraft:light_blue_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_BLUE_BED = load("minecraft:light_blue_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType LIGHT_BLUE_BUNDLE = load("minecraft:light_blue_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_BLUE_CANDLE = load("minecraft:light_blue_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_BLUE_CARPET = load("minecraft:light_blue_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_BLUE_CONCRETE = load("minecraft:light_blue_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_BLUE_CONCRETE_POWDER = load("minecraft:light_blue_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_BLUE_DYE = load("minecraft:light_blue_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_BLUE_GLAZED_TERRACOTTA = load("minecraft:light_blue_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType LIGHT_BLUE_HARNESS = load("minecraft:light_blue_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_BLUE_SHULKER_BOX = load("minecraft:light_blue_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_BLUE_STAINED_GLASS = load("minecraft:light_blue_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_BLUE_STAINED_GLASS_PANE = load("minecraft:light_blue_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_BLUE_TERRACOTTA = load("minecraft:light_blue_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_BLUE_WOOL = load("minecraft:light_blue_wool");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_GRAY_BANNER = load("minecraft:light_gray_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_GRAY_BED = load("minecraft:light_gray_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType LIGHT_GRAY_BUNDLE = load("minecraft:light_gray_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_GRAY_CANDLE = load("minecraft:light_gray_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_GRAY_CARPET = load("minecraft:light_gray_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_GRAY_CONCRETE = load("minecraft:light_gray_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_GRAY_CONCRETE_POWDER = load("minecraft:light_gray_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_GRAY_DYE = load("minecraft:light_gray_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_GRAY_GLAZED_TERRACOTTA = load("minecraft:light_gray_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType LIGHT_GRAY_HARNESS = load("minecraft:light_gray_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_GRAY_SHULKER_BOX = load("minecraft:light_gray_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_GRAY_STAINED_GLASS = load("minecraft:light_gray_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_GRAY_STAINED_GLASS_PANE = load("minecraft:light_gray_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_GRAY_TERRACOTTA = load("minecraft:light_gray_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_GRAY_WOOL = load("minecraft:light_gray_wool");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHT_WEIGHTED_PRESSURE_PLATE = load("minecraft:light_weighted_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIGHTNING_ROD = load("minecraft:lightning_rod");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LILAC = load("minecraft:lilac");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LILY_OF_THE_VALLEY = load("minecraft:lily_of_the_valley");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LILY_PAD = load("minecraft:lily_pad");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIME_BANNER = load("minecraft:lime_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIME_BED = load("minecraft:lime_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType LIME_BUNDLE = load("minecraft:lime_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIME_CANDLE = load("minecraft:lime_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIME_CARPET = load("minecraft:lime_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIME_CONCRETE = load("minecraft:lime_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIME_CONCRETE_POWDER = load("minecraft:lime_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIME_DYE = load("minecraft:lime_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIME_GLAZED_TERRACOTTA = load("minecraft:lime_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType LIME_HARNESS = load("minecraft:lime_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIME_SHULKER_BOX = load("minecraft:lime_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIME_STAINED_GLASS = load("minecraft:lime_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIME_STAINED_GLASS_PANE = load("minecraft:lime_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIME_TERRACOTTA = load("minecraft:lime_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LIME_WOOL = load("minecraft:lime_wool");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LINGERING_POTION = load("minecraft:lingering_potion");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LLAMA_SPAWN_EGG = load("minecraft:llama_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LODESTONE = load("minecraft:lodestone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType LOOM = load("minecraft:loom");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType MACE = load("minecraft:mace");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGENTA_BANNER = load("minecraft:magenta_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGENTA_BED = load("minecraft:magenta_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType MAGENTA_BUNDLE = load("minecraft:magenta_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGENTA_CANDLE = load("minecraft:magenta_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGENTA_CARPET = load("minecraft:magenta_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGENTA_CONCRETE = load("minecraft:magenta_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGENTA_CONCRETE_POWDER = load("minecraft:magenta_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGENTA_DYE = load("minecraft:magenta_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGENTA_GLAZED_TERRACOTTA = load("minecraft:magenta_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType MAGENTA_HARNESS = load("minecraft:magenta_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGENTA_SHULKER_BOX = load("minecraft:magenta_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGENTA_STAINED_GLASS = load("minecraft:magenta_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGENTA_STAINED_GLASS_PANE = load("minecraft:magenta_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGENTA_TERRACOTTA = load("minecraft:magenta_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGENTA_WOOL = load("minecraft:magenta_wool");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGMA_BLOCK = load("minecraft:magma_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGMA_CREAM = load("minecraft:magma_cream");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAGMA_CUBE_SPAWN_EGG = load("minecraft:magma_cube_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_BOAT = load("minecraft:mangrove_boat");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_BUTTON = load("minecraft:mangrove_button");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_CHEST_BOAT = load("minecraft:mangrove_chest_boat");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_DOOR = load("minecraft:mangrove_door");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_FENCE = load("minecraft:mangrove_fence");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_FENCE_GATE = load("minecraft:mangrove_fence_gate");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType MANGROVE_HANGING_SIGN = load("minecraft:mangrove_hanging_sign");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_LEAVES = load("minecraft:mangrove_leaves");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_LOG = load("minecraft:mangrove_log");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_PLANKS = load("minecraft:mangrove_planks");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_PRESSURE_PLATE = load("minecraft:mangrove_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_PROPAGULE = load("minecraft:mangrove_propagule");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_ROOTS = load("minecraft:mangrove_roots");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_SIGN = load("minecraft:mangrove_sign");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_SLAB = load("minecraft:mangrove_slab");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_STAIRS = load("minecraft:mangrove_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_TRAPDOOR = load("minecraft:mangrove_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MANGROVE_WOOD = load("minecraft:mangrove_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MAP = load("minecraft:map");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MEDIUM_AMETHYST_BUD = load("minecraft:medium_amethyst_bud");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MELON = load("minecraft:melon");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MELON_SEEDS = load("minecraft:melon_seeds");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MELON_SLICE = load("minecraft:melon_slice");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MILK_BUCKET = load("minecraft:milk_bucket");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MINECART = load("minecraft:minecart");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType MINER_POTTERY_SHERD = load("minecraft:miner_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MOJANG_BANNER_PATTERN = load("minecraft:mojang_banner_pattern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MOOSHROOM_SPAWN_EGG = load("minecraft:mooshroom_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MOSS_BLOCK = load("minecraft:moss_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MOSS_CARPET = load("minecraft:moss_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MOSSY_COBBLESTONE = load("minecraft:mossy_cobblestone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MOSSY_COBBLESTONE_SLAB = load("minecraft:mossy_cobblestone_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MOSSY_COBBLESTONE_STAIRS = load("minecraft:mossy_cobblestone_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MOSSY_COBBLESTONE_WALL = load("minecraft:mossy_cobblestone_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MOSSY_STONE_BRICK_SLAB = load("minecraft:mossy_stone_brick_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MOSSY_STONE_BRICK_STAIRS = load("minecraft:mossy_stone_brick_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MOSSY_STONE_BRICK_WALL = load("minecraft:mossy_stone_brick_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MOSSY_STONE_BRICKS = load("minecraft:mossy_stone_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType MOURNER_POTTERY_SHERD = load("minecraft:mourner_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MUD = load("minecraft:mud");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MUD_BRICK_SLAB = load("minecraft:mud_brick_slab");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MUD_BRICK_STAIRS = load("minecraft:mud_brick_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MUD_BRICK_WALL = load("minecraft:mud_brick_wall");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MUD_BRICKS = load("minecraft:mud_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MUDDY_MANGROVE_ROOTS = load("minecraft:muddy_mangrove_roots");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MULE_SPAWN_EGG = load("minecraft:mule_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSHROOM_STEM = load("minecraft:mushroom_stem");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSHROOM_STEW = load("minecraft:mushroom_stew");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_11 = load("minecraft:music_disc_11");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_13 = load("minecraft:music_disc_13");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType MUSIC_DISC_5 = load("minecraft:music_disc_5");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_BLOCKS = load("minecraft:music_disc_blocks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_CAT = load("minecraft:music_disc_cat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_CHIRP = load("minecraft:music_disc_chirp");
    @Since(ProtocolVersion.MINECRAFT_1_21)
    public static final VeloItemType MUSIC_DISC_CREATOR = load("minecraft:music_disc_creator");
    @Since(ProtocolVersion.MINECRAFT_1_21)
    public static final VeloItemType MUSIC_DISC_CREATOR_MUSIC_BOX = load("minecraft:music_disc_creator_music_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_FAR = load("minecraft:music_disc_far");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_MALL = load("minecraft:music_disc_mall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_MELLOHI = load("minecraft:music_disc_mellohi");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_OTHERSIDE = load("minecraft:music_disc_otherside");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_PIGSTEP = load("minecraft:music_disc_pigstep");
    @Since(ProtocolVersion.MINECRAFT_1_21)
    public static final VeloItemType MUSIC_DISC_PRECIPICE = load("minecraft:music_disc_precipice");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType MUSIC_DISC_RELIC = load("minecraft:music_disc_relic");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_STAL = load("minecraft:music_disc_stal");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_STRAD = load("minecraft:music_disc_strad");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType MUSIC_DISC_TEARS = load("minecraft:music_disc_tears");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_WAIT = load("minecraft:music_disc_wait");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUSIC_DISC_WARD = load("minecraft:music_disc_ward");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MUTTON = load("minecraft:mutton");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType MYCELIUM = load("minecraft:mycelium");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NAME_TAG = load("minecraft:name_tag");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NAUTILUS_SHELL = load("minecraft:nautilus_shell");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHER_BRICK = load("minecraft:nether_brick");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHER_BRICK_FENCE = load("minecraft:nether_brick_fence");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHER_BRICK_SLAB = load("minecraft:nether_brick_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHER_BRICK_STAIRS = load("minecraft:nether_brick_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHER_BRICK_WALL = load("minecraft:nether_brick_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHER_BRICKS = load("minecraft:nether_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHER_GOLD_ORE = load("minecraft:nether_gold_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHER_QUARTZ_ORE = load("minecraft:nether_quartz_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHER_SPROUTS = load("minecraft:nether_sprouts");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHER_STAR = load("minecraft:nether_star");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHER_WART = load("minecraft:nether_wart");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHER_WART_BLOCK = load("minecraft:nether_wart_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHERITE_AXE = load("minecraft:netherite_axe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHERITE_BLOCK = load("minecraft:netherite_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHERITE_BOOTS = load("minecraft:netherite_boots");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHERITE_CHESTPLATE = load("minecraft:netherite_chestplate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHERITE_HELMET = load("minecraft:netherite_helmet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHERITE_HOE = load("minecraft:netherite_hoe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHERITE_INGOT = load("minecraft:netherite_ingot");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHERITE_LEGGINGS = load("minecraft:netherite_leggings");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHERITE_PICKAXE = load("minecraft:netherite_pickaxe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHERITE_SCRAP = load("minecraft:netherite_scrap");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHERITE_SHOVEL = load("minecraft:netherite_shovel");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHERITE_SWORD = load("minecraft:netherite_sword");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType NETHERITE_UPGRADE_SMITHING_TEMPLATE = load("minecraft:netherite_upgrade_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NETHERRACK = load("minecraft:netherrack");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType NOTE_BLOCK = load("minecraft:note_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_BOAT = load("minecraft:oak_boat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_BUTTON = load("minecraft:oak_button");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType OAK_CHEST_BOAT = load("minecraft:oak_chest_boat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_DOOR = load("minecraft:oak_door");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_FENCE = load("minecraft:oak_fence");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_FENCE_GATE = load("minecraft:oak_fence_gate");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType OAK_HANGING_SIGN = load("minecraft:oak_hanging_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_LEAVES = load("minecraft:oak_leaves");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_LOG = load("minecraft:oak_log");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_PLANKS = load("minecraft:oak_planks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_PRESSURE_PLATE = load("minecraft:oak_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_SAPLING = load("minecraft:oak_sapling");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_SIGN = load("minecraft:oak_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_SLAB = load("minecraft:oak_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_STAIRS = load("minecraft:oak_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_TRAPDOOR = load("minecraft:oak_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OAK_WOOD = load("minecraft:oak_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OBSERVER = load("minecraft:observer");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OBSIDIAN = load("minecraft:obsidian");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OCELOT_SPAWN_EGG = load("minecraft:ocelot_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType OCHRE_FROGLIGHT = load("minecraft:ochre_froglight");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType OMINOUS_BOTTLE = load("minecraft:ominous_bottle");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType OMINOUS_TRIAL_KEY = load("minecraft:ominous_trial_key");
    @Since(ProtocolVersion.MINECRAFT_1_21_4)
    public static final VeloItemType OPEN_EYEBLOSSOM = load("minecraft:open_eyeblossom");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_BANNER = load("minecraft:orange_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_BED = load("minecraft:orange_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType ORANGE_BUNDLE = load("minecraft:orange_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_CANDLE = load("minecraft:orange_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_CARPET = load("minecraft:orange_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_CONCRETE = load("minecraft:orange_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_CONCRETE_POWDER = load("minecraft:orange_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_DYE = load("minecraft:orange_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_GLAZED_TERRACOTTA = load("minecraft:orange_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType ORANGE_HARNESS = load("minecraft:orange_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_SHULKER_BOX = load("minecraft:orange_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_STAINED_GLASS = load("minecraft:orange_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_STAINED_GLASS_PANE = load("minecraft:orange_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_TERRACOTTA = load("minecraft:orange_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_TULIP = load("minecraft:orange_tulip");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ORANGE_WOOL = load("minecraft:orange_wool");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OXEYE_DAISY = load("minecraft:oxeye_daisy");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType OXIDIZED_CHISELED_COPPER = load("minecraft:oxidized_chiseled_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OXIDIZED_COPPER = load("minecraft:oxidized_copper");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType OXIDIZED_COPPER_BULB = load("minecraft:oxidized_copper_bulb");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType OXIDIZED_COPPER_DOOR = load("minecraft:oxidized_copper_door");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType OXIDIZED_COPPER_GRATE = load("minecraft:oxidized_copper_grate");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType OXIDIZED_COPPER_TRAPDOOR = load("minecraft:oxidized_copper_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OXIDIZED_CUT_COPPER = load("minecraft:oxidized_cut_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OXIDIZED_CUT_COPPER_SLAB = load("minecraft:oxidized_cut_copper_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType OXIDIZED_CUT_COPPER_STAIRS = load("minecraft:oxidized_cut_copper_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PACKED_ICE = load("minecraft:packed_ice");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType PACKED_MUD = load("minecraft:packed_mud");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PAINTING = load("minecraft:painting");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_HANGING_MOSS = load("minecraft:pale_hanging_moss");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_MOSS_BLOCK = load("minecraft:pale_moss_block");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_MOSS_CARPET = load("minecraft:pale_moss_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_BOAT = load("minecraft:pale_oak_boat");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_BUTTON = load("minecraft:pale_oak_button");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_CHEST_BOAT = load("minecraft:pale_oak_chest_boat");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_DOOR = load("minecraft:pale_oak_door");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_FENCE = load("minecraft:pale_oak_fence");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_FENCE_GATE = load("minecraft:pale_oak_fence_gate");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_HANGING_SIGN = load("minecraft:pale_oak_hanging_sign");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_LEAVES = load("minecraft:pale_oak_leaves");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_LOG = load("minecraft:pale_oak_log");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_PLANKS = load("minecraft:pale_oak_planks");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_PRESSURE_PLATE = load("minecraft:pale_oak_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_SAPLING = load("minecraft:pale_oak_sapling");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_SIGN = load("minecraft:pale_oak_sign");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_SLAB = load("minecraft:pale_oak_slab");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_STAIRS = load("minecraft:pale_oak_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_TRAPDOOR = load("minecraft:pale_oak_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PALE_OAK_WOOD = load("minecraft:pale_oak_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PANDA_SPAWN_EGG = load("minecraft:panda_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PAPER = load("minecraft:paper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PARROT_SPAWN_EGG = load("minecraft:parrot_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType PEARLESCENT_FROGLIGHT = load("minecraft:pearlescent_froglight");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PEONY = load("minecraft:peony");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PETRIFIED_OAK_SLAB = load("minecraft:petrified_oak_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PHANTOM_MEMBRANE = load("minecraft:phantom_membrane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PHANTOM_SPAWN_EGG = load("minecraft:phantom_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PIG_SPAWN_EGG = load("minecraft:pig_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PIGLIN_BANNER_PATTERN = load("minecraft:piglin_banner_pattern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PIGLIN_BRUTE_SPAWN_EGG = load("minecraft:piglin_brute_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType PIGLIN_HEAD = load("minecraft:piglin_head");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PIGLIN_SPAWN_EGG = load("minecraft:piglin_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PILLAGER_SPAWN_EGG = load("minecraft:pillager_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_BANNER = load("minecraft:pink_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_BED = load("minecraft:pink_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PINK_BUNDLE = load("minecraft:pink_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_CANDLE = load("minecraft:pink_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_CARPET = load("minecraft:pink_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_CONCRETE = load("minecraft:pink_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_CONCRETE_POWDER = load("minecraft:pink_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_DYE = load("minecraft:pink_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_GLAZED_TERRACOTTA = load("minecraft:pink_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType PINK_HARNESS = load("minecraft:pink_harness");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType PINK_PETALS = load("minecraft:pink_petals");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_SHULKER_BOX = load("minecraft:pink_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_STAINED_GLASS = load("minecraft:pink_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_STAINED_GLASS_PANE = load("minecraft:pink_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_TERRACOTTA = load("minecraft:pink_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_TULIP = load("minecraft:pink_tulip");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PINK_WOOL = load("minecraft:pink_wool");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PISTON = load("minecraft:piston");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType PITCHER_PLANT = load("minecraft:pitcher_plant");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType PITCHER_POD = load("minecraft:pitcher_pod");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PLAYER_HEAD = load("minecraft:player_head");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType PLENTY_POTTERY_SHERD = load("minecraft:plenty_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PODZOL = load("minecraft:podzol");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POINTED_DRIPSTONE = load("minecraft:pointed_dripstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POISONOUS_POTATO = load("minecraft:poisonous_potato");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLAR_BEAR_SPAWN_EGG = load("minecraft:polar_bear_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_ANDESITE = load("minecraft:polished_andesite");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_ANDESITE_SLAB = load("minecraft:polished_andesite_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_ANDESITE_STAIRS = load("minecraft:polished_andesite_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_BASALT = load("minecraft:polished_basalt");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_BLACKSTONE = load("minecraft:polished_blackstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_BLACKSTONE_BRICK_SLAB = load("minecraft:polished_blackstone_brick_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_BLACKSTONE_BRICK_STAIRS = load("minecraft:polished_blackstone_brick_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_BLACKSTONE_BRICK_WALL = load("minecraft:polished_blackstone_brick_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_BLACKSTONE_BRICKS = load("minecraft:polished_blackstone_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_BLACKSTONE_BUTTON = load("minecraft:polished_blackstone_button");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_BLACKSTONE_PRESSURE_PLATE = load("minecraft:polished_blackstone_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_BLACKSTONE_SLAB = load("minecraft:polished_blackstone_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_BLACKSTONE_STAIRS = load("minecraft:polished_blackstone_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_BLACKSTONE_WALL = load("minecraft:polished_blackstone_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_DEEPSLATE = load("minecraft:polished_deepslate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_DEEPSLATE_SLAB = load("minecraft:polished_deepslate_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_DEEPSLATE_STAIRS = load("minecraft:polished_deepslate_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_DEEPSLATE_WALL = load("minecraft:polished_deepslate_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_DIORITE = load("minecraft:polished_diorite");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_DIORITE_SLAB = load("minecraft:polished_diorite_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_DIORITE_STAIRS = load("minecraft:polished_diorite_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_GRANITE = load("minecraft:polished_granite");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_GRANITE_SLAB = load("minecraft:polished_granite_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POLISHED_GRANITE_STAIRS = load("minecraft:polished_granite_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType POLISHED_TUFF = load("minecraft:polished_tuff");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType POLISHED_TUFF_SLAB = load("minecraft:polished_tuff_slab");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType POLISHED_TUFF_STAIRS = load("minecraft:polished_tuff_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType POLISHED_TUFF_WALL = load("minecraft:polished_tuff_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POPPED_CHORUS_FRUIT = load("minecraft:popped_chorus_fruit");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POPPY = load("minecraft:poppy");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PORKCHOP = load("minecraft:porkchop");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POTATO = load("minecraft:potato");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POTION = load("minecraft:potion");
    @Since(ProtocolVersion.MINECRAFT_1_19_4) @Until(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType POTTERY_SHARD_ARCHER = load("minecraft:pottery_shard_archer");
    @Since(ProtocolVersion.MINECRAFT_1_19_4) @Until(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType POTTERY_SHARD_ARMS_UP = load("minecraft:pottery_shard_arms_up");
    @Since(ProtocolVersion.MINECRAFT_1_19_4) @Until(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType POTTERY_SHARD_PRIZE = load("minecraft:pottery_shard_prize");
    @Since(ProtocolVersion.MINECRAFT_1_19_4) @Until(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType POTTERY_SHARD_SKULL = load("minecraft:pottery_shard_skull");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POWDER_SNOW_BUCKET = load("minecraft:powder_snow_bucket");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType POWERED_RAIL = load("minecraft:powered_rail");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PRISMARINE = load("minecraft:prismarine");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PRISMARINE_BRICK_SLAB = load("minecraft:prismarine_brick_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PRISMARINE_BRICK_STAIRS = load("minecraft:prismarine_brick_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PRISMARINE_BRICKS = load("minecraft:prismarine_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PRISMARINE_CRYSTALS = load("minecraft:prismarine_crystals");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PRISMARINE_SHARD = load("minecraft:prismarine_shard");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PRISMARINE_SLAB = load("minecraft:prismarine_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PRISMARINE_STAIRS = load("minecraft:prismarine_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PRISMARINE_WALL = load("minecraft:prismarine_wall");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType PRIZE_POTTERY_SHERD = load("minecraft:prize_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PUFFERFISH = load("minecraft:pufferfish");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PUFFERFISH_BUCKET = load("minecraft:pufferfish_bucket");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PUFFERFISH_SPAWN_EGG = load("minecraft:pufferfish_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PUMPKIN = load("minecraft:pumpkin");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PUMPKIN_PIE = load("minecraft:pumpkin_pie");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PUMPKIN_SEEDS = load("minecraft:pumpkin_seeds");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPLE_BANNER = load("minecraft:purple_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPLE_BED = load("minecraft:purple_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType PURPLE_BUNDLE = load("minecraft:purple_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPLE_CANDLE = load("minecraft:purple_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPLE_CARPET = load("minecraft:purple_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPLE_CONCRETE = load("minecraft:purple_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPLE_CONCRETE_POWDER = load("minecraft:purple_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPLE_DYE = load("minecraft:purple_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPLE_GLAZED_TERRACOTTA = load("minecraft:purple_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType PURPLE_HARNESS = load("minecraft:purple_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPLE_SHULKER_BOX = load("minecraft:purple_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPLE_STAINED_GLASS = load("minecraft:purple_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPLE_STAINED_GLASS_PANE = load("minecraft:purple_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPLE_TERRACOTTA = load("minecraft:purple_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPLE_WOOL = load("minecraft:purple_wool");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPUR_BLOCK = load("minecraft:purpur_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPUR_PILLAR = load("minecraft:purpur_pillar");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPUR_SLAB = load("minecraft:purpur_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType PURPUR_STAIRS = load("minecraft:purpur_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType QUARTZ = load("minecraft:quartz");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType QUARTZ_BLOCK = load("minecraft:quartz_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType QUARTZ_BRICKS = load("minecraft:quartz_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType QUARTZ_PILLAR = load("minecraft:quartz_pillar");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType QUARTZ_SLAB = load("minecraft:quartz_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType QUARTZ_STAIRS = load("minecraft:quartz_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RABBIT = load("minecraft:rabbit");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RABBIT_FOOT = load("minecraft:rabbit_foot");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RABBIT_HIDE = load("minecraft:rabbit_hide");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RABBIT_SPAWN_EGG = load("minecraft:rabbit_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RABBIT_STEW = load("minecraft:rabbit_stew");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RAIL = load("minecraft:rail");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType RAISER_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:raiser_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RAVAGER_SPAWN_EGG = load("minecraft:ravager_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RAW_COPPER = load("minecraft:raw_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RAW_COPPER_BLOCK = load("minecraft:raw_copper_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RAW_GOLD = load("minecraft:raw_gold");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RAW_GOLD_BLOCK = load("minecraft:raw_gold_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RAW_IRON = load("minecraft:raw_iron");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RAW_IRON_BLOCK = load("minecraft:raw_iron_block");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType RECOVERY_COMPASS = load("minecraft:recovery_compass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_BANNER = load("minecraft:red_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_BED = load("minecraft:red_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType RED_BUNDLE = load("minecraft:red_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_CANDLE = load("minecraft:red_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_CARPET = load("minecraft:red_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_CONCRETE = load("minecraft:red_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_CONCRETE_POWDER = load("minecraft:red_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_DYE = load("minecraft:red_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_GLAZED_TERRACOTTA = load("minecraft:red_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType RED_HARNESS = load("minecraft:red_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_MUSHROOM = load("minecraft:red_mushroom");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_MUSHROOM_BLOCK = load("minecraft:red_mushroom_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_NETHER_BRICK_SLAB = load("minecraft:red_nether_brick_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_NETHER_BRICK_STAIRS = load("minecraft:red_nether_brick_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_NETHER_BRICK_WALL = load("minecraft:red_nether_brick_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_NETHER_BRICKS = load("minecraft:red_nether_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_SAND = load("minecraft:red_sand");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_SANDSTONE = load("minecraft:red_sandstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_SANDSTONE_SLAB = load("minecraft:red_sandstone_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_SANDSTONE_STAIRS = load("minecraft:red_sandstone_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_SANDSTONE_WALL = load("minecraft:red_sandstone_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_SHULKER_BOX = load("minecraft:red_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_STAINED_GLASS = load("minecraft:red_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_STAINED_GLASS_PANE = load("minecraft:red_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_TERRACOTTA = load("minecraft:red_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_TULIP = load("minecraft:red_tulip");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RED_WOOL = load("minecraft:red_wool");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType REDSTONE = load("minecraft:redstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType REDSTONE_BLOCK = load("minecraft:redstone_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType REDSTONE_LAMP = load("minecraft:redstone_lamp");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType REDSTONE_ORE = load("minecraft:redstone_ore");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType REDSTONE_TORCH = load("minecraft:redstone_torch");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType REINFORCED_DEEPSLATE = load("minecraft:reinforced_deepslate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType REPEATER = load("minecraft:repeater");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType REPEATING_COMMAND_BLOCK = load("minecraft:repeating_command_block");
    @Since(ProtocolVersion.MINECRAFT_1_21_4)
    public static final VeloItemType RESIN_BLOCK = load("minecraft:resin_block");
    @Since(ProtocolVersion.MINECRAFT_1_21_4)
    public static final VeloItemType RESIN_BRICK = load("minecraft:resin_brick");
    @Since(ProtocolVersion.MINECRAFT_1_21_4)
    public static final VeloItemType RESIN_BRICK_SLAB = load("minecraft:resin_brick_slab");
    @Since(ProtocolVersion.MINECRAFT_1_21_4)
    public static final VeloItemType RESIN_BRICK_STAIRS = load("minecraft:resin_brick_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_21_4)
    public static final VeloItemType RESIN_BRICK_WALL = load("minecraft:resin_brick_wall");
    @Since(ProtocolVersion.MINECRAFT_1_21_4)
    public static final VeloItemType RESIN_BRICKS = load("minecraft:resin_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_21_4)
    public static final VeloItemType RESIN_CLUMP = load("minecraft:resin_clump");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType RESPAWN_ANCHOR = load("minecraft:respawn_anchor");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType RIB_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:rib_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ROOTED_DIRT = load("minecraft:rooted_dirt");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ROSE_BUSH = load("minecraft:rose_bush");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ROTTEN_FLESH = load("minecraft:rotten_flesh");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SADDLE = load("minecraft:saddle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SALMON = load("minecraft:salmon");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SALMON_BUCKET = load("minecraft:salmon_bucket");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SALMON_SPAWN_EGG = load("minecraft:salmon_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SAND = load("minecraft:sand");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SANDSTONE = load("minecraft:sandstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SANDSTONE_SLAB = load("minecraft:sandstone_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SANDSTONE_STAIRS = load("minecraft:sandstone_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SANDSTONE_WALL = load("minecraft:sandstone_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SCAFFOLDING = load("minecraft:scaffolding");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType SCRAPE_POTTERY_SHERD = load("minecraft:scrape_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType SCULK = load("minecraft:sculk");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType SCULK_CATALYST = load("minecraft:sculk_catalyst");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SCULK_SENSOR = load("minecraft:sculk_sensor");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType SCULK_SHRIEKER = load("minecraft:sculk_shrieker");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType SCULK_VEIN = load("minecraft:sculk_vein");
    @Since(ProtocolVersion.MINECRAFT_1_18_2) @Until(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType SCUTE = load("minecraft:scute");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SEA_LANTERN = load("minecraft:sea_lantern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SEA_PICKLE = load("minecraft:sea_pickle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SEAGRASS = load("minecraft:seagrass");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:sentry_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:shaper_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType SHEAF_POTTERY_SHERD = load("minecraft:sheaf_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SHEARS = load("minecraft:shears");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SHEEP_SPAWN_EGG = load("minecraft:sheep_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType SHELTER_POTTERY_SHERD = load("minecraft:shelter_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SHIELD = load("minecraft:shield");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloItemType SHORT_DRY_GRASS = load("minecraft:short_dry_grass");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType SHORT_GRASS = load("minecraft:short_grass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SHROOMLIGHT = load("minecraft:shroomlight");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SHULKER_BOX = load("minecraft:shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SHULKER_SHELL = load("minecraft:shulker_shell");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SHULKER_SPAWN_EGG = load("minecraft:shulker_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:silence_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SILVERFISH_SPAWN_EGG = load("minecraft:silverfish_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SKELETON_HORSE_SPAWN_EGG = load("minecraft:skeleton_horse_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SKELETON_SKULL = load("minecraft:skeleton_skull");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SKELETON_SPAWN_EGG = load("minecraft:skeleton_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SKULL_BANNER_PATTERN = load("minecraft:skull_banner_pattern");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType SKULL_POTTERY_SHERD = load("minecraft:skull_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SLIME_BALL = load("minecraft:slime_ball");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SLIME_BLOCK = load("minecraft:slime_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SLIME_SPAWN_EGG = load("minecraft:slime_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMALL_AMETHYST_BUD = load("minecraft:small_amethyst_bud");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMALL_DRIPLEAF = load("minecraft:small_dripleaf");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMITHING_TABLE = load("minecraft:smithing_table");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMOKER = load("minecraft:smoker");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMOOTH_BASALT = load("minecraft:smooth_basalt");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMOOTH_QUARTZ = load("minecraft:smooth_quartz");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMOOTH_QUARTZ_SLAB = load("minecraft:smooth_quartz_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMOOTH_QUARTZ_STAIRS = load("minecraft:smooth_quartz_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMOOTH_RED_SANDSTONE = load("minecraft:smooth_red_sandstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMOOTH_RED_SANDSTONE_SLAB = load("minecraft:smooth_red_sandstone_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMOOTH_RED_SANDSTONE_STAIRS = load("minecraft:smooth_red_sandstone_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMOOTH_SANDSTONE = load("minecraft:smooth_sandstone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMOOTH_SANDSTONE_SLAB = load("minecraft:smooth_sandstone_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMOOTH_SANDSTONE_STAIRS = load("minecraft:smooth_sandstone_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMOOTH_STONE = load("minecraft:smooth_stone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SMOOTH_STONE_SLAB = load("minecraft:smooth_stone_slab");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType SNIFFER_EGG = load("minecraft:sniffer_egg");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType SNIFFER_SPAWN_EGG = load("minecraft:sniffer_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType SNORT_POTTERY_SHERD = load("minecraft:snort_pottery_sherd");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:snout_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SNOW = load("minecraft:snow");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SNOW_BLOCK = load("minecraft:snow_block");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType SNOW_GOLEM_SPAWN_EGG = load("minecraft:snow_golem_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SNOWBALL = load("minecraft:snowball");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SOUL_CAMPFIRE = load("minecraft:soul_campfire");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SOUL_LANTERN = load("minecraft:soul_lantern");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SOUL_SAND = load("minecraft:soul_sand");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SOUL_SOIL = load("minecraft:soul_soil");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SOUL_TORCH = load("minecraft:soul_torch");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPAWNER = load("minecraft:spawner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPECTRAL_ARROW = load("minecraft:spectral_arrow");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPIDER_EYE = load("minecraft:spider_eye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPIDER_SPAWN_EGG = load("minecraft:spider_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:spire_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPLASH_POTION = load("minecraft:splash_potion");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPONGE = load("minecraft:sponge");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPORE_BLOSSOM = load("minecraft:spore_blossom");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_BOAT = load("minecraft:spruce_boat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_BUTTON = load("minecraft:spruce_button");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType SPRUCE_CHEST_BOAT = load("minecraft:spruce_chest_boat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_DOOR = load("minecraft:spruce_door");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_FENCE = load("minecraft:spruce_fence");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_FENCE_GATE = load("minecraft:spruce_fence_gate");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType SPRUCE_HANGING_SIGN = load("minecraft:spruce_hanging_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_LEAVES = load("minecraft:spruce_leaves");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_LOG = load("minecraft:spruce_log");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_PLANKS = load("minecraft:spruce_planks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_PRESSURE_PLATE = load("minecraft:spruce_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_SAPLING = load("minecraft:spruce_sapling");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_SIGN = load("minecraft:spruce_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_SLAB = load("minecraft:spruce_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_STAIRS = load("minecraft:spruce_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_TRAPDOOR = load("minecraft:spruce_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPRUCE_WOOD = load("minecraft:spruce_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SPYGLASS = load("minecraft:spyglass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SQUID_SPAWN_EGG = load("minecraft:squid_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STICK = load("minecraft:stick");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STICKY_PISTON = load("minecraft:sticky_piston");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE = load("minecraft:stone");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE_AXE = load("minecraft:stone_axe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE_BRICK_SLAB = load("minecraft:stone_brick_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE_BRICK_STAIRS = load("minecraft:stone_brick_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE_BRICK_WALL = load("minecraft:stone_brick_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE_BRICKS = load("minecraft:stone_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE_BUTTON = load("minecraft:stone_button");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE_HOE = load("minecraft:stone_hoe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE_PICKAXE = load("minecraft:stone_pickaxe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE_PRESSURE_PLATE = load("minecraft:stone_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE_SHOVEL = load("minecraft:stone_shovel");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE_SLAB = load("minecraft:stone_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE_STAIRS = load("minecraft:stone_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONE_SWORD = load("minecraft:stone_sword");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STONECUTTER = load("minecraft:stonecutter");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRAY_SPAWN_EGG = load("minecraft:stray_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIDER_SPAWN_EGG = load("minecraft:strider_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRING = load("minecraft:string");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_ACACIA_LOG = load("minecraft:stripped_acacia_log");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_ACACIA_WOOD = load("minecraft:stripped_acacia_wood");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType STRIPPED_BAMBOO_BLOCK = load("minecraft:stripped_bamboo_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_BIRCH_LOG = load("minecraft:stripped_birch_log");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_BIRCH_WOOD = load("minecraft:stripped_birch_wood");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType STRIPPED_CHERRY_LOG = load("minecraft:stripped_cherry_log");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType STRIPPED_CHERRY_WOOD = load("minecraft:stripped_cherry_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_CRIMSON_HYPHAE = load("minecraft:stripped_crimson_hyphae");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_CRIMSON_STEM = load("minecraft:stripped_crimson_stem");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_DARK_OAK_LOG = load("minecraft:stripped_dark_oak_log");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_DARK_OAK_WOOD = load("minecraft:stripped_dark_oak_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_JUNGLE_LOG = load("minecraft:stripped_jungle_log");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_JUNGLE_WOOD = load("minecraft:stripped_jungle_wood");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType STRIPPED_MANGROVE_LOG = load("minecraft:stripped_mangrove_log");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType STRIPPED_MANGROVE_WOOD = load("minecraft:stripped_mangrove_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_OAK_LOG = load("minecraft:stripped_oak_log");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_OAK_WOOD = load("minecraft:stripped_oak_wood");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType STRIPPED_PALE_OAK_LOG = load("minecraft:stripped_pale_oak_log");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType STRIPPED_PALE_OAK_WOOD = load("minecraft:stripped_pale_oak_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_SPRUCE_LOG = load("minecraft:stripped_spruce_log");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_SPRUCE_WOOD = load("minecraft:stripped_spruce_wood");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_WARPED_HYPHAE = load("minecraft:stripped_warped_hyphae");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRIPPED_WARPED_STEM = load("minecraft:stripped_warped_stem");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRUCTURE_BLOCK = load("minecraft:structure_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType STRUCTURE_VOID = load("minecraft:structure_void");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SUGAR = load("minecraft:sugar");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SUGAR_CANE = load("minecraft:sugar_cane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SUNFLOWER = load("minecraft:sunflower");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType SUSPICIOUS_GRAVEL = load("minecraft:suspicious_gravel");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType SUSPICIOUS_SAND = load("minecraft:suspicious_sand");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SUSPICIOUS_STEW = load("minecraft:suspicious_stew");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType SWEET_BERRIES = load("minecraft:sweet_berries");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType TADPOLE_BUCKET = load("minecraft:tadpole_bucket");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType TADPOLE_SPAWN_EGG = load("minecraft:tadpole_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloItemType TALL_DRY_GRASS = load("minecraft:tall_dry_grass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TALL_GRASS = load("minecraft:tall_grass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TARGET = load("minecraft:target");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TERRACOTTA = load("minecraft:terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloItemType TEST_BLOCK = load("minecraft:test_block");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloItemType TEST_INSTANCE_BLOCK = load("minecraft:test_instance_block");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType TIDE_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:tide_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TINTED_GLASS = load("minecraft:tinted_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TIPPED_ARROW = load("minecraft:tipped_arrow");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TNT = load("minecraft:tnt");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TNT_MINECART = load("minecraft:tnt_minecart");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TORCH = load("minecraft:torch");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType TORCHFLOWER = load("minecraft:torchflower");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType TORCHFLOWER_SEEDS = load("minecraft:torchflower_seeds");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TOTEM_OF_UNDYING = load("minecraft:totem_of_undying");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TRADER_LLAMA_SPAWN_EGG = load("minecraft:trader_llama_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TRAPPED_CHEST = load("minecraft:trapped_chest");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType TRIAL_KEY = load("minecraft:trial_key");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType TRIAL_SPAWNER = load("minecraft:trial_spawner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TRIDENT = load("minecraft:trident");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TRIPWIRE_HOOK = load("minecraft:tripwire_hook");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TROPICAL_FISH = load("minecraft:tropical_fish");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TROPICAL_FISH_BUCKET = load("minecraft:tropical_fish_bucket");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TROPICAL_FISH_SPAWN_EGG = load("minecraft:tropical_fish_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TUBE_CORAL = load("minecraft:tube_coral");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TUBE_CORAL_BLOCK = load("minecraft:tube_coral_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TUBE_CORAL_FAN = load("minecraft:tube_coral_fan");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TUFF = load("minecraft:tuff");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType TUFF_BRICK_SLAB = load("minecraft:tuff_brick_slab");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType TUFF_BRICK_STAIRS = load("minecraft:tuff_brick_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType TUFF_BRICK_WALL = load("minecraft:tuff_brick_wall");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType TUFF_BRICKS = load("minecraft:tuff_bricks");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType TUFF_SLAB = load("minecraft:tuff_slab");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType TUFF_STAIRS = load("minecraft:tuff_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType TUFF_WALL = load("minecraft:tuff_wall");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TURTLE_EGG = load("minecraft:turtle_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TURTLE_HELMET = load("minecraft:turtle_helmet");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType TURTLE_SCUTE = load("minecraft:turtle_scute");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TURTLE_SPAWN_EGG = load("minecraft:turtle_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType TWISTING_VINES = load("minecraft:twisting_vines");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType VAULT = load("minecraft:vault");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType VERDANT_FROGLIGHT = load("minecraft:verdant_froglight");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType VEX_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:vex_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType VEX_SPAWN_EGG = load("minecraft:vex_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType VILLAGER_SPAWN_EGG = load("minecraft:villager_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType VINDICATOR_SPAWN_EGG = load("minecraft:vindicator_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType VINE = load("minecraft:vine");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WANDERING_TRADER_SPAWN_EGG = load("minecraft:wandering_trader_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType WARD_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:ward_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_19)
    public static final VeloItemType WARDEN_SPAWN_EGG = load("minecraft:warden_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_BUTTON = load("minecraft:warped_button");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_DOOR = load("minecraft:warped_door");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_FENCE = load("minecraft:warped_fence");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_FENCE_GATE = load("minecraft:warped_fence_gate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_FUNGUS = load("minecraft:warped_fungus");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_FUNGUS_ON_A_STICK = load("minecraft:warped_fungus_on_a_stick");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType WARPED_HANGING_SIGN = load("minecraft:warped_hanging_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_HYPHAE = load("minecraft:warped_hyphae");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_NYLIUM = load("minecraft:warped_nylium");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_PLANKS = load("minecraft:warped_planks");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_PRESSURE_PLATE = load("minecraft:warped_pressure_plate");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_ROOTS = load("minecraft:warped_roots");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_SIGN = load("minecraft:warped_sign");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_SLAB = load("minecraft:warped_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_STAIRS = load("minecraft:warped_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_STEM = load("minecraft:warped_stem");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_TRAPDOOR = load("minecraft:warped_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WARPED_WART_BLOCK = load("minecraft:warped_wart_block");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WATER_BUCKET = load("minecraft:water_bucket");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_CHISELED_COPPER = load("minecraft:waxed_chiseled_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_COPPER_BLOCK = load("minecraft:waxed_copper_block");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_COPPER_BULB = load("minecraft:waxed_copper_bulb");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_COPPER_DOOR = load("minecraft:waxed_copper_door");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_COPPER_GRATE = load("minecraft:waxed_copper_grate");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_COPPER_TRAPDOOR = load("minecraft:waxed_copper_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_CUT_COPPER = load("minecraft:waxed_cut_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_CUT_COPPER_SLAB = load("minecraft:waxed_cut_copper_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_CUT_COPPER_STAIRS = load("minecraft:waxed_cut_copper_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_EXPOSED_CHISELED_COPPER = load("minecraft:waxed_exposed_chiseled_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_EXPOSED_COPPER = load("minecraft:waxed_exposed_copper");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_EXPOSED_COPPER_BULB = load("minecraft:waxed_exposed_copper_bulb");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_EXPOSED_COPPER_DOOR = load("minecraft:waxed_exposed_copper_door");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_EXPOSED_COPPER_GRATE = load("minecraft:waxed_exposed_copper_grate");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_EXPOSED_COPPER_TRAPDOOR = load("minecraft:waxed_exposed_copper_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_EXPOSED_CUT_COPPER = load("minecraft:waxed_exposed_cut_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_EXPOSED_CUT_COPPER_SLAB = load("minecraft:waxed_exposed_cut_copper_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_EXPOSED_CUT_COPPER_STAIRS = load("minecraft:waxed_exposed_cut_copper_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_OXIDIZED_CHISELED_COPPER = load("minecraft:waxed_oxidized_chiseled_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_OXIDIZED_COPPER = load("minecraft:waxed_oxidized_copper");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_OXIDIZED_COPPER_BULB = load("minecraft:waxed_oxidized_copper_bulb");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_OXIDIZED_COPPER_DOOR = load("minecraft:waxed_oxidized_copper_door");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_OXIDIZED_COPPER_GRATE = load("minecraft:waxed_oxidized_copper_grate");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_OXIDIZED_COPPER_TRAPDOOR = load("minecraft:waxed_oxidized_copper_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_OXIDIZED_CUT_COPPER = load("minecraft:waxed_oxidized_cut_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_OXIDIZED_CUT_COPPER_SLAB = load("minecraft:waxed_oxidized_cut_copper_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_OXIDIZED_CUT_COPPER_STAIRS = load("minecraft:waxed_oxidized_cut_copper_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_WEATHERED_CHISELED_COPPER = load("minecraft:waxed_weathered_chiseled_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_WEATHERED_COPPER = load("minecraft:waxed_weathered_copper");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_WEATHERED_COPPER_BULB = load("minecraft:waxed_weathered_copper_bulb");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_WEATHERED_COPPER_DOOR = load("minecraft:waxed_weathered_copper_door");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_WEATHERED_COPPER_GRATE = load("minecraft:waxed_weathered_copper_grate");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WAXED_WEATHERED_COPPER_TRAPDOOR = load("minecraft:waxed_weathered_copper_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_WEATHERED_CUT_COPPER = load("minecraft:waxed_weathered_cut_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_WEATHERED_CUT_COPPER_SLAB = load("minecraft:waxed_weathered_cut_copper_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WAXED_WEATHERED_CUT_COPPER_STAIRS = load("minecraft:waxed_weathered_cut_copper_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_20)
    public static final VeloItemType WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:wayfinder_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WEATHERED_CHISELED_COPPER = load("minecraft:weathered_chiseled_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WEATHERED_COPPER = load("minecraft:weathered_copper");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WEATHERED_COPPER_BULB = load("minecraft:weathered_copper_bulb");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WEATHERED_COPPER_DOOR = load("minecraft:weathered_copper_door");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WEATHERED_COPPER_GRATE = load("minecraft:weathered_copper_grate");
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final VeloItemType WEATHERED_COPPER_TRAPDOOR = load("minecraft:weathered_copper_trapdoor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WEATHERED_CUT_COPPER = load("minecraft:weathered_cut_copper");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WEATHERED_CUT_COPPER_SLAB = load("minecraft:weathered_cut_copper_slab");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WEATHERED_CUT_COPPER_STAIRS = load("minecraft:weathered_cut_copper_stairs");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WEEPING_VINES = load("minecraft:weeping_vines");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WET_SPONGE = load("minecraft:wet_sponge");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHEAT = load("minecraft:wheat");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHEAT_SEEDS = load("minecraft:wheat_seeds");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_BANNER = load("minecraft:white_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_BED = load("minecraft:white_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType WHITE_BUNDLE = load("minecraft:white_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_CANDLE = load("minecraft:white_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_CARPET = load("minecraft:white_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_CONCRETE = load("minecraft:white_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_CONCRETE_POWDER = load("minecraft:white_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_DYE = load("minecraft:white_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_GLAZED_TERRACOTTA = load("minecraft:white_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType WHITE_HARNESS = load("minecraft:white_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_SHULKER_BOX = load("minecraft:white_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_STAINED_GLASS = load("minecraft:white_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_STAINED_GLASS_PANE = load("minecraft:white_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_TERRACOTTA = load("minecraft:white_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_TULIP = load("minecraft:white_tulip");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WHITE_WOOL = load("minecraft:white_wool");
    @Since(ProtocolVersion.MINECRAFT_1_19_4)
    public static final VeloItemType WILD_ARMOR_TRIM_SMITHING_TEMPLATE = load("minecraft:wild_armor_trim_smithing_template");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloItemType WILDFLOWERS = load("minecraft:wildflowers");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType WIND_CHARGE = load("minecraft:wind_charge");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WITCH_SPAWN_EGG = load("minecraft:witch_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WITHER_ROSE = load("minecraft:wither_rose");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WITHER_SKELETON_SKULL = load("minecraft:wither_skeleton_skull");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WITHER_SKELETON_SPAWN_EGG = load("minecraft:wither_skeleton_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_19_3)
    public static final VeloItemType WITHER_SPAWN_EGG = load("minecraft:wither_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloItemType WOLF_ARMOR = load("minecraft:wolf_armor");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WOLF_SPAWN_EGG = load("minecraft:wolf_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WOODEN_AXE = load("minecraft:wooden_axe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WOODEN_HOE = load("minecraft:wooden_hoe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WOODEN_PICKAXE = load("minecraft:wooden_pickaxe");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WOODEN_SHOVEL = load("minecraft:wooden_shovel");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WOODEN_SWORD = load("minecraft:wooden_sword");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WRITABLE_BOOK = load("minecraft:writable_book");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType WRITTEN_BOOK = load("minecraft:written_book");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType YELLOW_BANNER = load("minecraft:yellow_banner");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType YELLOW_BED = load("minecraft:yellow_bed");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloItemType YELLOW_BUNDLE = load("minecraft:yellow_bundle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType YELLOW_CANDLE = load("minecraft:yellow_candle");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType YELLOW_CARPET = load("minecraft:yellow_carpet");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType YELLOW_CONCRETE = load("minecraft:yellow_concrete");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType YELLOW_CONCRETE_POWDER = load("minecraft:yellow_concrete_powder");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType YELLOW_DYE = load("minecraft:yellow_dye");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType YELLOW_GLAZED_TERRACOTTA = load("minecraft:yellow_glazed_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_21_6)
    public static final VeloItemType YELLOW_HARNESS = load("minecraft:yellow_harness");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType YELLOW_SHULKER_BOX = load("minecraft:yellow_shulker_box");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType YELLOW_STAINED_GLASS = load("minecraft:yellow_stained_glass");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType YELLOW_STAINED_GLASS_PANE = load("minecraft:yellow_stained_glass_pane");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType YELLOW_TERRACOTTA = load("minecraft:yellow_terracotta");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType YELLOW_WOOL = load("minecraft:yellow_wool");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ZOGLIN_SPAWN_EGG = load("minecraft:zoglin_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ZOMBIE_HEAD = load("minecraft:zombie_head");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ZOMBIE_HORSE_SPAWN_EGG = load("minecraft:zombie_horse_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ZOMBIE_SPAWN_EGG = load("minecraft:zombie_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ZOMBIE_VILLAGER_SPAWN_EGG = load("minecraft:zombie_villager_spawn_egg");
    @Since(ProtocolVersion.MINECRAFT_1_18_2)
    public static final VeloItemType ZOMBIFIED_PIGLIN_SPAWN_EGG = load("minecraft:zombified_piglin_spawn_egg");

    public static VeloItemType getFromProtocolId(int protocolId, ProtocolVersion protocolVersion) {
        return LOADED_VELO_ITEM_TYPES_CACHE.get(protocolVersion).get(protocolId);
    }

    private static VeloItemType load(String name) {
        VeloItemType veloItemType = new VeloItemType(name, getProtocolIds(name));

        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_18_2, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_18_2), veloItemType);
        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_19), veloItemType);
        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_1, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_19_1), veloItemType);
        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_3, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_19_3), veloItemType);
        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_4, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_19_4), veloItemType);
        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_20), veloItemType);
        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_2, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_20_2), veloItemType);
        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_3, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_20_3), veloItemType);
        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_5, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_20_5), veloItemType);
        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_21), veloItemType);
        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_2, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_2), veloItemType);
        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_4, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_4), veloItemType);
        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_5, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_5), veloItemType);
        LOADED_VELO_ITEM_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_6, unused -> new HashMap<>())
                .put(veloItemType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_6), veloItemType);

        return veloItemType;
    }

    private static int[] getProtocolIds(String name) {
        ProtocolVersion[] supportedVersions = VeloItemType.SUPPORTED_VERSIONS;
        int[] protocolIds = new int[supportedVersions.length];

        for (int i = 0; i < supportedVersions.length; i++) {
            int nameProtocolId = ProtocolMappingsCache.RESOURCE_PROTOCOL_MAPPINGS.get(supportedVersions[i])
                    .mappings().get("minecraft:item").getOrDefault(name, -1);
            protocolIds[i] = nameProtocolId;
        }

        return protocolIds;
    }

}