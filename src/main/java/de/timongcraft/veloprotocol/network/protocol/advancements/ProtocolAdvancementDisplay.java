package de.timongcraft.veloprotocol.network.protocol.advancements;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.packet.chat.ComponentHolder;
import de.timongcraft.velopacketimpl.utils.ComponentUtils;
import de.timongcraft.velopacketimpl.utils.Either;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.velopacketimpl.utils.annotations.Until;
import de.timongcraft.veloprotocol.network.protocol.items.VeloItemStack;
import de.timongcraft.velopacketimpl.utils.network.protocol.ExProtocolUtils;
import io.netty.buffer.ByteBuf;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import static com.velocitypowered.api.network.ProtocolVersion.*;

/**
 * The "Protocol" prefix signifies that this class is a minimal, serialization-only representation.
 */
@SuppressWarnings("unused")
@ApiStatus.Experimental
@Since(MINECRAFT_1_20_5)
public class ProtocolAdvancementDisplay {

    @Until(MINECRAFT_1_21_4)
    private static final String LEGACY_BACKGROUND_TEXTURE_PREFIX = "texture/";
    @Until(MINECRAFT_1_21_4)
    private static final String LEGACY_BACKGROUND_TEXTURE_SUFFIX = ".png";

    // since 1.21.5 no more 'textures/' prefix and '.png' suffix
    public static String formatBackgroundTextureForVersion(String backgroundTexture, ProtocolVersion version) {
        if (version.greaterThan(MINECRAFT_1_21_4)) {
            if (backgroundTexture.startsWith(LEGACY_BACKGROUND_TEXTURE_PREFIX)) {
                backgroundTexture = backgroundTexture.substring(LEGACY_BACKGROUND_TEXTURE_PREFIX.length());
            }

            if (backgroundTexture.endsWith(LEGACY_BACKGROUND_TEXTURE_SUFFIX)) {
                backgroundTexture = backgroundTexture.substring(0,
                        backgroundTexture.length() - LEGACY_BACKGROUND_TEXTURE_SUFFIX.length());
            }
        } else {
            if (!backgroundTexture.startsWith(LEGACY_BACKGROUND_TEXTURE_PREFIX)) {
                backgroundTexture = LEGACY_BACKGROUND_TEXTURE_PREFIX + backgroundTexture;
            }

            if (!backgroundTexture.endsWith(LEGACY_BACKGROUND_TEXTURE_SUFFIX)) {
                backgroundTexture += LEGACY_BACKGROUND_TEXTURE_SUFFIX;
            }
        }

        return backgroundTexture;
    }

    public static ProtocolAdvancementDisplay of(Component title, Component description, VeloItemStack icon,
                                                boolean showToast, boolean hidden) {
        return new ProtocolAdvancementDisplay(
                title,
                description,
                icon,
                FrameType.TASK,
                null,
                showToast,
                hidden,
                0, 0
        );
    }

    public static ProtocolAdvancementDisplay of(Component title, Component description, VeloItemStack icon, FrameType frameType,
                                                boolean showToast, boolean hidden) {
        return new ProtocolAdvancementDisplay(
                title,
                description,
                icon,
                frameType,
                null,
                showToast,
                hidden,
                0,
                0)
                ;
    }

    public static ProtocolAdvancementDisplay of(Component title, Component description, VeloItemStack icon, FrameType frameType,
                                                @Nullable String backgroundTexture, boolean showToast, boolean hidden, float x, float y) {
        return new ProtocolAdvancementDisplay(
                title,
                description,
                icon,
                frameType,
                backgroundTexture,
                showToast,
                hidden,
                x,
                y
        );
    }

    public static ProtocolAdvancementDisplay of(ByteBuf buf, ProtocolVersion version) {
        ComponentHolder title = ExProtocolUtils.readComponentHolder(buf, version);
        ComponentHolder description = ExProtocolUtils.readComponentHolder(buf, version);
        VeloItemStack icon = VeloItemStack.of(buf, version);
        FrameType frame = ExProtocolUtils.readEnumByOrdinal(buf, FrameType.class);

        int i = buf.readInt();
        boolean hasBackground = (i & 1) != 0;
        boolean showToast = (i & 2) != 0;
        boolean hidden = (i & 4) != 0;

        return new ProtocolAdvancementDisplay(
                title,
                description,
                icon,
                frame,
                hasBackground ? ProtocolUtils.readString(buf) : null,
                showToast,
                hidden,
                buf.readFloat(),
                buf.readFloat()
        );
    }

    /**
     * <p>Length guidelines for the toast:
     * <ul>
     *   <li>Up to 32 chars for a single-page display.</li>
     *   <li>33 to 40 chars for a normal two-page display.</li>
     * </ul>
     */
    private Either<ComponentHolder, Component> title;
    private Either<ComponentHolder, Component> description;
    private VeloItemStack icon;
    private FrameType frameType;
    private @Nullable String backgroundTexture;
    private boolean showToast;
    private boolean hidden;
    private float x;
    private float y;

    @ApiStatus.Internal
    private ProtocolAdvancementDisplay(ComponentHolder title, ComponentHolder description, VeloItemStack icon, FrameType frameType,
                                       @Nullable String backgroundTexture, boolean showToast, boolean hidden, float x, float y) {
        this.title = Either.primary(title);
        this.description = Either.primary(description);
        this.icon = icon;
        this.frameType = frameType;
        this.backgroundTexture = backgroundTexture;
        this.showToast = showToast;
        this.hidden = hidden;
        this.x = x;
        this.y = y;
    }

    private ProtocolAdvancementDisplay(Component title, Component description, VeloItemStack icon, FrameType frameType,
                                       @Nullable String backgroundTexture, boolean showToast, boolean hidden, float x, float y) {
        this.title = Either.secondary(title);
        this.description = Either.secondary(description);
        this.icon = icon;
        this.frameType = frameType;
        this.backgroundTexture = backgroundTexture;
        this.showToast = showToast;
        this.hidden = hidden;
        this.x = x;
        this.y = y;
    }

    public void write(ByteBuf buf, ProtocolVersion version) {
        ExProtocolUtils.writeInternalComponent(buf, version, title);
        ExProtocolUtils.writeInternalComponent(buf, version, description);
        icon.write(buf, version);
        ExProtocolUtils.writeEnumOrdinal(buf, frameType);

        int i = 0;
        if (backgroundTexture != null) i |= 1;
        if (showToast) i |= 2;
        if (hidden) i |= 4;
        buf.writeInt(i);

        if (backgroundTexture != null) {
            ProtocolUtils.writeString(buf, formatBackgroundTextureForVersion(backgroundTexture, version));
        }

        buf.writeFloat(x);
        buf.writeFloat(y);
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

    public Component getDescription() {
        return ComponentUtils.getComponent(description);
    }

    public void setDescription(Component description) {
        this.description = Either.secondary(description);
    }

    @ApiStatus.Internal
    public void setDescription(ComponentHolder descriptionHolder) {
        this.description = Either.primary(descriptionHolder);
    }

    public VeloItemStack getIcon() {
        return icon;
    }

    public void setIcon(VeloItemStack icon) {
        this.icon = icon;
    }

    public FrameType getFrameType() {
        return frameType;
    }

    public void setFrameType(FrameType frameType) {
        this.frameType = frameType;
    }

    /**
     * This returns the <u>raw</u> background texture string, if you want to use it in a different context be advised to format it correctly.
     *
     * @see #formatBackgroundTextureForVersion(String, ProtocolVersion)
     */
    public @Nullable String getBackgroundTexture() {
        return backgroundTexture;
    }

    public void setBackgroundTexture(@Nullable String backgroundTexture) {
        this.backgroundTexture = backgroundTexture;
    }

    public boolean isShowToast() {
        return showToast;
    }

    public void setShowToast(boolean showToast) {
        this.showToast = showToast;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public enum FrameType {
        TASK, CHALLENGE, GOAL
    }

}