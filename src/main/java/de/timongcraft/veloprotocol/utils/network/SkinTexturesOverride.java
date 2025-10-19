package de.timongcraft.veloprotocol.utils.network;

import io.netty.buffer.ByteBuf;

//todo: proper support
// -> requires a type of key Adventure doesn't support (don't want to deal with that atm & not really needed on a proxy)
public class SkinTexturesOverride {

    public static SkinTexturesOverride EMPTY = new SkinTexturesOverride();

    public static SkinTexturesOverride read(ByteBuf buf) {
        throw new UnsupportedOperationException();
    }

    private SkinTexturesOverride() {}

    public void write(ByteBuf buf) {
        buf.writeBoolean(false); // body optional
        buf.writeBoolean(false); // cape optional
        buf.writeBoolean(false); // elytra optional
        buf.writeBoolean(false); // skin type optional
    }

}