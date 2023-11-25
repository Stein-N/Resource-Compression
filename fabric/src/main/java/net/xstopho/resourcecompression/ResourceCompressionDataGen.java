package net.xstopho.resourcecompression;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.xstopho.resourcecompression.datagen.BlockTagProv;
import net.xstopho.resourcecompression.datagen.LootTableProv;
import net.xstopho.resourcecompression.datagen.ModelProv;

public class ResourceCompressionDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModelProv::new);
        pack.addProvider(BlockTagProv::new);
        pack.addProvider(LootTableProv::new);
    }
}
