package dog.robysaurus.moregear.item;

import dog.robysaurus.moregear.MoreGear;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item RAW_TITANIUM = registerItem("rawtitanium",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item TITANIUM = registerItem("titanium",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item TITANIUM_HELMET = registerItem("titaniumhelmet",
            new ArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MoreGear.MOD_ID, name), item);
    }
    public static void registerModItems(){
        MoreGear.LOGGER.info("Registering Mod Items for "+MoreGear.MOD_ID);
    }
}
