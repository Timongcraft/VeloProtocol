package de.timongcraft.veloprotocol.utils.network.protocol;

@SuppressWarnings("unused")
public class RegistryEntriesPreLoader {

    public static void loadAdvancementTriggers() {
        load("de.timongcraft.veloprotocol.network.protocol.advancements.AdvancementTrigger");
    }

    public static void loadVeloSounds() {
        load("de.timongcraft.veloprotocol.network.protocol.sounds.VeloSounds");
    }

    public static void loadVeloItemTypes() {
        load("de.timongcraft.veloprotocol.network.protocol.inventory.item.VeloItemTypes");
    }

    public static void loadVeloEntityEffects() {
        load("de.timongcraft.veloprotocol.network.protocol.effects.VeloEntityEffects");
    }

    public static void loadVeloBlockEntityTypes() {
        load("de.timongcraft.veloprotocol.network.protocol.blockentities.VeloBlockEntityTypes");
    }

    public static void loadVeloDataComponentTypes() {
        load("de.timongcraft.veloprotocol.network.protocol.datacomponents.VeloDataComponentTypes");
    }

    public static void loadVeloContainerTypes() {
        load("de.timongcraft.veloprotocol.network.protocol.inventory.container.VeloContainerTypes");
    }

    private static void load(String name) {
        try {
            Class.forName(name);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private RegistryEntriesPreLoader() {}

}