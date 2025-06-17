package de.timongcraft.veloprotocol.utils.network.protocol;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.protocol.ProtocolUtils;
import com.velocitypowered.proxy.protocol.packet.chat.ComponentHolder;
import io.netty.buffer.ByteBuf;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ExProtocolUtils {

    public static @Nullable String readOptString(ByteBuf buf) {
        if (buf.readBoolean()) {
            return ProtocolUtils.readString(buf);
        } else {
            return null;
        }
    }

    public static void writeOptString(ByteBuf buf, @Nullable String s) {
        buf.writeBoolean(s != null);
        if (s != null) {
            ProtocolUtils.writeString(buf, s);
        }
    }

    public static @Nullable <T> T readOpt(ByteBuf buf, Supplier<T> reader) {
        if (buf.readBoolean()) {
            return reader.get();
        } else {
            return null;
        }
    }

    public static <T> void writeOpt(ByteBuf buf, @Nullable T value, Consumer<T> writer) {
        buf.writeBoolean(value != null);
        if (value != null) {
            writer.accept(value);
        }
    }

    public static Component readComponent(ByteBuf buf, ProtocolVersion version) {
        return ComponentHolder.read(buf, version).getComponent();
    }

    public static <T> T readEnumByOrdinal(ByteBuf buf, Class<T> clazz) {
        return clazz.getEnumConstants()[ProtocolUtils.readVarInt(buf)];
    }

    public static <T extends Enum<T>> void writeEnumOrdinal(ByteBuf buf, T t) {
        ProtocolUtils.writeVarInt(buf, t.ordinal());
    }

    public static <T> Map<String, T> readStringKeyMap(ByteBuf buf, Supplier<T> valueReader) {
        Map<String, T> map = new HashMap<>();

        int size = ProtocolUtils.readVarInt(buf);
        for (int i = 0; i < size; i++) {
            map.put(ProtocolUtils.readString(buf), valueReader.get());
        }

        return map;
    }

    public static <T> void writeStringKeyMap(ByteBuf buf, Map<String, T> map, Consumer<T> valueWriter) {
        ProtocolUtils.writeVarInt(buf, map.size());

        for (Map.Entry<String, T> entry : map.entrySet()) {
            ProtocolUtils.writeString(buf, entry.getKey());
            valueWriter.accept(entry.getValue());
        }
    }

    public static Set<String> readStringSet(ByteBuf buf) {
        Set<String> set = new HashSet<>();

        int size = ProtocolUtils.readVarInt(buf);
        for (int j = 0; j < size; j++) {
            set.add(ProtocolUtils.readString(buf));
        }
        return set;
    }

    public static void writeStringSet(ByteBuf buf, Set<String> set) {
        ProtocolUtils.writeVarInt(buf, set.size());
        for (String setEntry : set) {
            ProtocolUtils.writeString(buf, setEntry);
        }
    }

    public static Set<Set<String>> readSetOfStringSets(ByteBuf buf) {
        int outerSetSize = ProtocolUtils.readVarInt(buf);
        Set<Set<String>> set = new HashSet<>(outerSetSize);

        for (int i = 0; i < outerSetSize; i++) {
            int innerSetSize = ProtocolUtils.readVarInt(buf);
            Set<String> innerSet = new HashSet<>(innerSetSize);

            for (int j = 0; j < innerSetSize; j++) {
                innerSet.add(ProtocolUtils.readString(buf));
            }

            set.add(innerSet);
        }

        return set;
    }

    public static void writeSetOfStringSets(ByteBuf buf, Set<Set<String>> set) {
        ProtocolUtils.writeVarInt(buf, set.size());
        for (Set<String> innerSet : set) {
            ProtocolUtils.writeVarInt(buf, innerSet.size());
            for (String setEntry : innerSet) {
                ProtocolUtils.writeString(buf, setEntry);
            }
        }
    }

}