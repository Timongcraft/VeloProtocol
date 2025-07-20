package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import com.velocitypowered.proxy.protocol.packet.chat.ComponentHolder;
import de.timongcraft.velopacketimpl.network.protocol.packets.VeloPacket;
import de.timongcraft.velopacketimpl.utils.ComponentUtils;
import de.timongcraft.velopacketimpl.utils.Either;
import de.timongcraft.velopacketimpl.utils.network.protocol.ExProtocolUtils;
import de.timongcraft.veloprotocol.network.protocol.inventory.container.VeloContainerType;
import de.timongcraft.veloprotocol.network.protocol.inventory.container.VeloContainerTypes;
import io.github._4drian3d.vpacketevents.api.register.PacketRegistration;
import io.netty.buffer.ByteBuf;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.ApiStatus;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * (latest) Resource Id: 'minecraft:open_screen'
 */
@SuppressWarnings("unused")
public class ContainerOpenPacket extends VeloPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(ContainerOpenPacket.class)
                .direction(ProtocolUtils.Direction.CLIENTBOUND)
                .packetSupplier(ContainerOpenPacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x2E, MINECRAFT_1_18_2, encodeOnly)
                .mapping(0x2B, MINECRAFT_1_19, encodeOnly)
                .mapping(0x2D, MINECRAFT_1_19_1, encodeOnly)
                .mapping(0x2C, MINECRAFT_1_19_3, encodeOnly)
                .mapping(0x30, MINECRAFT_1_19_4, encodeOnly)
                .mapping(0x31, MINECRAFT_1_20_2, encodeOnly)
                .mapping(0x33, MINECRAFT_1_20_5, encodeOnly)
                .mapping(0x35, MINECRAFT_1_21_2, encodeOnly)
                .mapping(0x34, MINECRAFT_1_21_5, encodeOnly)
                .register();
    }

    private int windowId;
    private VeloContainerType containerType;

    private Either<ComponentHolder, Component> title;

    private ContainerOpenPacket() {}

    public ContainerOpenPacket(int windowId, VeloContainerType containerType, Component title) {
        this.windowId = windowId;
        this.containerType = containerType;
        this.title = Either.secondary(title);
    }

    @ApiStatus.Internal
    public ContainerOpenPacket(int windowId, VeloContainerType containerType, ComponentHolder titleHolder) {
        this.windowId = windowId;
        this.containerType = containerType;
        this.title = Either.primary(titleHolder);
    }

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        windowId = ProtocolUtils.readVarInt(buf);
        containerType = VeloContainerTypes.getFromProtocolId(ProtocolUtils.readVarInt(buf), version);
        title = Either.primary(ExProtocolUtils.readComponentHolder(buf, version));
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        ProtocolUtils.writeVarInt(buf, windowId);
        ProtocolUtils.writeVarInt(buf, containerType.getProtocolId(version));
        ExProtocolUtils.writeInternalComponent(buf, version, title);
    }

    public int getWindowId() {
        return windowId;
    }

    public void setWindowId(int windowId) {
        this.windowId = windowId;
    }

    public VeloContainerType getContainerType() {
        return containerType;
    }

    public void setContainerType(VeloContainerType containerType) {
        this.containerType = containerType;
    }

    public Component getTitle() {
        return ComponentUtils.getComponent(title);
    }

    public void setTitle(Component title) {
        this.title = Either.secondary(title);
    }

    @ApiStatus.Internal
    public void setTitle(ComponentHolder titleHolder) {
        this.title = Either.primary(titleHolder);
    }

}