package de.timongcraft.veloprotocol.network.protocol.items;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.util.GameProfile;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import de.timongcraft.veloprotocol.network.protocol.datacomponents.VeloDataComponentType;
import de.timongcraft.veloprotocol.network.protocol.datacomponents.VeloDataComponentTypes;
import de.timongcraft.veloprotocol.utils.network.protocol.ExProtocolUtils;
import io.netty.buffer.ByteBuf;

@SuppressWarnings("unused")
public class PlayerHeadData implements ComponentData {

    private GameProfile gameProfile;

    public PlayerHeadData(Player player) {
        this(player.getGameProfile());
    }

    public PlayerHeadData(GameProfile gameProfile) {
        this.gameProfile = gameProfile;
    }

    @Override
    public void write(ByteBuf buf, ProtocolVersion version) {
        ComponentData.super.write(buf, version);

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
    public VeloDataComponentType getType() {
        return VeloDataComponentTypes.PROFILE;
    }

    public GameProfile getGameProfile() {
        return gameProfile;
    }

    public PlayerHeadData setGameProfile(GameProfile gameProfile) {
        this.gameProfile = gameProfile;
        return this;
    }

}