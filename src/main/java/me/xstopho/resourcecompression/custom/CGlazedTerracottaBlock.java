package me.xstopho.resourcecompression.custom;

import net.minecraft.block.GlazedTerracottaBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CGlazedTerracottaBlock extends GlazedTerracottaBlock {

    private final int level;

    public CGlazedTerracottaBlock(Settings settings, int level) {
        super(settings);
        this.level = level;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.literal("§6Compression Level: " + level));

        super.appendTooltip(stack, world, tooltip, options);
    }
}