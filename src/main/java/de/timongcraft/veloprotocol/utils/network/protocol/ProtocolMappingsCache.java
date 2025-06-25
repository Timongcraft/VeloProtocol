package de.timongcraft.veloprotocol.utils.network.protocol;

import com.velocitypowered.api.network.ProtocolVersion;
import de.timongcraft.veloprotocol.utils.ResourceUtils;
import org.jetbrains.annotations.ApiStatus;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@ApiStatus.Internal
public class ProtocolMappingsCache {

    public static final Map<ProtocolVersion, ProtocolMapping> RESOURCE_PROTOCOL_MAPPINGS = ResourceUtils.getFileStreams("veloprotocol/protocol_mappings")
            .stream()
            .map(ProtocolMapping::parse)
            .collect(Collectors.toMap(ProtocolMapping::protocolVersion, Function.identity()));

}