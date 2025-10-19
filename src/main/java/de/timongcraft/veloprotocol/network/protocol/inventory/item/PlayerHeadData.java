package de.timongcraft.veloprotocol.network.protocol.inventory.item;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.util.GameProfile;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import de.timongcraft.velopacketimpl.utils.network.protocol.ExProtocolUtils;
import de.timongcraft.veloprotocol.network.protocol.datacomponents.VeloDataComponentType;
import de.timongcraft.veloprotocol.network.protocol.datacomponents.VeloDataComponentTypes;
import de.timongcraft.veloprotocol.utils.network.SkinTexturesOverride;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public class PlayerHeadData implements ComponentData {

    //Static
    public static PlayerHeadData ofPlayer(Player player) {
        return ofProfile(player.getGameProfile());
    }

    //Static
    public static PlayerHeadData ofProfile(GameProfile profile) {
        return new PlayerHeadData(PlayerHeadData.Data.fromProfile(profile), SkinTexturesOverride.EMPTY);
    }

    //Dynamic
    public static PlayerHeadData ofUsername(String username) {
        return new PlayerHeadData(new PlayerHeadData.Data(Optional.of(username), Optional.empty(), Collections.emptyList()),
                SkinTexturesOverride.EMPTY);
    }

    //Dynamic
    public static PlayerHeadData ofUuid(UUID uuid) {
        return new PlayerHeadData(new PlayerHeadData.Data(Optional.empty(), Optional.of(uuid), Collections.emptyList()),
                SkinTexturesOverride.EMPTY);
    }

    public static PlayerHeadData ofData(PlayerHeadData.Data data) {
        return ofDataWithOverride(data, SkinTexturesOverride.EMPTY);
    }

    public static PlayerHeadData ofDataWithOverride(PlayerHeadData.Data data, SkinTexturesOverride texturesOverride) {
        if (data.getName().isPresent() && data.getUuid().isPresent()) {
            throw new UnsupportedOperationException("Dynamic profile can only have either username or uuid"); // typically ignored but we don't want default heads
        }

        return new PlayerHeadData(data, texturesOverride);
    }

    private final PlayerHeadData.Data data;
    private final SkinTexturesOverride texturesOverride;

    /**
     * @see #ofPlayer(Player)
     */
    @Deprecated(since = "1.6.4", forRemoval = true)
    public PlayerHeadData(Player player) {
        this(player.getGameProfile());
    }

    /**
     * @see #ofProfile(GameProfile)
     */
    @Deprecated(since = "1.6.4", forRemoval = true)
    public PlayerHeadData(GameProfile gameProfile) {
        this(Data.fromProfile(gameProfile), SkinTexturesOverride.EMPTY);
    }

    private PlayerHeadData(PlayerHeadData.Data data, SkinTexturesOverride texturesOverride) {
        this.data = data;
        this.texturesOverride = texturesOverride;
    }

    @Override
    public void write(ByteBuf buf, ProtocolVersion version) {
        ComponentData.super.write(buf, version);

        if (version.noLessThan(ProtocolVersion.MINECRAFT_1_21_9)) {
            buf.writeBoolean(false); // right either - head component data (no need for necessary more code for new game profile codec)
        }

        ExProtocolUtils.writeOptString(buf, data.getName().orElse(null));

        ExProtocolUtils.writeOpt(buf, data.getUuid().orElse(null),
                uuid -> ProtocolUtils.writeUuid(buf, uuid));

        ProtocolUtils.writeVarInt(buf, data.getProperties().size());
        for (GameProfile.Property profileProperty : data.getProperties()) {
            ProtocolUtils.writeString(buf, profileProperty.getName());
            ProtocolUtils.writeString(buf, profileProperty.getValue());
            ExProtocolUtils.writeOptString(buf, profileProperty.getSignature());
        }

        if (version.noLessThan(ProtocolVersion.MINECRAFT_1_21_9)) {
            texturesOverride.write(buf);
        }
    }

    public PlayerHeadData.Data getData() {
        return data;
    }

    public SkinTexturesOverride getTexturesOverride() {
        return texturesOverride;
    }

    /**
     * @see #getData()
     * @see Data#toProfile()
     */
    @Deprecated(since = "1.6.4", forRemoval = true)
    public GameProfile getGameProfile() {
        return data.toProfile();
    }

    /**
     * @see #getData()
     */
    @Deprecated(since = "1.6.4", forRemoval = true)
    public PlayerHeadData setGameProfile(GameProfile gameProfile) {
        data.setName(gameProfile.getName());
        data.setUuid(gameProfile.getId());
        data.getProperties().clear();
        data.getProperties().addAll(gameProfile.getProperties());
        return this;
    }

    @Override
    public VeloDataComponentType getType() {
        return VeloDataComponentTypes.PROFILE;
    }

    @SuppressWarnings("OptionalUsedAsFieldOrParameterType")
    public static final class Data {

        public static PlayerHeadData.Data fromProfile(GameProfile profile) {
            return new PlayerHeadData.Data(Optional.of(profile.getName()), Optional.of(profile.getId()), profile.getProperties());
        }

        private static final UUID NIL_UUID = new UUID(0L, 0L);

        private Optional<String> name;
        private Optional<UUID> uuid;
        private final List<GameProfile.Property> properties;

        public Data(Optional<String> name, Optional<UUID> uuid, List<GameProfile.Property> properties) {
            this.name = name;
            this.uuid = uuid;
            this.properties = new ArrayList<>(properties);
        }

        public GameProfile toProfile() {
            return new GameProfile(uuid.orElse(NIL_UUID), name.orElse(""), properties);
        }

        public Optional<String> getName() {
            return name;
        }

        public void setName(@Nullable String name) {
            this.name = Optional.ofNullable(name);
        }

        public Optional<UUID> getUuid() {
            return uuid;
        }

        public void setUuid(@Nullable UUID uuid) {
            this.uuid = Optional.ofNullable(uuid);
        }

        public List<GameProfile.Property> getProperties() {
            return properties;
        }

    }

}