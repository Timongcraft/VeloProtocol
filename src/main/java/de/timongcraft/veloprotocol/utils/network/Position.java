package de.timongcraft.veloprotocol.utils.network;

import de.timongcraft.velopacketimpl.utils.network.Vec3d;
import io.netty.buffer.ByteBuf;

public class Position {

    private static final int POSITION_X_BITS = 26;
    private static final int POSITION_Y_BITS = 12;
    private static final int POSITION_Z_BITS = 26;

    private static final int POSITION_X_SHIFT = 38;
    private static final int POSITION_Z_SHIFT = 12;

    private static final long POSITION_X_MASK = (1L << POSITION_X_BITS) - 1; // 0x3FFFFFFL
    private static final long POSITION_Y_MASK = (1L << POSITION_Y_BITS) - 1; // 0xFFFL
    private static final long POSITION_Z_MASK = (1L << POSITION_Z_BITS) - 1; // 0x3FFFFFFL

    public static Position ofLong(long val) {
        int x = (int) (val >> POSITION_X_SHIFT);
        int y = (int) (val & POSITION_Y_MASK);
        int z = (int) ((val >> POSITION_Z_SHIFT) & POSITION_Z_MASK);

        if (x >= 1 << (POSITION_X_BITS - 1)) x -= 1 << POSITION_X_BITS;
        if (y >= 1 << (POSITION_Y_BITS - 1)) y -= 1 << POSITION_Y_BITS;
        if (z >= 1 << (POSITION_Z_BITS - 1)) z -= 1 << POSITION_Z_BITS;

        return new Position(x, y, z);
    }

    public static Position of(Vec3d vec3d) {
        return new Position(
                (int) Math.floor(vec3d.getX()),
                (int) Math.floor(vec3d.getY()),
                (int) Math.floor(vec3d.getZ())
        );
    }

    public static Position read(ByteBuf buf) {
        return ofLong(buf.readLong());
    }

    private int x;
    private int y;
    private int z;

    public Position(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3d toVec3d() {
        return new Vec3d(x, y, z);
    }

    public Vec3d toCenteredVec3d() {
        return new Vec3d(x + 0.5, y + 0.5, z + 0.5);
    }

    public long toLong() {
        long packedX = (x & POSITION_X_MASK) << POSITION_X_SHIFT;
        long packedY = y & POSITION_Y_MASK;
        long packedZ = (z & POSITION_Z_MASK) << POSITION_Z_SHIFT;
        return packedX | packedY | packedZ;
    }

    public void write(ByteBuf buf) {
        buf.writeLong(toLong());
    }

    public int x() {
        return this.x;
    }

    public Position x(int x) {
        this.x = x;
        return this;
    }

    public int y() {
        return this.y;
    }

    public Position y(int y) {
        this.y = y;
        return this;
    }

    public int z() {
        return this.z;
    }

    public Position z(int z) {
        this.z = z;
        return this;
    }

}