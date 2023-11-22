package net.xstopho.resourcecompression;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.xstopho.resourcecompression.config.ConstantConfig;

@Mod(Constants.MOD_ID)
public class ResourceCompression {
    
    public ResourceCompression() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConstantConfig.SPEC, Constants.MOD_ID + ".toml");
    }
}