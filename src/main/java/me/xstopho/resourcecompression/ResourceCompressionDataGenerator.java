package me.xstopho.resourcecompression;

import me.xstopho.resourcecompression.datagen.RCBlockTagProvider;
import me.xstopho.resourcecompression.datagen.RCLangProvider;
import me.xstopho.resourcecompression.datagen.RCLootTableProvider;
import me.xstopho.resourcecompression.datagen.RCRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ResourceCompressionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(RCLangProvider::new);
		pack.addProvider(RCBlockTagProvider::new);
		pack.addProvider(RCLootTableProvider::new);
		pack.addProvider(RCRecipeProvider::new);
	}
}
