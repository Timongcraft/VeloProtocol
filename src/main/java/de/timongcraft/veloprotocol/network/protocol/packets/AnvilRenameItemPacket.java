package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.VeloPacket;
import io.github._4drian3d.vpacketevents.api.register.PacketRegistration;
import io.netty.buffer.ByteBuf;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * (latest) Resource Id: 'minecraft:rename_item'
 */
public class AnvilRenameItemPacket extends VeloPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(AnvilRenameItemPacket.class)
                .direction(ProtocolUtils.Direction.SERVERBOUND)
                .packetSupplier(AnvilRenameItemPacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x20, MINECRAFT_1_18_2, encodeOnly)
                .mapping(0x22, MINECRAFT_1_19, encodeOnly)
                .mapping(0x23, MINECRAFT_1_19_1, encodeOnly)
                .mapping(0x26, MINECRAFT_1_20_2, encodeOnly)
                .mapping(0x27, MINECRAFT_1_20_3, encodeOnly)
                .mapping(0x2A, MINECRAFT_1_20_5, encodeOnly)
                .mapping(0x2C, MINECRAFT_1_21_2, encodeOnly)
                .mapping(0x2E, MINECRAFT_1_21_4, encodeOnly)
                .mapping(0x2F, MINECRAFT_1_21_6, encodeOnly)
                .register();
    }

    //The item name may be no longer than 50 characters long, and if it is longer than that, then the rename is silently ignored.
    private String itemName;

    private AnvilRenameItemPacket() {}

    public AnvilRenameItemPacket(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        decoded = true;

        itemName = ProtocolUtils.readString(buf);
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        ProtocolUtils.writeString(buf, itemName);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

}