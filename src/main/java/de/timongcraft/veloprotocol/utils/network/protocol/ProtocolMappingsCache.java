package de.timongcraft.veloprotocol.utils.network.protocol;

import de.timongcraft.veloprotocol.utils.ResourceUtils;

import java.util.Comparator;
import java.util.List;

public class ProtocolMappingsCache {

    public static final List<ProtocolMapping> RESOURCE_PROTOCOL_MAPPINGS = ResourceUtils.getFileStreams("veloprotocol/protocol_mappings")
            .stream()
            .map(ProtocolMapping::parse)
            .sorted(Comparator.comparing(ProtocolMapping::protocolVersion))
            .toList();

}