package de.timongcraft.veloprotocol.utils.network.protocol;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.velocitypowered.api.network.ProtocolVersion;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

public record ProtocolMapping(ProtocolVersion protocolVersion,
                              Map<String, Map<String, Integer>> mappings) {

    public static ProtocolMapping parse(Path path) {
        try (Reader reader = Files.newBufferedReader(path)) {
            return parse(reader);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to parse protocol mappings from Path", e);
        }
    }

    public static ProtocolMapping parse(InputStream inputStream) {
        try (Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8)) {
            return parse(reader);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to parse protocol mappings from InputStream", e);
        }
    }

    public static ProtocolMapping parse(Reader reader) {
        JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
        Map<String, Map<String, Integer>> mappings = new LinkedHashMap<>();

        for (Map.Entry<String, JsonElement> registry : jsonObject.entrySet()) {
            if (!(registry.getValue() instanceof JsonObject registryJson)) continue;

            Map<String, Integer> categoryMappings = new LinkedHashMap<>();

            for (Map.Entry<String, JsonElement> entry : registryJson.entrySet())
                if (entry.getValue() instanceof JsonPrimitive primitive && primitive.isNumber())
                    categoryMappings.put(entry.getKey(), primitive.getAsInt());
            mappings.put(registry.getKey(), categoryMappings);
        }

        return new ProtocolMapping(
                ProtocolVersion.getProtocolVersion(jsonObject.get("protocol").getAsInt()),
                mappings
        );
    }

}