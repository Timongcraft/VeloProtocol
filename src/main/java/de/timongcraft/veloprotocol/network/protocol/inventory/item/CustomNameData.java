package de.timongcraft.veloprotocol.network.protocol.inventory.item;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.packet.chat.ComponentHolder;
import de.timongcraft.velopacketimpl.utils.ComponentUtils;
import de.timongcraft.velopacketimpl.utils.Either;
import de.timongcraft.velopacketimpl.utils.network.protocol.ExProtocolUtils;
import de.timongcraft.veloprotocol.network.protocol.datacomponents.VeloDataComponentType;
import de.timongcraft.veloprotocol.network.protocol.datacomponents.VeloDataComponentTypes;
import io.netty.buffer.ByteBuf;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.ApiStatus;

@SuppressWarnings("unused")
public class CustomNameData implements ComponentData {

    private Either<ComponentHolder, Component> name;

    public CustomNameData(Component name) {
        this.name = Either.secondary(name);
    }

    @ApiStatus.Internal
    public CustomNameData(ComponentHolder nameHolder) {
        this.name = Either.primary(nameHolder);
    }

    @Override
    public void write(ByteBuf buf, ProtocolVersion version) {
        ComponentData.super.write(buf, version);

        ExProtocolUtils.writeInternalComponent(buf, version, name);
    }

    @Override
    public VeloDataComponentType getType() {
        return VeloDataComponentTypes.CUSTOM_NAME;
    }

    public Component getName() {
        return ComponentUtils.getComponent(name);
    }

    public void setName(Component name) {
        this.name = Either.secondary(name);
    }

    @ApiStatus.Internal
    public void setName(ComponentHolder nameHolder) {
        this.name = Either.primary(nameHolder);
    }

}