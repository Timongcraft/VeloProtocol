package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.connection.MinecraftSessionHandler;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.VeloPacket;
import de.timongcraft.velopacketimpl.shaded.vpacketevents.api.register.PacketRegistration;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.veloprotocol.network.protocol.advancements.ProtocolAdvancement;
import de.timongcraft.veloprotocol.network.protocol.advancements.ProtocolAdvancementProgress;
import de.timongcraft.veloprotocol.utils.network.protocol.ExProtocolUtils;
import io.netty.buffer.ByteBuf;
import org.jetbrains.annotations.ApiStatus;

import java.util.Map;
import java.util.Set;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * (latest) Resource Id: 'minecraft:update_advancements'
 */
@SuppressWarnings("unused")
@ApiStatus.Experimental
@Since(MINECRAFT_1_20_2)
public class UpdateAdvancementsPacket extends VeloPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(UpdateAdvancementsPacket.class)
                .direction(ProtocolUtils.Direction.CLIENTBOUND)
                .packetSupplier(UpdateAdvancementsPacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x6C, MINECRAFT_1_20_2, encodeOnly)
                .mapping(0x70, MINECRAFT_1_20_3, encodeOnly)
                .mapping(0x74, MINECRAFT_1_20_5, encodeOnly)
                .mapping(0x74, MINECRAFT_1_21, encodeOnly)
                .mapping(0x74, MINECRAFT_1_21_2, encodeOnly)
                .mapping(0x7B, MINECRAFT_1_21_4, encodeOnly)
                .register();
    }

    private boolean reset;
    private Map<String, ProtocolAdvancement> advancementsToAdd;
    private Set<String> advancementsToRemove;
    private Map<String, ProtocolAdvancementProgress> advancementProgresses;
    @Since(ProtocolVersion.MINECRAFT_1_21_5)
    private boolean showToast;

    public UpdateAdvancementsPacket() {}

    public UpdateAdvancementsPacket(boolean reset,
                                    Map<String, ProtocolAdvancement> advancementsToAdd,
                                    Set<String> advancementsToRemove,
                                    Map<String, ProtocolAdvancementProgress> advancementProgresses,
                                    boolean showToast) {
        this.reset = reset;
        this.advancementsToAdd = advancementsToAdd;
        this.advancementsToRemove = advancementsToRemove;
        this.advancementProgresses = advancementProgresses;
        this.showToast = showToast;
    }

    @Override
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion protocolVersion) {
        throw new UnsupportedOperationException("Not implemented, requires VeloItemStack to be decodable");

        /*reset = buf.readBoolean();
        advancementsToAdd = ExProtocolUtils.readStringKeyMap(buf, () -> ProtocolAdvancement.of(buf, protocolVersion));
        advancementsToRemove = ExProtocolUtils.readStringSet(buf);
        advancementProgresses = ExProtocolUtils.readStringKeyMap(buf, () -> ProtocolAdvancementProgress.of(buf));
        if (protocolVersion.noLessThan(MINECRAFT_1_21_5)) {
            showToast = buf.readBoolean();
        }*/
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion protocolVersion) {
        buf.writeBoolean(reset);
        ExProtocolUtils.writeStringKeyMap(buf, advancementsToAdd, advancement -> advancement.write(buf, protocolVersion));
        ExProtocolUtils.writeStringSet(buf, advancementsToRemove);
        ExProtocolUtils.writeStringKeyMap(buf, advancementProgresses, advancementProgress ->
                advancementProgress.write(buf)
        );
        if (protocolVersion.noLessThan(MINECRAFT_1_21_5)) {
            buf.writeBoolean(showToast);
        }
    }

    @Override
    public boolean handle(MinecraftSessionHandler minecraftSessionHandler) {
        return false;
    }

    public boolean isReset() {
        return reset;
    }

    public void setReset(boolean reset) {
        this.reset = reset;
    }

    public Map<String, ProtocolAdvancement> getAdvancementsToAdd() {
        return advancementsToAdd;
    }

    public void setAdvancementsToAdd(Map<String, ProtocolAdvancement> advancementsToAdd) {
        this.advancementsToAdd = advancementsToAdd;
    }

    public Set<String> getAdvancementsToRemove() {
        return advancementsToRemove;
    }

    public void setAdvancementsToRemove(Set<String> advancementsToRemove) {
        this.advancementsToRemove = advancementsToRemove;
    }

    public Map<String, ProtocolAdvancementProgress> getAdvancementProgresses() {
        return advancementProgresses;
    }

    public void setAdvancementProgresses(Map<String, ProtocolAdvancementProgress> advancementProgresses) {
        this.advancementProgresses = advancementProgresses;
    }

    public boolean isShowToast() {
        return showToast;
    }

    public void setShowToast(boolean showToast) {
        this.showToast = showToast;
    }

}