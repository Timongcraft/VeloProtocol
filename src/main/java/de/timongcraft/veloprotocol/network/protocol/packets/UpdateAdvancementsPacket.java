package de.timongcraft.veloprotocol.network.protocol.packets;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.StateRegistry;
import de.timongcraft.velopacketimpl.network.protocol.packets.core.AbstractPacket;
import de.timongcraft.velopacketimpl.shaded.vpacketevents.api.register.PacketRegistration;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.veloprotocol.network.protocol.advancements.ProtocolAdvancement;
import de.timongcraft.veloprotocol.network.protocol.advancements.ProtocolAdvancementProgress;
import de.timongcraft.velopacketimpl.utils.network.protocol.ExProtocolUtils;
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
@Since(MINECRAFT_1_20_5)
public class UpdateAdvancementsPacket extends AbstractPacket {

    public static void register(boolean encodeOnly) {
        PacketRegistration.of(UpdateAdvancementsPacket.class)
                .direction(ProtocolUtils.Direction.CLIENTBOUND)
                .packetSupplier(UpdateAdvancementsPacket::new)
                .stateRegistry(StateRegistry.PLAY)
                .mapping(0x74, MINECRAFT_1_20_5, encodeOnly)
                .mapping(0x7B, MINECRAFT_1_21_4, encodeOnly)
                .register();
    }

    private boolean reset;
    private Map<String, ProtocolAdvancement> advancementsToAdd;
    private Set<String> advancementsToRemove;
    private Map<String, ProtocolAdvancementProgress> advancementProgresses;
    @Since(MINECRAFT_1_21_5)
    private boolean showToast;

    private UpdateAdvancementsPacket() {}

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
    public void decode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        throw new UnsupportedOperationException("Not implemented, requires VeloItemStack to be decodable");

        /*reset = buf.readBoolean();
        advancementsToAdd = ExProtocolUtils.readStringKeyMap(buf, () -> ProtocolAdvancement.of(buf, version));
        advancementsToRemove = ExProtocolUtils.readStringSet(buf);
        advancementProgresses = ExProtocolUtils.readStringKeyMap(buf, () -> ProtocolAdvancementProgress.of(buf));
        if (version.noLessThan(MINECRAFT_1_21_5)) {
            showToast = buf.readBoolean();
        }*/
    }

    @Override
    public void encode(ByteBuf buf, ProtocolUtils.Direction direction, ProtocolVersion version) {
        buf.writeBoolean(reset);
        ExProtocolUtils.writeStringKeyMap(buf, advancementsToAdd, advancement -> advancement.write(buf, version));
        ExProtocolUtils.writeCollection(buf, advancementsToRemove, key -> ProtocolUtils.writeString(buf, key));
        ExProtocolUtils.writeStringKeyMap(buf, advancementProgresses, advancementProgress ->
                advancementProgress.write(buf)
        );
        if (version.noLessThan(MINECRAFT_1_21_5)) {
            buf.writeBoolean(showToast);
        }
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