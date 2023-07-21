package dog.robysaurus.moregear.item;

import dog.robysaurus.moregear.MoreGear;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GEARGROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MoreGear.MOD_ID),
            FabricItemGroup.builder().displayName(Text.literal("More Gear"))
                    .icon(() -> new ItemStack(ModItems.TITANIUM_HELMET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM);
                        entries.add(ModItems.TITANIUM_HELMET);
                    }).build());
    public static void registerItemGroups(){
        MoreGear.LOGGER.info("Registering Mod Item Groups for "+MoreGear.MOD_ID);
    }
}
