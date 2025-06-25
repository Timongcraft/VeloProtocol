package de.timongcraft.veloprotocol.network.protocol.items;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.veloprotocol.network.protocol.datacomponents.VeloDataComponentType;
import io.netty.buffer.ByteBuf;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@ApiStatus.Internal
@Since(ProtocolVersion.MINECRAFT_1_20_5)
public class VeloItemStack {

    public static VeloItemStack of(VeloItemType itemType) {
        return of(itemType, 1);
    }

    public static VeloItemStack of(VeloItemType itemType, int amount) {
        return of(itemType, amount, new HashMap<>());
    }

    public static VeloItemStack of(VeloItemType itemType, int amount,
                                   Map<VeloDataComponentType, Optional<ComponentData>> setComponents) {
        return new VeloItemStack(itemType, amount, setComponents, new ArrayList<>());
    }

    public static VeloItemStack of(VeloItemType itemType, int amount,
                                   Map<VeloDataComponentType, Optional<ComponentData>> setComponents,
                                   List<VeloDataComponentType> removedComponents) {
        return new VeloItemStack(itemType, amount, setComponents, removedComponents);
    }

    public static VeloItemStack of(ByteBuf buf, ProtocolVersion version) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public static void write(ByteBuf buf, @Nullable VeloItemStack item, ProtocolVersion version) {
        if (item == null) {
            ProtocolUtils.writeVarInt(buf, 0);
        } else {
            item.write(buf, version);
        }
    }

    private final VeloItemType itemType;
    private int amount;
    private final Map<VeloDataComponentType, Optional<ComponentData>> setComponents;
    private final List<VeloDataComponentType> removedComponents;

    private VeloItemStack(VeloItemType itemType, int amount,
                          Map<VeloDataComponentType, Optional<ComponentData>> setComponents,
                          List<VeloDataComponentType> removedComponents) {
        this.itemType = itemType;
        this.amount = amount;
        this.setComponents = setComponents;
        this.removedComponents = removedComponents;
    }

    public void write(ByteBuf buf, ProtocolVersion version) {
        ProtocolUtils.writeVarInt(buf, amount);
        ProtocolUtils.writeVarInt(buf, itemType.getProtocolId(version));

        writeComponentChanges(buf, version);
    }

    private void writeComponentChanges(ByteBuf buf, ProtocolVersion version) {
        ProtocolUtils.writeVarInt(buf, setComponents.size());
        ProtocolUtils.writeVarInt(buf, removedComponents.size());

        for (var entry : setComponents.entrySet()) {
            entry.getValue().ifPresentOrElse(componentData -> componentData.write(buf, version),
                    () -> ComponentData.writeNonValued(entry.getKey(), buf, version));
        }
    }

    public VeloItemType getType() {
        return itemType;
    }

    public int getAmount() {
        return amount;
    }

    public VeloItemStack setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Gets the value for the data component type on this stack for valued data component types.
     *
     * @see #hasData(VeloDataComponentType)
     */
    @ApiStatus.Experimental
    public <T extends ComponentData> @Nullable T getData(VeloDataComponentType type) {
        return (T) setComponents.get(type).orElse(null);
    }

    /**
     * Checks if the data component type is set on the itemstack.
     */
    @ApiStatus.Experimental
    public boolean hasData(VeloDataComponentType type) {
        return setComponents.containsKey(type);
    }

    /**
     * Sets the value of the data component type for this itemstack. To
     * reset the value to the default for the {@link #getType() item type}, use
     * {@link #resetData(VeloDataComponentType)}. To mark the data component type
     * as removed, use {@link #unsetData(VeloDataComponentType)}.
     */
    @ApiStatus.Experimental
    public <T extends ComponentData> VeloItemStack setData(T componentData) {
        removedComponents.remove(componentData.getType());
        setComponents.put(componentData.getType(), Optional.of(componentData));
        return this;
    }

    /**
     * Marks this non-valued data component type as present in this itemstack.
     *
     * @implNote Due to the data generated reports not containing whether a component has a value,
     * VeloProtocol cannot perform validation. As a result, you will only encounter an error on the client.
     */
    @ApiStatus.Experimental
    public VeloItemStack setData(VeloDataComponentType type) {
        removedComponents.remove(type);
        setComponents.put(type, Optional.empty());
        return this;
    }

    /**
     * Marks this data component as removed for this itemstack.
     */
    @ApiStatus.Experimental
    public VeloItemStack unsetData(VeloDataComponentType type) {
        setComponents.remove(type);
        removedComponents.add(type);
        return this;
    }

    /**
     * Resets the value of this component.
     */
    @ApiStatus.Experimental
    public VeloItemStack resetData(VeloDataComponentType type) {
        setComponents.remove(type);
        removedComponents.remove(type);
        return this;
    }

}