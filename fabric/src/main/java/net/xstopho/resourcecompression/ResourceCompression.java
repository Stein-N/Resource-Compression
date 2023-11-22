package net.xstopho.resourcecompression;

import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraftforge.fml.config.ModConfig;
import net.xstopho.resourcecompression.config.ConstantConfig;

public class ResourceCompression implements ModInitializer {
    
    @Override
    public void onInitialize() {
        ForgeConfigRegistry.INSTANCE.register(Constants.MOD_ID, ModConfig.Type.COMMON, ConstantConfig.SPEC, Constants.MOD_ID + ".toml");

        Constants.LOG.info("Initialisation finished!");
    }
}
