package de.timongcraft.veloprotocol.network.protocol.advancements;

import com.google.common.collect.Sets;
import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.velopacketimpl.utils.annotations.Until;
import de.timongcraft.velopacketimpl.utils.network.protocol.ExProtocolUtils;
import io.netty.buffer.ByteBuf;
import java.util.Collections;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * The "Protocol" prefix signifies that this class is a minimal, serialization-only representation.
 */
@SuppressWarnings("unused")
@Since(MINECRAFT_1_20_5)
public class ProtocolAdvancement {

    public static ProtocolAdvancement of(@Nullable String parentId, Set<Set<String>> requirements, boolean telemetryData) {
        return new ProtocolAdvancement(
                parentId,
                null,
                requirements,
                telemetryData,
                0, 0
        );
    }

    public static ProtocolAdvancement of(@Nullable ProtocolAdvancementDisplay displayData, Set<Set<String>> requirements, boolean telemetryData) {
        return new ProtocolAdvancement(
                null,
                displayData,
                requirements,
                telemetryData,
                0, 0
        );
    }

    @Until(MINECRAFT_26_2)
    public static ProtocolAdvancement of(@Nullable String parentId, @Nullable ProtocolAdvancementDisplay displayData, Set<Set<String>> requirements, boolean telemetryData) {
        return new ProtocolAdvancement(
                parentId,
                displayData,
                requirements,
                telemetryData,
                0, 0
        );
    }

    @Since(MINECRAFT_26_3)
    public static ProtocolAdvancement of(@Nullable String parentId, @Nullable ProtocolAdvancementDisplay displayData, Set<Set<String>> requirements, boolean telemetryData, float x, float y) {
        return new ProtocolAdvancement(
                parentId,
                displayData,
                requirements,
                telemetryData,
                x, y
        );
    }

    public static ProtocolAdvancement of(ByteBuf buf, ProtocolVersion version) {
        String parentId = ExProtocolUtils.readOptString(buf);
        ProtocolAdvancementDisplay displayData = ExProtocolUtils.readOpt(buf, () -> ProtocolAdvancementDisplay.of(buf, version));
        Set<Set<String>> requirements = ExProtocolUtils.readCollection(buf, Sets::newHashSetWithExpectedSize, () ->
                ExProtocolUtils.readCollection(buf, Sets::newHashSetWithExpectedSize, () ->
                        ProtocolUtils.readString(buf)));
        boolean telemetryData = buf.readBoolean();

        if (version.noLessThan(MINECRAFT_26_3)) {
            return new ProtocolAdvancement(parentId, displayData, requirements, telemetryData, buf.readFloat(), buf.readFloat());
        } else {
            return new ProtocolAdvancement(parentId, displayData, requirements, telemetryData, 0, 0);
        }
    }

    private @Nullable String parentId;
    private @Nullable ProtocolAdvancementDisplay displayData;
    /**
     * You can use the {@link AdvancementTrigger} constants,
     * tough they only exist since 1.20.3 since minecraft only added them as registry since then.
     */
    private Set<Set<String>> requirements;
    private boolean telemetryData;
    @Since(MINECRAFT_26_3)
    private float x;
    @Since(MINECRAFT_26_3)
    private float y;

    private ProtocolAdvancement(@Nullable String parentId, @Nullable ProtocolAdvancementDisplay displayData, Set<Set<String>> requirements, boolean telemetryData, float x, float y) {
        this.parentId = parentId;
        this.displayData = displayData;
        this.requirements = Collections.unmodifiableSet(requirements);
        this.telemetryData = telemetryData;
        this.x = x;
        this.y = y;
    }

    public void write(ByteBuf buf, ProtocolVersion version) {
        ExProtocolUtils.writeOptString(buf, parentId);
        ExProtocolUtils.writeOpt(buf, displayData, presentDisplay -> presentDisplay.write(buf, version));
        ExProtocolUtils.writeCollection(buf, requirements, innerSet ->
                ExProtocolUtils.writeCollection(buf, innerSet, key ->
                        ProtocolUtils.writeString(buf, key)));
        buf.writeBoolean(telemetryData);

        if (version.noLessThan(MINECRAFT_26_3)) {
            buf.writeFloat(x);
            buf.writeFloat(y);
        }
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

    @Since(MINECRAFT_26_3)
    public float getX() {
        return x;
    }

    @Since(MINECRAFT_26_3)
    public void setX(float x) {
        this.x = x;
    }

    @Since(MINECRAFT_26_3)
    public float getY() {
        return y;
    }

    @Since(MINECRAFT_26_3)
    public void setY(float y) {
        this.y = y;
    }

}