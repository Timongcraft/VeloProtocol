package de.timongcraft.veloprotocol.network.protocol.items;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.util.GameProfile;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import de.timongcraft.velopacketimpl.utils.annotations.Since;
import de.timongcraft.veloprotocol.network.protocol.datacomponents.VeloDataComponentTypes;
import de.timongcraft.veloprotocol.utils.network.protocol.ExProtocolUtils;
import io.netty.buffer.ByteBuf;
import net.kyori.adventure.nbt.BinaryTag;
import net.kyori.adventure.nbt.CompoundBinaryTag;
import net.kyori.adventure.nbt.ListBinaryTag;

@SuppressWarnings("unused")
@Since(ProtocolVersion.MINECRAFT_1_20_2)
public class PlayerHeadMeta extends AbstractMeta {

    private GameProfile gameProfile;

    public PlayerHeadMeta(Player player) {
        this(player.getGameProfile());
    }

    public PlayerHeadMeta(GameProfile gameProfile) {
        this.gameProfile = gameProfile;
    }

    @Override
    protected void writeComponent(ByteBuf buf, ProtocolVersion version) {
        ProtocolUtils.writeVarInt(buf, VeloDataComponentTypes.PROFILE.getProtocolId(version));

        ExProtocolUtils.writeOptString(buf, gameProfile.getName());

        ExProtocolUtils.writeOpt(buf, gameProfile.getId(), uuid -> ProtocolUtils.writeUuid(buf, uuid));

        GameProfile.Property texturesProperty = null;
        for (GameProfile.Property gameProfileProperty : gameProfile.getProperties()) {
            if (!gameProfileProperty.getName().equals("textures")) continue;
            texturesProperty = gameProfileProperty;
            break;
        }

        ProtocolUtils.writeVarInt(buf, texturesProperty != null ? 1 : 0);
        if (texturesProperty != null) {
            ProtocolUtils.writeString(buf, "textures");

            ProtocolUtils.writeString(buf, texturesProperty.getValue());
            buf.writeBoolean(texturesProperty.getSignature() != null);
            if (texturesProperty.getSignature() != null)
                ProtocolUtils.writeString(buf, texturesProperty.getSignature());
        }
    }

    @Override
    protected void writeNbt(CompoundBinaryTag.Builder rootNbt, ProtocolVersion version) {
        ListBinaryTag.Builder<BinaryTag> texturesBuilder = ListBinaryTag.builder();
        for (GameProfile.Property gameProfileProperty : gameProfile.getProperties()) {
            if (!gameProfileProperty.getName().equals("textures")) continue;
            texturesBuilder.add(CompoundBinaryTag.builder()
                    .putString("Value", gameProfileProperty.getValue())
                    .putString("Signature", gameProfileProperty.getSignature())
                    .build());
            break;
        }

        rootNbt.put("SkullOwner", CompoundBinaryTag.builder()
                //optional
                .putString("Name", gameProfile.getName())
                //optional
                .putIntArray("Id", new int[]{
                        (int) (gameProfile.getId().getMostSignificantBits() >> 32),
                        (int) gameProfile.getId().getMostSignificantBits(),
                        (int) (gameProfile.getId().getLeastSignificantBits() >> 32),
                        (int) gameProfile.getId().getLeastSignificantBits()
                })
                .put("Properties", CompoundBinaryTag.builder()
                        .put("textures", texturesBuilder.build())
                        .build())
                .build());
    }

    public GameProfile getGameProfile() {
        return gameProfile;
    }

    public PlayerHeadMeta setGameProfile(GameProfile gameProfile) {
        this.gameProfile = gameProfile;
        return this;
    }

}