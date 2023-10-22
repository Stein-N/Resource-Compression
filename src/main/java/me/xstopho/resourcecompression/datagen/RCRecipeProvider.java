package me.xstopho.resourcecompression.datagen;

import me.xstopho.resourcecompression.enums.CompressedBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class RCRecipeProvider extends FabricRecipeProvider {
    public RCRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        for (CompressedBlocks compressedBlocks : CompressedBlocks.values()) {
            offerCompressDecompressRecipe(exporter, compressedBlocks.getCopyBlock(), compressedBlocks.getBlock(1));
            offerCompressDecompressRecipe(exporter, compressedBlocks.getBlock(1), compressedBlocks.getBlock(2));
            offerCompressDecompressRecipe(exporter, compressedBlocks.getBlock(2), compressedBlocks.getBlock(3));
            offerCompressDecompressRecipe(exporter, compressedBlocks.getBlock(3), compressedBlocks.getBlock(4));
            offerCompressDecompressRecipe(exporter, compressedBlocks.getBlock(4), compressedBlocks.getBlock(5));
            offerCompressDecompressRecipe(exporter, compressedBlocks.getBlock(5), compressedBlocks.getBlock(6));
            offerCompressDecompressRecipe(exporter, compressedBlocks.getBlock(6), compressedBlocks.getBlock(7));
            offerCompressDecompressRecipe(exporter, compressedBlocks.getBlock(7), compressedBlocks.getBlock(8));
            offerCompressDecompressRecipe(exporter, compressedBlocks.getBlock(8), compressedBlocks.getBlock(9));
        }
    }

    private static void offerCompressDecompressRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible input, ItemConvertible output) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1).pattern("III").pattern("III").pattern("III")
                .input('I', input).criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, getRecipeName(input) + "_compress");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, input, 9)
                .input(output).criterion(hasItem(output), conditionsFromItem(output))
                .offerTo(exporter, getRecipeName(output) + "_decompress");
    }
}
