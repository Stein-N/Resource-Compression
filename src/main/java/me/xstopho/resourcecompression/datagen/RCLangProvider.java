package me.xstopho.resourcecompression.datagen;

import me.xstopho.resourcecompression.enums.CompressedBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class RCLangProvider extends FabricLanguageProvider {

    public RCLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        for (CompressedBlocks compressedBlocks : CompressedBlocks.values()) {
            for (int i = 1; i <= 9; i++) {
                translationBuilder.add(compressedBlocks.getBlock(i), compressedBlocks.getLangName());
            }
        }
    }
}
