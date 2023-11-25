package net.xstopho.resourcecompression;

import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.config.ModConfig;
import net.xstopho.resourcecompression.block.ConBlock;
import net.xstopho.resourcecompression.config.ConstantConfig;
import net.xstopho.resourcecompression.registries.BlockRegistry;
import net.xstopho.resourcecompression.registries.ItemGroupRegistry;
import net.xstopho.resourcecompression.registries.OldBlockRegistry;
import org.apache.logging.log4j.core.jmx.Server;

public class ResourceCompression implements ModInitializer {
    
    @Override
    public void onInitialize() {
        ForgeConfigRegistry.INSTANCE.register(Constants.MOD_ID, ModConfig.Type.COMMON, ConstantConfig.SPEC, Constants.MOD_ID + ".toml");

        BlockRegistry.init();
        OldBlockRegistry.init();
        ItemGroupRegistry.init();

        Constants.LOG.info("Initialisation finished!");
    }
}
