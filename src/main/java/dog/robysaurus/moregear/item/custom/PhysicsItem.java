package dog.robysaurus.moregear.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class PhysicsItem extends SwordItem {
    public PhysicsItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }
    
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.clear();
        tooltip.add(Text.literal("§6§l§kPHYSICS§r"));
        tooltip.add(Text.literal("big skull emoji lol").formatted(Formatting.GOLD, Formatting.BOLD, Formatting.OBFUSCATED));
        tooltip.add(Text.literal("more big skull emoji lol").formatted(Formatting.GOLD, Formatting.BOLD, Formatting.OBFUSCATED));
        tooltip.add(Text.literal("funny stuff :D lol").formatted(Formatting.GOLD, Formatting.BOLD, Formatting.OBFUSCATED));
    }
}
