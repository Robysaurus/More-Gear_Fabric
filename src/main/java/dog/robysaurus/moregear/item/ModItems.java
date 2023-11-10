package dog.robysaurus.moregear.item;

import dog.robysaurus.moregear.MoreGear;
import dog.robysaurus.moregear.item.custom.EffectAxeItem;
import dog.robysaurus.moregear.item.custom.EffectPickaxeItem;
import dog.robysaurus.moregear.item.custom.EffectSwordItem;
import dog.robysaurus.moregear.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    //General Items
    public static final Item RAW_TITANIUM = registerItem("rawtitanium",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item TITANIUM = registerItem("titanium",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item UNREFINED_HYPHITE = registerItem("unrefinedhyphite",
            new Item(new FabricItemSettings()));
    public static final Item HYPHITE = registerItem("hyphite",
            new Item(new FabricItemSettings()));
    public static final Item RAW_TOPAZ = registerItem("rawtopaz",
            new Item(new FabricItemSettings()));
    public static final Item TOPAZ = registerItem("topaz",
            new Item(new FabricItemSettings()));
    public static final Item RAW_SAPPHIRE = registerItem("rawsapphire",
            new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("rawruby",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item RAW_OPAL = registerItem("rawopal",
            new Item(new FabricItemSettings()));
    public static final Item OPAL = registerItem("opal",
            new Item(new FabricItemSettings()));
    //Gear
    public static final Item TITANIUM_HELMET = registerItem("titaniumhelmet",
            new ModArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titaniumchestplate",
            new ModArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item TITANIUM_LEGGINGS = registerItem("titaniumleggings",
            new ModArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item TITANIUM_BOOTS = registerItem("titaniumboots",
            new ModArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item TITANIUM_SWORD = registerItem("titaniumsword",
            new EffectSwordItem(ModToolMaterials.TITANIUM, ModArmorMaterials.TITANIUM, 14, 4f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item TITANIUM_AXE = registerItem("titaniumaxe",
            new AxeItem(ModToolMaterials.TITANIUM, 19f, 2f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item TITANIUM_PICKAXE = registerItem("titaniumpickaxe",
            new PickaxeItem(ModToolMaterials.TITANIUM, 9, 2f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item TITANIUM_SHOVEL = registerItem("titaniumshovel",
            new ShovelItem(ModToolMaterials.TITANIUM, 4f, 2.5f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item TITANIUM_HOE = registerItem("titaniumhoe",
            new HoeItem(ModToolMaterials.TITANIUM, 4, 2.5f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item HYPHITE_HELMET = registerItem("hyphitehelmet",
            new ArmorItem(ModArmorMaterials.HYPHITE, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item HYPHITE_CHESTPLATE = registerItem("hyphitechestplate",
            new ArmorItem(ModArmorMaterials.HYPHITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item HYPHITE_LEGGINGS = registerItem("hyphiteleggings",
            new ArmorItem(ModArmorMaterials.HYPHITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item HYPHITE_BOOTS = registerItem("hyphiteboots",
            new ArmorItem(ModArmorMaterials.HYPHITE, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item HYPHITE_SWORD = registerItem("hyphitesword",
            new SwordItem(ModToolMaterials.HYPHITE, 3, -2f, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item HYPHITE_AXE = registerItem("hyphiteaxe",
            new AxeItem(ModToolMaterials.HYPHITE, 8f, -2.5f, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item HYPHITE_PICKAXE = registerItem("hyphitepickaxe",
            new PickaxeItem(ModToolMaterials.HYPHITE, 1, -2f, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item HYPHITE_SHOVEL = registerItem("hyphiteshovel",
            new ShovelItem(ModToolMaterials.HYPHITE, 1.5f, -2.5f, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item HYPHITE_HOE = registerItem("hyphitehoe",
            new HoeItem(ModToolMaterials.HYPHITE, -3, 0.0f, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item TOPAZ_HELMET = registerItem("topazhelmet",
            new ModArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TOPAZ_CHESTPLATE = registerItem("topazchestplate",
            new ModArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TOPAZ_LEGGINGS = registerItem("topazleggings",
            new ModArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TOPAZ_BOOTS = registerItem("topazboots",
            new ModArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TOPAZ_SWORD = registerItem("topazsword",
            new SwordItem(ModToolMaterials.TOPAZ,3, -2.4f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TOPAZ_AXE = registerItem("topazaxe",
            new AxeItem(ModToolMaterials.TOPAZ, 5.0f, -3.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TOPAZ_PICKAXE = registerItem("topazpickaxe",
            new EffectPickaxeItem(ModToolMaterials.TOPAZ, ModArmorMaterials.TOPAZ, 1, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TOPAZ_SHOVEL = registerItem("topazshovel",
            new ShovelItem(ModToolMaterials.TOPAZ, 1.5f, -3.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TOPAZ_HOE = registerItem("topazhoe",
            new HoeItem(ModToolMaterials.TOPAZ, -4, 0.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item SAPPHIRE_HELMET = registerItem("sapphirehelmet",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphirechestplate",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphireleggings",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphireboots",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphiresword",
            new EffectSwordItem(ModToolMaterials.SAPPHIRE, ModArmorMaterials.SAPPHIRE, 3, -2.4f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item SAPPHIRE_AXE = registerItem("sapphireaxe",
            new AxeItem(ModToolMaterials.SAPPHIRE, 5.0f, -3.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphirepickaxe",
            new PickaxeItem(ModToolMaterials.SAPPHIRE, 1, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphireshovel",
            new ShovelItem(ModToolMaterials.SAPPHIRE, 1.5f, -3.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item SAPPHIRE_HOE = registerItem("sapphirehoe",
            new HoeItem(ModToolMaterials.SAPPHIRE, -4, 0.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item RUBY_HELMET = registerItem("rubyhelmet",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item RUBY_CHESTPLATE = registerItem("rubychestplate",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item RUBY_LEGGINGS = registerItem("rubyleggings",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item RUBY_BOOTS = registerItem("rubyboots",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item RUBY_SWORD = registerItem("rubysword",
            new SwordItem(ModToolMaterials.RUBY,3, -2.4f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item RUBY_AXE = registerItem("rubyaxe",
            new EffectAxeItem(ModToolMaterials.RUBY, ModArmorMaterials.RUBY, 5.0f, -3.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item RUBY_PICKAXE = registerItem("rubypickaxe",
            new PickaxeItem(ModToolMaterials.RUBY, 1, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item RUBY_SHOVEL = registerItem("rubyshovel",
            new ShovelItem(ModToolMaterials.RUBY, 1.5f, -3.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item RUBY_HOE = registerItem("rubyhoe",
            new HoeItem(ModToolMaterials.RUBY, -4, 0.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item OPAL_HELMET = registerItem("opalhelmet",
            new ModArmorItem(ModArmorMaterials.OPAL, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item OPAL_CHESTPLATE = registerItem("opalchestplate",
            new ModArmorItem(ModArmorMaterials.OPAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item OPAL_LEGGINGS = registerItem("opalleggings",
            new ModArmorItem(ModArmorMaterials.OPAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item OPAL_BOOTS = registerItem("opalboots",
            new ModArmorItem(ModArmorMaterials.OPAL, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item OPAL_SWORD = registerItem("opalsword",
            new EffectSwordItem(ModToolMaterials.OPAL, ModArmorMaterials.OPAL, 3, -2.4f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item OPAL_AXE = registerItem("opalaxe",
            new EffectAxeItem(ModToolMaterials.OPAL, ModArmorMaterials.OPAL, 5.0f, -3.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item OPAL_PICKAXE = registerItem("opalpickaxe",
            new PickaxeItem(ModToolMaterials.OPAL, 1, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item OPAL_SHOVEL = registerItem("opalshovel",
            new ShovelItem(ModToolMaterials.OPAL, 1.5f, -3.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item OPAL_HOE = registerItem("opalhoe",
            new HoeItem(ModToolMaterials.OPAL, -4, 0.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_HELMET = registerItem("echohelmet",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_CHESTPLATE = registerItem("echochestplate",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_LEGGINGS = registerItem("echoleggings",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_BOOTS = registerItem("echoboots",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_SWORD = registerItem("echosword",
            new EffectSwordItem(ModToolMaterials.ECHO, ModArmorMaterials.ECHO,3, -2.4f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_AXE = registerItem("echoaxe",
            new AxeItem(ModToolMaterials.ECHO, 5f, -3f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_PICKAXE = registerItem("echopickaxe",
            new PickaxeItem(ModToolMaterials.ECHO, 1, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_SHOVEL = registerItem("echoshovel",
            new ShovelItem(ModToolMaterials.ECHO, 1.25f, -2.75f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ECHO_HOE = registerItem("echohoe",
            new HoeItem(ModToolMaterials.ECHO, -2, -1f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_HELMET = registerItem("emeraldhelmet",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emeraldchestplate",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_LEGGINGS = registerItem("emeraldleggings",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_BOOTS = registerItem("emeraldboots",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_SWORD = registerItem("emeraldsword",
            new SwordItem(ModToolMaterials.EMERALD,3, -2.4f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_AXE = registerItem("emeraldaxe",
            new AxeItem(ModToolMaterials.EMERALD, 6f, -3f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_PICKAXE = registerItem("emeraldpickaxe",
            new PickaxeItem(ModToolMaterials.EMERALD, 1, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_SHOVEL = registerItem("emeraldshovel",
            new ShovelItem(ModToolMaterials.EMERALD, 1.25f, -2.75f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_HOE = registerItem("emeraldhoe",
            new HoeItem(ModToolMaterials.EMERALD, -2, -1f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item AMETHYST_HELMET = registerItem("amethysthelmet",
            new ModArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethystchestplate",
            new ModArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethystleggings",
            new ModArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AMETHYST_BOOTS = registerItem("amethystboots",
            new ModArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item AMETHYST_SWORD = registerItem("amethystsword",
            new SwordItem(ModToolMaterials.AMETHYST,3, -2.4f, new FabricItemSettings()));
    public static final Item AMETHYST_AXE = registerItem("amethystaxe",
            new AxeItem(ModToolMaterials.AMETHYST, 6f, -3f, new FabricItemSettings()));
    public static final Item AMETHYST_PICKAXE = registerItem("amethystpickaxe",
            new PickaxeItem(ModToolMaterials.AMETHYST, 1, -2.8f, new FabricItemSettings()));
    public static final Item AMETHYST_SHOVEL = registerItem("amethystshovel",
            new ShovelItem(ModToolMaterials.AMETHYST, 1.5f, -2.75f, new FabricItemSettings()));
    public static final Item AMETHYST_HOE = registerItem("amethysthoe",
            new HoeItem(ModToolMaterials.AMETHYST, -2, -1f, new FabricItemSettings()));
    public static final Item COPPER_HELMET = registerItem("copperhelmet",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copperchestplate",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copperleggings",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copperboots",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("coppersword",
            new SwordItem(ModToolMaterials.COPPER,3, -2.5f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copperaxe",
            new AxeItem(ModToolMaterials.COPPER, 5f, -3.25f, new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copperpickaxe",
            new PickaxeItem(ModToolMaterials.COPPER, 1, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("coppershovel",
            new ShovelItem(ModToolMaterials.COPPER, 1.25f, -2.5f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copperhoe",
            new HoeItem(ModToolMaterials.COPPER, -2, -1f, new FabricItemSettings()));
    public static final Item COPPER_SHIELD = registerItem("coppershield",
            new ShieldItem(new FabricItemSettings().maxDamage(200)));
    public static final Item AMETHYST_SHIELD = registerItem("amethystshield",
            new ShieldItem(new FabricItemSettings().maxDamage(350)));
    public static final Item EMERALD_SHIELD = registerItem("emeraldshield",
            new ShieldItem(new FabricItemSettings().maxDamage(1400)));
    public static final Item ECHO_SHIELD = registerItem("echoshield",
            new ShieldItem(new FabricItemSettings().maxDamage(2000)));
    public static final Item OPAL_SHIELD = registerItem("opalshield",
            new ShieldItem(new FabricItemSettings().maxDamage(2031)));
    public static final Item TOPAZ_SHIELD = registerItem("topazshield",
            new ShieldItem(new FabricItemSettings().maxDamage(2031)));
    public static final Item RUBY_SHIELD = registerItem("rubyshield",
            new ShieldItem(new FabricItemSettings().maxDamage(2031)));
    public static final Item SAPPHIRE_SHIELD = registerItem("sapphireshield",
            new ShieldItem(new FabricItemSettings().maxDamage(2031)));
    public static final Item HYPHITE_SHIELD = registerItem("hyphiteshield",
            new ShieldItem(new FabricItemSettings().maxDamage(3000)));
    public static final Item TITANIUM_SHIELD = registerItem("titaniumshield",
            new ShieldItem(new FabricItemSettings().maxDamage(10000).fireproof()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MoreGear.MOD_ID, name), item);
    }
    public static void registerModItems(){
        MoreGear.LOGGER.info("Registering Mod Items for "+MoreGear.MOD_ID);
    }
}
