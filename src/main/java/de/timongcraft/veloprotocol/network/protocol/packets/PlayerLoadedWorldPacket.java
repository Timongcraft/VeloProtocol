package de.timongcraft.veloprotocol.network.protocol.packets;

import com.google.common.annotations.Beta;
import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.VeloPacket;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import io.github._4drian3d.vpacketevents.api.register.PacketRegistration;
import io.netty.buffer.ByteBuf;

import static com.velocitypowered.api.network.ProtocolVersion.MINECRAFT_1_21_4;
import static com.velocitypowered.api.network.ProtocolVersion.MINECRAFT_1_21_6;

/**
 * (latest) Resource Id: 'minecraft:player_loaded'
 */
@SuppressWarnings("unused")
@Deprecated(since = "1.3.3", forRemoval = true) // will be removed when the pull request is merged - https://github.com/PaperMC/Velocity/pull/1541
@Beta
@Since(ProtocolVersion.MINECRAFT_1_21_4)
public class PlayerLoadedWorldPacket extends VeloPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(PlayerLoadedWorldPacket.class)
                .direction(ProtocolUtils.Direction.SERVERBOUND)
                .packetSupplier(PlayerLoadedWorldPacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x2A, MINECRAFT_1_21_4, encodeOnly)
                .mapping(0x2B, MINECRAFT_1_21_6, encodeOnly)
                .register();
    }

    public PlayerLoadedWorldPacket() {}

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion protocolVersion) {
        decoded = true;
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion protocolVersion) {
    }

}