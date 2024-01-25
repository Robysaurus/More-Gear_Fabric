package dog.robysaurus.moregear.util;

import dog.robysaurus.moregear.item.ModItems;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class MiscClientUtil {
    public static void registerMiscModUtil(){
        registerTooltips();
    }

    private static void registerTooltips() {
        ItemTooltipCallback.EVENT.register((stack, context, lines) -> {
            if (stack.getItem() == ModItems.PHYSICS_IS_THE_BEST) {
                lines.set(2, Text.literal("big skull emoji lol").formatted(Formatting.GOLD, Formatting.BOLD, Formatting.OBFUSCATED));
                lines.set(3, Text.literal("more big skull emoji lol").formatted(Formatting.GOLD, Formatting.BOLD, Formatting.OBFUSCATED));
                lines.set(4, Text.literal("funny stuff :D lol").formatted(Formatting.GOLD, Formatting.BOLD, Formatting.OBFUSCATED));
            }
        });
    }
}
