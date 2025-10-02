package de.timongcraft.veloprotocol.network.protocol.inventory.item;

import com.velocitypowered.api.network.ProtocolVersion;

import java.util.Arrays;

@SuppressWarnings("unused")
public class VeloItemType {

    public static final ProtocolVersion[] SUPPORTED_VERSIONS = {
            ProtocolVersion.MINECRAFT_1_20_5,
            ProtocolVersion.MINECRAFT_1_21,
            ProtocolVersion.MINECRAFT_1_21_2,
            ProtocolVersion.MINECRAFT_1_21_4,
            ProtocolVersion.MINECRAFT_1_21_5,
            ProtocolVersion.MINECRAFT_1_21_6,
            ProtocolVersion.MINECRAFT_1_21_7,
            ProtocolVersion.MINECRAFT_1_21_9
    };

    private final String name;
    private final int[] protocolIds;

    public VeloItemType(String name, int[] protocolIds) {
        this.name = name;
        this.protocolIds = protocolIds;
    }

    public String getName() {
        return name;
    }

    public int getProtocolId(ProtocolVersion version) {
        int idIndex = Arrays.binarySearch(SUPPORTED_VERSIONS, version);

        if (idIndex < 0) {
            throw new IllegalStateException("Protocol version " + version.getProtocol() + " is not implemented");
        }

        return protocolIds[idIndex];
    }

}