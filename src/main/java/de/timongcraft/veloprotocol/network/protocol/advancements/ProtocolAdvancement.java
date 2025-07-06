package de.timongcraft.veloprotocol.network.protocol.advancements;

import com.velocitypowered.api.network.ProtocolVersion;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.veloprotocol.utils.network.protocol.ExProtocolUtils;
import io.netty.buffer.ByteBuf;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.Set;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * The "Protocol" prefix signifies that this class is a minimal, serialization-only representation.
 */
@SuppressWarnings("unused")
@ApiStatus.Experimental
@Since(MINECRAFT_1_20_5)
public class ProtocolAdvancement {

    public static ProtocolAdvancement of(@Nullable String parentId, Set<Set<String>> requirements, boolean telemetryData) {
        return new ProtocolAdvancement(
                parentId,
                null,
                requirements,
                telemetryData
        );
    }

    public static ProtocolAdvancement of(@Nullable ProtocolAdvancementDisplay displayData, Set<Set<String>> requirements, boolean telemetryData) {
        return new ProtocolAdvancement(
                null,
                displayData,
                requirements,
                telemetryData
        );
    }

    public static ProtocolAdvancement of(@Nullable String parentId, @Nullable ProtocolAdvancementDisplay displayData, Set<Set<String>> requirements, boolean telemetryData) {
        return new ProtocolAdvancement(
                parentId,
                displayData,
                requirements,
                telemetryData
        );
    }

    public static ProtocolAdvancement of(ByteBuf buf, ProtocolVersion version) {
        return new ProtocolAdvancement(
                ExProtocolUtils.readOptString(buf),
                ExProtocolUtils.readOpt(buf, () -> ProtocolAdvancementDisplay.of(buf, version)),
                ExProtocolUtils.readSetOfStringSets(buf),
                buf.readBoolean()
        );
    }

    private @Nullable String parentId;
    private @Nullable ProtocolAdvancementDisplay displayData;
    /**
     * You can use the {@link AdvancementTrigger} constants,
     * tough they only exist since 1.20.3 since minecraft only added them as registry since then.
     */
    private Set<Set<String>> requirements;
    private boolean telemetryData;

    private ProtocolAdvancement(@Nullable String parentId, @Nullable ProtocolAdvancementDisplay displayData, Set<Set<String>> requirements, boolean telemetryData) {
        this.parentId = parentId;
        this.displayData = displayData;
        this.requirements = Collections.unmodifiableSet(requirements);
        this.telemetryData = telemetryData;
    }

    public void write(ByteBuf buf, ProtocolVersion protocolVersion) {
        ExProtocolUtils.writeOptString(buf, parentId);
        ExProtocolUtils.writeOpt(buf, displayData, presentDisplay -> presentDisplay.write(buf, protocolVersion));
        ExProtocolUtils.writeSetOfStringSets(buf, requirements);
        buf.writeBoolean(telemetryData);
    }

    public @Nullable String getParentId() {
        return parentId;
    }

    public void setParentId(@Nullable String parentId) {
        this.parentId = parentId;
    }

    public @Nullable ProtocolAdvancementDisplay getDisplayData() {
        return displayData;
    }

    public void setDisplayData(@Nullable ProtocolAdvancementDisplay displayData) {
        this.displayData = displayData;
    }

    public Set<Set<String>> getRequirements() {
        return requirements;
    }

    public void setRequirements(Set<Set<String>> requirements) {
        this.requirements = requirements;
    }

    public boolean isTelemetryData() {
        return telemetryData;
    }

    public void setTelemetryData(boolean telemetryData) {
        this.telemetryData = telemetryData;
    }

}