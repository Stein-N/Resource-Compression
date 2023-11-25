package net.xstopho.resourcecompression.block;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.MagmaBlock;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ConMagmaBlock extends MagmaBlock {
    private final Block copyBlock;
    private final int level;

    public ConMagmaBlock(Block copyBlock, int level) {
        super(Properties.copy(copyBlock)
                .noOcclusion());
        this.copyBlock = copyBlock;
        this.level = level;
    }

    @Override
    public String getDescriptionId() {
        return copyBlock.getDescriptionId();
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter world, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.translatable("tooltip.resourcecompression.compressionLevel")
                .append(Component.literal(String.valueOf(this.level))).withStyle(ChatFormatting.GOLD));

        super.appendHoverText(stack, world, tooltip, flag);
    }
}
