package de.timongcraft.veloprotocol.network.protocol.advancements;

import com.velocitypowered.api.network.ProtocolVersion;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.velopacketimpl.utils.annotations.Until;

@SuppressWarnings("unused")
public class AdvancementTrigger {

    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String ALLAY_DROP_ITEM_ON_BLOCK = "minecraft:allay_drop_item_on_block";
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final String ANY_BLOCK_USE = "minecraft:any_block_use";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String AVOID_VIBRATION = "minecraft:avoid_vibration";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String BEE_NEST_DESTROYED = "minecraft:bee_nest_destroyed";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String BRED_ANIMALS = "minecraft:bred_animals";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String BREWED_POTION = "minecraft:brewed_potion";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String CHANGED_DIMENSION = "minecraft:changed_dimension";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String CHANNELED_LIGHTNING = "minecraft:channeled_lightning";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String CONSTRUCT_BEACON = "minecraft:construct_beacon";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String CONSUME_ITEM = "minecraft:consume_item";
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final String CRAFTER_RECIPE_CRAFTED = "minecraft:crafter_recipe_crafted";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String CURED_ZOMBIE_VILLAGER = "minecraft:cured_zombie_villager";
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final String DEFAULT_BLOCK_USE = "minecraft:default_block_use";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String EFFECTS_CHANGED = "minecraft:effects_changed";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String ENCHANTED_ITEM = "minecraft:enchanted_item";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String ENTER_BLOCK = "minecraft:enter_block";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String ENTITY_HURT_PLAYER = "minecraft:entity_hurt_player";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String ENTITY_KILLED_PLAYER = "minecraft:entity_killed_player";
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final String FALL_AFTER_EXPLOSION = "minecraft:fall_after_explosion";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String FALL_FROM_HEIGHT = "minecraft:fall_from_height";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String FILLED_BUCKET = "minecraft:filled_bucket";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String FISHING_ROD_HOOKED = "minecraft:fishing_rod_hooked";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String HERO_OF_THE_VILLAGE = "minecraft:hero_of_the_village";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String IMPOSSIBLE = "minecraft:impossible";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String INVENTORY_CHANGED = "minecraft:inventory_changed";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String ITEM_DURABILITY_CHANGED = "minecraft:item_durability_changed";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String ITEM_USED_ON_BLOCK = "minecraft:item_used_on_block";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String KILL_MOB_NEAR_SCULK_CATALYST = "minecraft:kill_mob_near_sculk_catalyst";
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final String KILLED_BY_ARROW = "minecraft:killed_by_arrow";
    @Since(ProtocolVersion.MINECRAFT_1_20_3) @Until(ProtocolVersion.MINECRAFT_1_21)
    public static final String KILLED_BY_CROSSBOW = "minecraft:killed_by_crossbow";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String LEVITATION = "minecraft:levitation";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String LIGHTNING_STRIKE = "minecraft:lightning_strike";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String LOCATION = "minecraft:location";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String NETHER_TRAVEL = "minecraft:nether_travel";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String PLACED_BLOCK = "minecraft:placed_block";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String PLAYER_GENERATES_CONTAINER_LOOT = "minecraft:player_generates_container_loot";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String PLAYER_HURT_ENTITY = "minecraft:player_hurt_entity";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String PLAYER_INTERACTED_WITH_ENTITY = "minecraft:player_interacted_with_entity";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String PLAYER_KILLED_ENTITY = "minecraft:player_killed_entity";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String RECIPE_CRAFTED = "minecraft:recipe_crafted";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String RECIPE_UNLOCKED = "minecraft:recipe_unlocked";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String RIDE_ENTITY_IN_LAVA = "minecraft:ride_entity_in_lava";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String SHOT_CROSSBOW = "minecraft:shot_crossbow";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String SLEPT_IN_BED = "minecraft:slept_in_bed";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String SLIDE_DOWN_BLOCK = "minecraft:slide_down_block";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String STARTED_RIDING = "minecraft:started_riding";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String SUMMONED_ENTITY = "minecraft:summoned_entity";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String TAME_ANIMAL = "minecraft:tame_animal";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String TARGET_HIT = "minecraft:target_hit";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String THROWN_ITEM_PICKED_UP_BY_ENTITY = "minecraft:thrown_item_picked_up_by_entity";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String THROWN_ITEM_PICKED_UP_BY_PLAYER = "minecraft:thrown_item_picked_up_by_player";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String TICK = "minecraft:tick";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String USED_ENDER_EYE = "minecraft:used_ender_eye";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String USED_TOTEM = "minecraft:used_totem";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String USING_ITEM = "minecraft:using_item";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String VILLAGER_TRADE = "minecraft:villager_trade";
    @Since(ProtocolVersion.MINECRAFT_1_20_3)
    public static final String VOLUNTARY_EXILE = "minecraft:voluntary_exile";

}