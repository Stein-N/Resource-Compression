package net.xstopho.resourcecompression.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConstantConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> COMPRESSION_LEVEL;

    static {
        BUILDER.push("General Settings");

        COMPRESSION_LEVEL = BUILDER.defineInRange("compressionLevel", 1, 1, 9);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
