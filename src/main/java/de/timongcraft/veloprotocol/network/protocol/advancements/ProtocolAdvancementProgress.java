package de.timongcraft.veloprotocol.network.protocol.advancements;

import com.velocitypowered.api.network.ProtocolVersion;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.veloprotocol.utils.network.protocol.ExProtocolUtils;
import io.netty.buffer.ByteBuf;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/**
 * The "Protocol" prefix signifies that this class is a minimal, serialization-only representation.
 */
@SuppressWarnings("unused")
@ApiStatus.Experimental
@Since(ProtocolVersion.MINECRAFT_1_20_2)
public class ProtocolAdvancementProgress {

    public static ProtocolAdvancementProgress of(@Nullable Map<String, CriterionProgress> criteriaProgresses) {
        if (criteriaProgresses == null)
            criteriaProgresses = new HashMap<>();

        return new ProtocolAdvancementProgress(criteriaProgresses);
    }

    public static ProtocolAdvancementProgress of(ByteBuf buf) {
        return new ProtocolAdvancementProgress(
                ExProtocolUtils.readStringKeyMap(buf, () -> CriterionProgress.of(buf))
        );
    }

    private final Map<String, CriterionProgress> criteriaProgresses;

    private ProtocolAdvancementProgress(Map<String, CriterionProgress> criteriaProgresses) {
        this.criteriaProgresses = criteriaProgresses;
    }

    public void write(ByteBuf buf) {
        ExProtocolUtils.writeStringKeyMap(buf, criteriaProgresses, progress -> progress.write(buf));
    }

    public boolean obtain(String name) {
        CriterionProgress criterionProgress = criteriaProgresses.get(name);
        if (criterionProgress != null && !criterionProgress.isObtained()) {
            criterionProgress.obtain();
            return true;
        } else {
            return false;
        }
    }

    public boolean reset(String name) {
        CriterionProgress criterionProgress = criteriaProgresses.get(name);
        if (criterionProgress != null && criterionProgress.isObtained()) {
            criterionProgress.reset();
            return true;
        } else {
            return false;
        }
    }

    public Map<String, CriterionProgress> getCriteriaProgresses() {
        return criteriaProgresses;
    }

    public static class CriterionProgress {

        public static CriterionProgress of(@Nullable Instant obtainedTime) {
            return new CriterionProgress(obtainedTime);
        }

        public static CriterionProgress of(ByteBuf buf) {
            return new CriterionProgress(
                    ExProtocolUtils.readOpt(buf, () -> Instant.ofEpochMilli(buf.readLong()))
            );
        }

        private @Nullable Instant obtainedTime;

        private CriterionProgress(@Nullable Instant obtainedTime) {
            this.obtainedTime = obtainedTime;
        }

        public void write(ByteBuf buf) {
            ExProtocolUtils.writeOpt(buf, obtainedTime,
                    presentObtainedTime -> buf.writeLong(presentObtainedTime.toEpochMilli()));
        }

        public void obtain() {
            this.obtainedTime = Instant.now();
        }

        public void reset() {
            this.obtainedTime = null;
        }

        public boolean isObtained() {
            //should only be present if obtained
            return this.obtainedTime != null;
        }

        public @Nullable Instant getObtainedTime() {
            return obtainedTime;
        }

        public void setObtainedTime(@Nullable Instant obtainedTime) {
            this.obtainedTime = obtainedTime;
        }

    }

}