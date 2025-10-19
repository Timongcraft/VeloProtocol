package de.timongcraft.veloprotocol.utils;

import org.jetbrains.annotations.Nullable;

public class NullableEither<P, S> {

    public static <P, S> NullableEither<P, S> primary(P value) {
        return new NullableEither<>(value, null);
    }

    public static <P, S> NullableEither<P, S> secondary(S value) {
        return new NullableEither<>(null, value);
    }

    private final P primary;
    private final S secondary;

    private NullableEither(P primary, S secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }

    public boolean isPrimary() {
        return primary != null;
    }

    public boolean isSecondary() {
        return secondary != null;
    }

    public @Nullable P getPrimary() {
        if (isPrimary()) {
            return primary;
        }

        return null;
    }

    public @Nullable S getSecondary() {
        if (isSecondary()) {
            return secondary;
        }

        return null;
    }

}