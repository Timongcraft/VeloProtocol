package de.timongcraft.veloprotocol.network.protocol.blockentities;

import com.velocitypowered.api.network.ProtocolVersion;

import java.util.Arrays;

@SuppressWarnings("unused")
public class VeloBlockEntityType {

    public static final ProtocolVersion[] SUPPORTED_VERSIONS = {
            ProtocolVersion.MINECRAFT_1_18_2,
            ProtocolVersion.MINECRAFT_1_19,
            ProtocolVersion.MINECRAFT_1_19_1,
            ProtocolVersion.MINECRAFT_1_19_3,
            ProtocolVersion.MINECRAFT_1_19_4,
            ProtocolVersion.MINECRAFT_1_20,
            ProtocolVersion.MINECRAFT_1_20_2,
            ProtocolVersion.MINECRAFT_1_20_3,
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

    public VeloBlockEntityType(String name, int[] protocolIds) {
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