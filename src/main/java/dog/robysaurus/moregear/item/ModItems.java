package dog.robysaurus.moregear.item;

import dog.robysaurus.moregear.MoreGear;
import dog.robysaurus.moregear.entity.ModEntities;
import dog.robysaurus.moregear.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.List;

public class ModItems {
    //Identifier Variables for Smithing Templates
    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = new Identifier("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = new Identifier("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = new Identifier("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = new Identifier("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE = new Identifier("item/empty_slot_hoe");
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE = new Identifier("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE = new Identifier("item/empty_slot_sword");
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = new Identifier("item/empty_slot_shovel");
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = new Identifier("item/empty_slot_pickaxe");
    private static final Identifier EMPTY_SLOT_INGOT_TEXTURE = new Identifier("item/empty_slot_ingot");
    private static final Identifier EMPTY_SLOT_ELYTRA_TEXTURE = new Identifier(MoreGear.MOD_ID, "item/empty_slot_elytra");

    //General Items
    public static final Item PHYSICSIUM_NUGGET = registerItem("physicsiumnugget",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item PHYSICSIUM = registerItem("physicsium",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_TITANIUM = registerItem("rawtitanium",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item TITANIUM = registerItem("titanium",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item RAW_TRIPHITE = registerItem("rawtriphite",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item REINFORCED_TRIPHITE = registerItem("reinforcedtriphite",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item RAW_MYTHRIL = registerItem("rawmythril",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item MYTHRIL = registerItem("mythril",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item ENDIUM_SCRAP = registerItem("endiumscrap",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item ENDIUM = registerItem("endium",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item PHENON_SCRAP = registerItem("phenonscrap",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item PHENON = registerItem("phenon",
            new Item(new FabricItemSettings().fireproof()));
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
    public static final Item PHYSICS_IS_THE_BEST = registerItem("physics",
            new PhysicsItem(ModToolMaterials.PHYSICSIUM, (Integer.MAX_VALUE-101), ((float)(Integer.MAX_VALUE)), new FabricItemSettings().rarity(Rarity.EPIC).fireproof().maxDamage(-1)));
    public static final Item PHYSICSIUM_HELMET = registerItem("physicsiumhelmet",
            new ModArmorItem(ModArmorMaterials.PHYSICSIUM, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item PHYSICSIUM_CHESTPLATE = registerItem("physicsiumchestplate",
            new ModArmorItem(ModArmorMaterials.PHYSICSIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item PHYSICSIUM_LEGGINGS = registerItem("physicsiumleggings",
            new ModArmorItem(ModArmorMaterials.PHYSICSIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item PHYSICSIUM_BOOTS = registerItem("physicsiumboots",
            new ModArmorItem(ModArmorMaterials.PHYSICSIUM, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item PHYSICSIUM_SWORD = registerItem("physicsiumsword",
            new EffectSwordItem(ModToolMaterials.PHYSICSIUM, ModArmorMaterials.PHYSICSIUM, 9, 7f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item PHYSICSIUM_AXE = registerItem("physicsiumaxe",
            new EffectAxeItem(ModToolMaterials.PHYSICSIUM, ModArmorMaterials.PHYSICSIUM, 19f, 5f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item PHYSICSIUM_PICKAXE = registerItem("physicsiumpickaxe",
            new EffectPickaxeItem(ModToolMaterials.PHYSICSIUM, ModArmorMaterials.PHYSICSIUM, 4, 5f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item PHYSICSIUM_SHOVEL = registerItem("physicsiumshovel",
            new ShovelItem(ModToolMaterials.PHYSICSIUM, -1f, 5.5f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item PHYSICSIUM_HOE = registerItem("physicsiumhoe",
            new HoeItem(ModToolMaterials.PHYSICSIUM, -1, 5.5f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
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
    public static final Item REINFORCED_TRIPHITE_HELMET = registerItem("reinforcedtriphitehelmet",
            new ModArmorItem(ModArmorMaterials.REINFORCED_TRIPHITE, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item REINFORCED_TRIPHITE_CHESTPLATE = registerItem("reinforcedtriphitechestplate",
            new ModArmorItem(ModArmorMaterials.REINFORCED_TRIPHITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item REINFORCED_TRIPHITE_LEGGINGS = registerItem("reinforcedtriphiteleggings",
            new ModArmorItem(ModArmorMaterials.REINFORCED_TRIPHITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item REINFORCED_TRIPHITE_BOOTS = registerItem("reinforcedtriphiteboots",
            new ModArmorItem(ModArmorMaterials.REINFORCED_TRIPHITE, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item REINFORCED_TRIPHITE_SWORD = registerItem("reinforcedtriphitesword",
            new EffectSwordItem(ModToolMaterials.REINFORCED_TRIPHITE, ModArmorMaterials.REINFORCED_TRIPHITE, 14, 3f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item REINFORCED_TRIPHITE_AXE = registerItem("reinforcedtriphiteaxe",
            new EffectAxeItem(ModToolMaterials.REINFORCED_TRIPHITE, ModArmorMaterials.REINFORCED_TRIPHITE, 19f, 1f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item REINFORCED_TRIPHITE_PICKAXE = registerItem("reinforcedtriphitepickaxe",
            new EffectPickaxeItem(ModToolMaterials.REINFORCED_TRIPHITE, ModArmorMaterials.REINFORCED_TRIPHITE, 9, 1f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item REINFORCED_TRIPHITE_SHOVEL = registerItem("reinforcedtriphiteshovel",
            new ShovelItem(ModToolMaterials.REINFORCED_TRIPHITE, 4f, 1.5f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item REINFORCED_TRIPHITE_HOE = registerItem("reinforcedtriphitehoe",
            new HoeItem(ModToolMaterials.REINFORCED_TRIPHITE, 4, 1.5f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item MYTHRIL_HELMET = registerItem("mythrilhelmet",
            new ModArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythrilchestplate",
            new ModArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item MYTHRIL_LEGGINGS = registerItem("mythrilleggings",
            new ModArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item MYTHRIL_BOOTS = registerItem("mythrilboots",
            new ModArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item MYTHRIL_SWORD = registerItem("mythrilsword",
            new EffectSwordItem(ModToolMaterials.MYTHRIL, ModArmorMaterials.MYTHRIL, 9, -1f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item MYTHRIL_AXE = registerItem("mythrilaxe",
            new EffectAxeItem(ModToolMaterials.MYTHRIL, ModArmorMaterials.MYTHRIL, 14f, -1.5f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item MYTHRIL_PICKAXE = registerItem("mythrilpickaxe",
            new PickaxeItem(ModToolMaterials.MYTHRIL, 1, -1f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item MYTHRIL_SHOVEL = registerItem("mythrilshovel",
            new ShovelItem(ModToolMaterials.MYTHRIL, 1.5f, -1.5f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item MYTHRIL_HOE = registerItem("mythrilhoe",
            new HoeItem(ModToolMaterials.MYTHRIL, -2, 0.5f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item ENDIUM_HELMET = registerItem("endiumhelmet",
            new ModArmorItem(ModArmorMaterials.ENDIUM, ModArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item ENDIUM_CHESTPLATE = registerItem("endiumchestplate",
            new ModArmorItem(ModArmorMaterials.ENDIUM, ModArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item ENDIUM_LEGGINGS = registerItem("endiumleggings",
            new ModArmorItem(ModArmorMaterials.ENDIUM, ModArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item ENDIUM_BOOTS = registerItem("endiumboots",
            new ModArmorItem(ModArmorMaterials.ENDIUM, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item ENDIUM_SWORD = registerItem("endiumsword",
            new EffectSwordItem(ModToolMaterials.ENDIUM, ModArmorMaterials.ENDIUM, 9, -2f, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item ENDIUM_AXE = registerItem("endiumaxe",
            new AxeItem(ModToolMaterials.ENDIUM, 13f, -2.5f, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item ENDIUM_PICKAXE = registerItem("endiumpickaxe",
            new PickaxeItem(ModToolMaterials.ENDIUM, 1, -2f, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item ENDIUM_SHOVEL = registerItem("endiumshovel",
            new ShovelItem(ModToolMaterials.ENDIUM, 1.5f, -2.5f, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item ENDIUM_HOE = registerItem("endiumhoe",
            new HoeItem(ModToolMaterials.ENDIUM, -3, 0.0f, new FabricItemSettings().rarity(Rarity.RARE).fireproof()));
    public static final Item PHENON_HELMET = registerItem("phenonhelmet",
            new ModArmorItem(ModArmorMaterials.PHENON, ModArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item PHENON_CHESTPLATE = registerItem("phenonchestplate",
            new ModArmorItem(ModArmorMaterials.PHENON, ModArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item PHENON_LEGGINGS = registerItem("phenonleggings",
            new ModArmorItem(ModArmorMaterials.PHENON, ModArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item PHENON_BOOTS = registerItem("phenonboots",
            new ModArmorItem(ModArmorMaterials.PHENON, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));
    public static final Item PHENON_SWORD = registerItem("phenonsword",
            new SwordItem(ModToolMaterials.PHENON, 3, -2f, new FabricItemSettings().fireproof()));
    public static final Item PHENON_AXE = registerItem("phenonaxe",
            new EffectAxeItem(ModToolMaterials.PHENON, ModArmorMaterials.PHENON, 8f, -2.5f, new FabricItemSettings().fireproof()));
    public static final Item PHENON_PICKAXE = registerItem("phenonpickaxe",
            new PickaxeItem(ModToolMaterials.PHENON, 1, -2f, new FabricItemSettings().fireproof()));
    public static final Item PHENON_SHOVEL = registerItem("phenonshovel",
            new ShovelItem(ModToolMaterials.PHENON, 1.5f, -2.5f, new FabricItemSettings().fireproof()));
    public static final Item PHENON_HOE = registerItem("phenonhoe",
            new HoeItem(ModToolMaterials.PHENON, -3, 0.0f, new FabricItemSettings().fireproof()));
    public static final Item HYPHITE_HELMET = registerItem("hyphitehelmet",
            new ArmorItem(ModArmorMaterials.HYPHITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item HYPHITE_CHESTPLATE = registerItem("hyphitechestplate",
            new ArmorItem(ModArmorMaterials.HYPHITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item HYPHITE_LEGGINGS = registerItem("hyphiteleggings",
            new ArmorItem(ModArmorMaterials.HYPHITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item HYPHITE_BOOTS = registerItem("hyphiteboots",
            new ArmorItem(ModArmorMaterials.HYPHITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item HYPHITE_SWORD = registerItem("hyphitesword",
            new SwordItem(ModToolMaterials.HYPHITE, 3, -2f, new FabricItemSettings()));
    public static final Item HYPHITE_AXE = registerItem("hyphiteaxe",
            new AxeItem(ModToolMaterials.HYPHITE, 8f, -2.5f, new FabricItemSettings()));
    public static final Item HYPHITE_PICKAXE = registerItem("hyphitepickaxe",
            new PickaxeItem(ModToolMaterials.HYPHITE, 1, -2f, new FabricItemSettings()));
    public static final Item HYPHITE_SHOVEL = registerItem("hyphiteshovel",
            new ShovelItem(ModToolMaterials.HYPHITE, 1.5f, -2.5f, new FabricItemSettings()));
    public static final Item HYPHITE_HOE = registerItem("hyphitehoe",
            new HoeItem(ModToolMaterials.HYPHITE, -3, 0.0f, new FabricItemSettings()));
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
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item RUBY_CHESTPLATE = registerItem("rubychestplate",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item RUBY_LEGGINGS = registerItem("rubyleggings",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item RUBY_BOOTS = registerItem("rubyboots",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item RUBY_SWORD = registerItem("rubysword",
            new SwordItem(ModToolMaterials.RUBY,3, -2.4f, new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item RUBY_AXE = registerItem("rubyaxe",
            new EffectAxeItem(ModToolMaterials.RUBY, ModArmorMaterials.RUBY, 5.0f, -3.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item RUBY_PICKAXE = registerItem("rubypickaxe",
            new PickaxeItem(ModToolMaterials.RUBY, 1, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item RUBY_SHOVEL = registerItem("rubyshovel",
            new ShovelItem(ModToolMaterials.RUBY, 1.5f, -3.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item RUBY_HOE = registerItem("rubyhoe",
            new HoeItem(ModToolMaterials.RUBY, -4, 0.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof()));
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
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ECHO_CHESTPLATE = registerItem("echochestplate",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ECHO_LEGGINGS = registerItem("echoleggings",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ECHO_BOOTS = registerItem("echoboots",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item ECHO_SWORD = registerItem("echosword",
            new EffectSwordItem(ModToolMaterials.ECHO, ModArmorMaterials.ECHO,3, -2.4f, new FabricItemSettings()));
    public static final Item ECHO_AXE = registerItem("echoaxe",
            new AxeItem(ModToolMaterials.ECHO, 5f, -3f, new FabricItemSettings()));
    public static final Item ECHO_PICKAXE = registerItem("echopickaxe",
            new PickaxeItem(ModToolMaterials.ECHO, 1, -2.8f, new FabricItemSettings()));
    public static final Item ECHO_SHOVEL = registerItem("echoshovel",
            new ShovelItem(ModToolMaterials.ECHO, 1.25f, -2.75f, new FabricItemSettings()));
    public static final Item ECHO_HOE = registerItem("echohoe",
            new HoeItem(ModToolMaterials.ECHO, -2, -1f, new FabricItemSettings()));
    public static final Item EMERALD_HELMET = registerItem("emeraldhelmet",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item EMERALD_CHESTPLATE = registerItem("emeraldchestplate",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item EMERALD_LEGGINGS = registerItem("emeraldleggings",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item EMERALD_BOOTS = registerItem("emeraldboots",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item EMERALD_SWORD = registerItem("emeraldsword",
            new SwordItem(ModToolMaterials.EMERALD,3, -2.4f, new FabricItemSettings()));
    public static final Item EMERALD_AXE = registerItem("emeraldaxe",
            new AxeItem(ModToolMaterials.EMERALD, 6f, -3f, new FabricItemSettings()));
    public static final Item EMERALD_PICKAXE = registerItem("emeraldpickaxe",
            new PickaxeItem(ModToolMaterials.EMERALD, 1, -2.8f, new FabricItemSettings()));
    public static final Item EMERALD_SHOVEL = registerItem("emeraldshovel",
            new ShovelItem(ModToolMaterials.EMERALD, 1.25f, -2.75f, new FabricItemSettings()));
    public static final Item EMERALD_HOE = registerItem("emeraldhoe",
            new HoeItem(ModToolMaterials.EMERALD, -2, -1f, new FabricItemSettings()));
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
            new ShieldItem(new FabricItemSettings().maxDamage(2031).rarity(Rarity.UNCOMMON)));
    public static final Item TOPAZ_SHIELD = registerItem("topazshield",
            new ShieldItem(new FabricItemSettings().maxDamage(2031).rarity(Rarity.UNCOMMON)));
    public static final Item RUBY_SHIELD = registerItem("rubyshield",
            new ShieldItem(new FabricItemSettings().maxDamage(2031).rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item SAPPHIRE_SHIELD = registerItem("sapphireshield",
            new ShieldItem(new FabricItemSettings().maxDamage(2031).rarity(Rarity.UNCOMMON)));
    public static final Item HYPHITE_SHIELD = registerItem("hyphiteshield",
            new ShieldItem(new FabricItemSettings().maxDamage(3000)));
    public static final Item PHENON_SHIELD = registerItem("phenonshield",
            new ShieldItem(new FabricItemSettings().maxDamage(3500).fireproof()));
    public static final Item ENDIUM_SHIELD = registerItem("endiumshield",
            new ShieldItem(new FabricItemSettings().maxDamage(4000).rarity(Rarity.RARE).fireproof()));
    public static final Item MYTHRIL_SHIELD = registerItem("mythrilshield",
            new ShieldItem(new FabricItemSettings().maxDamage(6000).rarity(Rarity.RARE).fireproof()));
    public static final Item REINFORCED_TRIPHITE_SHIELD = registerItem("reinforcedtriphiteshield",
            new ShieldItem(new FabricItemSettings().maxDamage(8000).rarity(Rarity.RARE).fireproof()));
    public static final Item TITANIUM_SHIELD = registerItem("titaniumshield",
            new ShieldItem(new FabricItemSettings().maxDamage(10000).rarity(Rarity.EPIC).fireproof()));
    public static final Item PHYSICSIUM_SHIELD = registerItem("physicsiumshield",
            new ShieldItem(new FabricItemSettings().maxDamage(100000).rarity(Rarity.EPIC).fireproof()));
    public static final Item PHYSICSIUM_ELYTRA_CHESTPLATE = registerItem("physicsiumelytrachestplate",
            new PhysicsiumElytraChestplateItem(ModArmorMaterials.PHYSICSIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    // Upgrade Templates
    public static final Item ELYTRA_CHESTPLATE_UPGRADE = registerItem("elytrachestplateupgrade",
            new SmithingTemplateItem(Text.literal("Physicsium Chestplate").formatted(Formatting.BLUE), Text.literal("Elytra").formatted(Formatting.BLUE), Text.literal("Physicsium Elytra-Chestplate Upgrade").formatted(Formatting.GRAY), Text.literal("Add Physicsium Chestplate"), Text.literal("Add Elytra"), List.of(EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE), List.of(EMPTY_SLOT_ELYTRA_TEXTURE)));
    public static final Item PHYSICSIUM_UPGRADE = registerItem("physicsiumupgrade",
            new SmithingTemplateItem(Text.literal("Titanium Equipment").formatted(Formatting.BLUE), Text.literal("Physicsium Ingot").formatted(Formatting.BLUE), Text.literal("Physicsium Upgrade").formatted(Formatting.GRAY), Text.literal("Add titanium armor, weapon, or tool"), Text.literal("Add Physicsium Ingot"), getUpgradeEmptyBaseSlotTextures(), getUpgradeEmptyAdditionsSlotTextures()));
    public static final Item TITANIUM_UPGRADE = registerItem("titaniumupgrade",
            new SmithingTemplateItem(Text.literal("Reinforced Triphite Equipment").formatted(Formatting.BLUE), Text.literal("Titanium Ingot").formatted(Formatting.BLUE), Text.literal("Titanium Upgrade").formatted(Formatting.GRAY), Text.literal("Add reinforced triphite armor, weapon, or tool"), Text.literal("Add Titanium Ingot"), getUpgradeEmptyBaseSlotTextures(), getUpgradeEmptyAdditionsSlotTextures()));
    public static final Item REINFORCED_TRIPHITE_UPGRADE = registerItem("reinforcedtriphiteupgrade",
            new SmithingTemplateItem(Text.literal("Mythril Equipment").formatted(Formatting.BLUE), Text.literal("Reinforced Triphite Ingot").formatted(Formatting.BLUE), Text.literal("Reinforced Triphite Upgrade").formatted(Formatting.GRAY), Text.literal("Add mythril armor, weapon, or tool"), Text.literal("Add Reinforced Triphite Ingot"), getUpgradeEmptyBaseSlotTextures(), getUpgradeEmptyAdditionsSlotTextures()));
    public static final Item MYTHRIL_UPGRADE = registerItem("mythrilupgrade",
            new SmithingTemplateItem(Text.literal("Endium Equipment").formatted(Formatting.BLUE), Text.literal("Mythril Ingot").formatted(Formatting.BLUE), Text.literal("Mythril Upgrade").formatted(Formatting.GRAY), Text.literal("Add endium armor, weapon, or tool"), Text.literal("Add Mythril Ingot"), getUpgradeEmptyBaseSlotTextures(), getUpgradeEmptyAdditionsSlotTextures()));
    public static final Item ENDIUM_UPGRADE = registerItem("endiumupgrade",
            new SmithingTemplateItem(Text.literal("Phenon Equipment").formatted(Formatting.BLUE), Text.literal("Endium Ingot").formatted(Formatting.BLUE), Text.literal("Endium Upgrade").formatted(Formatting.GRAY), Text.literal("Add phenon armor, weapon, or tool"), Text.literal("Add Endium Ingot"), getUpgradeEmptyBaseSlotTextures(), getUpgradeEmptyAdditionsSlotTextures()));
    public static final Item PHENON_UPGRADE = registerItem("phenonupgrade",
            new SmithingTemplateItem(Text.literal("Hyphite Equipment").formatted(Formatting.BLUE), Text.literal("Phenon Ingot").formatted(Formatting.BLUE), Text.literal("Phenon Upgrade").formatted(Formatting.GRAY), Text.literal("Add hyphite armor, weapon, or tool"), Text.literal("Add Phenon Ingot"), getUpgradeEmptyBaseSlotTextures(), getUpgradeEmptyAdditionsSlotTextures()));
    public static final Item SAPPHIRE_UPGRADE = registerItem("sapphireupgrade",
            new SmithingTemplateItem(Text.literal("Netherite Equipment").formatted(Formatting.BLUE), Text.literal("Sapphire").formatted(Formatting.BLUE), Text.literal("Sapphire Upgrade").formatted(Formatting.GRAY), Text.literal("Add netherite armor, weapon, or tool"), Text.literal("Add Sapphire"), getUpgradeEmptyBaseSlotTextures(), getUpgradeEmptyAdditionsSlotTextures()));
    public static final Item RUBY_UPGRADE = registerItem("rubyupgrade",
            new SmithingTemplateItem(Text.literal("Netherite Equipment").formatted(Formatting.BLUE), Text.literal("Ruby").formatted(Formatting.BLUE), Text.literal("Ruby Upgrade").formatted(Formatting.GRAY), Text.literal("Add netherite armor, weapon, or tool"), Text.literal("Add Ruby"), getUpgradeEmptyBaseSlotTextures(), getUpgradeEmptyAdditionsSlotTextures()));
    public static final Item TOPAZ_UPGRADE = registerItem("topazupgrade",
            new SmithingTemplateItem(Text.literal("Netherite Equipment").formatted(Formatting.BLUE), Text.literal("Topaz").formatted(Formatting.BLUE), Text.literal("Topaz Upgrade").formatted(Formatting.GRAY), Text.literal("Add netherite armor, weapon, or tool"), Text.literal("Add Topaz"), getUpgradeEmptyBaseSlotTextures(), getUpgradeEmptyAdditionsSlotTextures()));
    public static final Item OPAL_UPGRADE = registerItem("opalupgrade",
            new SmithingTemplateItem(Text.literal("Netherite Equipment").formatted(Formatting.BLUE), Text.literal("Opal").formatted(Formatting.BLUE), Text.literal("Opal Upgrade").formatted(Formatting.GRAY), Text.literal("Add netherite armor, weapon, or tool"), Text.literal("Add Opal"), getUpgradeEmptyBaseSlotTextures(), getUpgradeEmptyAdditionsSlotTextures()));
    public static final Item HYPHITE_UPGRADE = registerItem("hyphiteupgrade",
            new SmithingTemplateItem(Text.literal("Netherite Equipment").formatted(Formatting.BLUE), Text.literal("Refined Hyphite").formatted(Formatting.BLUE), Text.literal("Hyphite Upgrade").formatted(Formatting.GRAY), Text.literal("Add netherite armor, weapon, or tool"), Text.literal("Add Refined Hyphite"), getUpgradeEmptyBaseSlotTextures(), getUpgradeEmptyAdditionsSlotTextures()));
    //Spawn Egg
    public static final Item SHRIKE_SPAWN_EGG = registerItem("shrikespawnegg",
            new SpawnEggItem(ModEntities.SHRIKE, 0x999999, 0x00b4ff, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MoreGear.MOD_ID, name), item);
    }
    private static List<Identifier> getUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }
    private static List<Identifier> getUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }
    public static void registerModItems(){
        MoreGear.LOGGER.info("Registering Mod Items for "+MoreGear.MOD_ID);
    }
}
