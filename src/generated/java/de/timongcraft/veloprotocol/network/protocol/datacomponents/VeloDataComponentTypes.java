package de.timongcraft.veloprotocol.network.protocol.datacomponents;

import com.velocitypowered.api.network.ProtocolVersion;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.velopacketimpl.utils.annotations.Until;
import de.timongcraft.veloprotocol.utils.network.protocol.ProtocolMappingsCache;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class VeloDataComponentTypes {

    private static final Map<ProtocolVersion, Map<Integer, VeloDataComponentType>> LOADED_VELO_DATA_COMPONENT_TYPES_CACHE = new HashMap<>();

    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType ATTRIBUTE_MODIFIERS = load("minecraft:attribute_modifiers");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType AXOLOTL_VARIANT = load("minecraft:axolotl/variant");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType BANNER_PATTERNS = load("minecraft:banner_patterns");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType BASE_COLOR = load("minecraft:base_color");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType BEES = load("minecraft:bees");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType BLOCK_ENTITY_DATA = load("minecraft:block_entity_data");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType BLOCK_STATE = load("minecraft:block_state");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType BLOCKS_ATTACKS = load("minecraft:blocks_attacks");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType BREAK_SOUND = load("minecraft:break_sound");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType BUCKET_ENTITY_DATA = load("minecraft:bucket_entity_data");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType BUNDLE_CONTENTS = load("minecraft:bundle_contents");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType CAN_BREAK = load("minecraft:can_break");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType CAN_PLACE_ON = load("minecraft:can_place_on");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType CAT_COLLAR = load("minecraft:cat/collar");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType CAT_VARIANT = load("minecraft:cat/variant");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType CHARGED_PROJECTILES = load("minecraft:charged_projectiles");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType CHICKEN_VARIANT = load("minecraft:chicken/variant");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloDataComponentType CONSUMABLE = load("minecraft:consumable");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType CONTAINER = load("minecraft:container");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType CONTAINER_LOOT = load("minecraft:container_loot");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType COW_VARIANT = load("minecraft:cow/variant");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType CREATIVE_SLOT_LOCK = load("minecraft:creative_slot_lock");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType CUSTOM_DATA = load("minecraft:custom_data");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType CUSTOM_MODEL_DATA = load("minecraft:custom_model_data");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType CUSTOM_NAME = load("minecraft:custom_name");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType DAMAGE = load("minecraft:damage");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloDataComponentType DAMAGE_RESISTANT = load("minecraft:damage_resistant");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloDataComponentType DEATH_PROTECTION = load("minecraft:death_protection");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType DEBUG_STICK_STATE = load("minecraft:debug_stick_state");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType DYED_COLOR = load("minecraft:dyed_color");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloDataComponentType ENCHANTABLE = load("minecraft:enchantable");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType ENCHANTMENT_GLINT_OVERRIDE = load("minecraft:enchantment_glint_override");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType ENCHANTMENTS = load("minecraft:enchantments");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType ENTITY_DATA = load("minecraft:entity_data");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloDataComponentType EQUIPPABLE = load("minecraft:equippable");
    @Since(ProtocolVersion.MINECRAFT_1_20_5) @Until(ProtocolVersion.MINECRAFT_1_21)
    public static final VeloDataComponentType FIRE_RESISTANT = load("minecraft:fire_resistant");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType FIREWORK_EXPLOSION = load("minecraft:firework_explosion");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType FIREWORKS = load("minecraft:fireworks");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType FOOD = load("minecraft:food");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType FOX_VARIANT = load("minecraft:fox/variant");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType FROG_VARIANT = load("minecraft:frog/variant");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloDataComponentType GLIDER = load("minecraft:glider");
    @Since(ProtocolVersion.MINECRAFT_1_20_5) @Until(ProtocolVersion.MINECRAFT_1_21_4)
    public static final VeloDataComponentType HIDE_ADDITIONAL_TOOLTIP = load("minecraft:hide_additional_tooltip");
    @Since(ProtocolVersion.MINECRAFT_1_20_5) @Until(ProtocolVersion.MINECRAFT_1_21_4)
    public static final VeloDataComponentType HIDE_TOOLTIP = load("minecraft:hide_tooltip");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType HORSE_VARIANT = load("minecraft:horse/variant");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType INSTRUMENT = load("minecraft:instrument");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType INTANGIBLE_PROJECTILE = load("minecraft:intangible_projectile");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloDataComponentType ITEM_MODEL = load("minecraft:item_model");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType ITEM_NAME = load("minecraft:item_name");
    @Since(ProtocolVersion.MINECRAFT_1_21)
    public static final VeloDataComponentType JUKEBOX_PLAYABLE = load("minecraft:jukebox_playable");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType LLAMA_VARIANT = load("minecraft:llama/variant");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType LOCK = load("minecraft:lock");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType LODESTONE_TRACKER = load("minecraft:lodestone_tracker");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType LORE = load("minecraft:lore");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType MAP_COLOR = load("minecraft:map_color");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType MAP_DECORATIONS = load("minecraft:map_decorations");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType MAP_ID = load("minecraft:map_id");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType MAP_POST_PROCESSING = load("minecraft:map_post_processing");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType MAX_DAMAGE = load("minecraft:max_damage");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType MAX_STACK_SIZE = load("minecraft:max_stack_size");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType MOOSHROOM_VARIANT = load("minecraft:mooshroom/variant");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType NOTE_BLOCK_SOUND = load("minecraft:note_block_sound");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType OMINOUS_BOTTLE_AMPLIFIER = load("minecraft:ominous_bottle_amplifier");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType PAINTING_VARIANT = load("minecraft:painting/variant");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType PARROT_VARIANT = load("minecraft:parrot/variant");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType PIG_VARIANT = load("minecraft:pig/variant");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType POT_DECORATIONS = load("minecraft:pot_decorations");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType POTION_CONTENTS = load("minecraft:potion_contents");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType POTION_DURATION_SCALE = load("minecraft:potion_duration_scale");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType PROFILE = load("minecraft:profile");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType PROVIDES_BANNER_PATTERNS = load("minecraft:provides_banner_patterns");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType PROVIDES_TRIM_MATERIAL = load("minecraft:provides_trim_material");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType RABBIT_VARIANT = load("minecraft:rabbit/variant");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType RARITY = load("minecraft:rarity");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType RECIPES = load("minecraft:recipes");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType REPAIR_COST = load("minecraft:repair_cost");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloDataComponentType REPAIRABLE = load("minecraft:repairable");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType SALMON_SIZE = load("minecraft:salmon/size");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType SHEEP_COLOR = load("minecraft:sheep/color");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType SHULKER_COLOR = load("minecraft:shulker/color");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType STORED_ENCHANTMENTS = load("minecraft:stored_enchantments");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType SUSPICIOUS_STEW_EFFECTS = load("minecraft:suspicious_stew_effects");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType TOOL = load("minecraft:tool");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType TOOLTIP_DISPLAY = load("minecraft:tooltip_display");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloDataComponentType TOOLTIP_STYLE = load("minecraft:tooltip_style");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType TRIM = load("minecraft:trim");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType TROPICAL_FISH_BASE_COLOR = load("minecraft:tropical_fish/base_color");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType TROPICAL_FISH_PATTERN = load("minecraft:tropical_fish/pattern");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType TROPICAL_FISH_PATTERN_COLOR = load("minecraft:tropical_fish/pattern_color");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType UNBREAKABLE = load("minecraft:unbreakable");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloDataComponentType USE_COOLDOWN = load("minecraft:use_cooldown");
    @Since(ProtocolVersion.MINECRAFT_1_21_2)
    public static final VeloDataComponentType USE_REMAINDER = load("minecraft:use_remainder");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType VILLAGER_VARIANT = load("minecraft:villager/variant");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType WEAPON = load("minecraft:weapon");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType WOLF_COLLAR = load("minecraft:wolf/collar");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType WOLF_SOUND_VARIANT = load("minecraft:wolf/sound_variant");
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    public static final VeloDataComponentType WOLF_VARIANT = load("minecraft:wolf/variant");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType WRITABLE_BOOK_CONTENT = load("minecraft:writable_book_content");
    @Since(ProtocolVersion.MINECRAFT_1_20_5)
    public static final VeloDataComponentType WRITTEN_BOOK_CONTENT = load("minecraft:written_book_content");

    public static VeloDataComponentType getFromProtocolId(int protocolId, ProtocolVersion protocolVersion) {
        return LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.get(protocolVersion).get(protocolId);
    }

    private static VeloDataComponentType load(String name) {
        VeloDataComponentType veloDataComponentType = new VeloDataComponentType(name, getProtocolIds(name));

        LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_18_2, unused -> new HashMap<>())
                .put(veloDataComponentType.getProtocolId(ProtocolVersion.MINECRAFT_1_18_2), veloDataComponentType);
        LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19, unused -> new HashMap<>())
                .put(veloDataComponentType.getProtocolId(ProtocolVersion.MINECRAFT_1_19), veloDataComponentType);
        LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_1, unused -> new HashMap<>())
                .put(veloDataComponentType.getProtocolId(ProtocolVersion.MINECRAFT_1_19_1), veloDataComponentType);
        LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_3, unused -> new HashMap<>())
                .put(veloDataComponentType.getProtocolId(ProtocolVersion.MINECRAFT_1_19_3), veloDataComponentType);
        LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_19_4, unused -> new HashMap<>())
                .put(veloDataComponentType.getProtocolId(ProtocolVersion.MINECRAFT_1_19_4), veloDataComponentType);
        LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20, unused -> new HashMap<>())
                .put(veloDataComponentType.getProtocolId(ProtocolVersion.MINECRAFT_1_20), veloDataComponentType);
        LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_2, unused -> new HashMap<>())
                .put(veloDataComponentType.getProtocolId(ProtocolVersion.MINECRAFT_1_20_2), veloDataComponentType);
        LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_3, unused -> new HashMap<>())
                .put(veloDataComponentType.getProtocolId(ProtocolVersion.MINECRAFT_1_20_3), veloDataComponentType);
        LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_20_5, unused -> new HashMap<>())
                .put(veloDataComponentType.getProtocolId(ProtocolVersion.MINECRAFT_1_20_5), veloDataComponentType);
        LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21, unused -> new HashMap<>())
                .put(veloDataComponentType.getProtocolId(ProtocolVersion.MINECRAFT_1_21), veloDataComponentType);
        LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_2, unused -> new HashMap<>())
                .put(veloDataComponentType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_2), veloDataComponentType);
        LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_4, unused -> new HashMap<>())
                .put(veloDataComponentType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_4), veloDataComponentType);
        LOADED_VELO_DATA_COMPONENT_TYPES_CACHE.computeIfAbsent(ProtocolVersion.MINECRAFT_1_21_5, unused -> new HashMap<>())
                .put(veloDataComponentType.getProtocolId(ProtocolVersion.MINECRAFT_1_21_5), veloDataComponentType);

        return veloDataComponentType;
    }

    private static int[] getProtocolIds(String name) {
        int[] protocolIds = new int[ProtocolMappingsCache.RESOURCE_PROTOCOL_MAPPINGS.size()];

        for (int i = 0; i < ProtocolMappingsCache.RESOURCE_PROTOCOL_MAPPINGS.size(); i++) {
            int nameProtocolId = ProtocolMappingsCache.RESOURCE_PROTOCOL_MAPPINGS.get(i).mappings().get("minecraft:data_component_type").getOrDefault(name, -1);
            protocolIds[i] = nameProtocolId;
        }

        return protocolIds;
    }

}