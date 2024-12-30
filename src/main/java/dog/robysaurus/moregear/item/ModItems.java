package dog.robysaurus.moregear.item;

import dog.robysaurus.moregear.MoreGear;
import dog.robysaurus.moregear.entity.ModEntities;
import dog.robysaurus.moregear.item.custom.*;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.UnbreakableComponent;
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
    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = Identifier.of("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = Identifier.of("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = Identifier.of("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = Identifier.of("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE = Identifier.of("item/empty_slot_hoe");
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE = Identifier.of("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE = Identifier.of("item/empty_slot_sword");
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = Identifier.of("item/empty_slot_shovel");
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = Identifier.of("item/empty_slot_pickaxe");
    private static final Identifier EMPTY_SLOT_INGOT_TEXTURE = Identifier.of("item/empty_slot_ingot");
    private static final Identifier EMPTY_SLOT_ELYTRA_TEXTURE = Identifier.of(MoreGear.MOD_ID, "item/empty_slot_elytra");

    //General Items
    public static final Item PHYSICSIUM_NUGGET = registerItem("physicsiumnugget",
            new Item(new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item PHYSICSIUM = registerItem("physicsium",
            new Item(new Item.Settings().rarity(Rarity.EPIC).fireproof()));
    public static final Item RAW_TITANIUM = registerItem("rawtitanium",
            new Item(new Item.Settings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item TITANIUM = registerItem("titanium",
            new Item(new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item RAW_TRIPHITE = registerItem("rawtriphite",
            new Item(new Item.Settings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item REINFORCED_TRIPHITE = registerItem("reinforcedtriphite",
            new Item(new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item RAW_MYTHRIL = registerItem("rawmythril",
            new Item(new Item.Settings().fireproof()));
    public static final Item MYTHRIL = registerItem("mythril",
            new Item(new Item.Settings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item ENDIUM_SCRAP = registerItem("endiumscrap",
            new Item(new Item.Settings().fireproof()));
    public static final Item ENDIUM = registerItem("endium",
            new Item(new Item.Settings().fireproof()));
    public static final Item PHENON_SCRAP = registerItem("phenonscrap",
            new Item(new Item.Settings().fireproof()));
    public static final Item PHENON = registerItem("phenon",
            new Item(new Item.Settings().fireproof()));
    public static final Item UNREFINED_HYPHITE = registerItem("unrefinedhyphite",
            new Item(new Item.Settings()));
    public static final Item HYPHITE = registerItem("hyphite",
            new Item(new Item.Settings()));
    public static final Item RAW_TOPAZ = registerItem("rawtopaz",
            new Item(new Item.Settings()));
    public static final Item TOPAZ = registerItem("topaz",
            new Item(new Item.Settings()));
    public static final Item RAW_SAPPHIRE = registerItem("rawsapphire",
            new Item(new Item.Settings()));
    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("rawruby",
            new Item(new Item.Settings().fireproof()));
    public static final Item RUBY = registerItem("ruby",
            new Item(new Item.Settings().fireproof()));
    public static final Item RAW_OPAL = registerItem("rawopal",
            new Item(new Item.Settings()));
    public static final Item OPAL = registerItem("opal",
            new Item(new Item.Settings()));
    //Gear
    public static final Item PHYSICS = registerItem("physics",
            new PhysicsItem(ModToolMaterials.PHYSICSIUM, new Item.Settings().rarity(Rarity.EPIC).fireproof().component(DataComponentTypes.UNBREAKABLE, new UnbreakableComponent(true)).attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PHYSICSIUM, (Integer.MAX_VALUE-101), ((float)(Integer.MAX_VALUE))))));
    public static final Item PHYSICSIUM_HELMET = registerItem("physicsiumhelmet",
            new ModArmorItem(ModArmorMaterials.PHYSICSIUM, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.EPIC).fireproof().maxDamage(100000)));
    public static final Item PHYSICSIUM_CHESTPLATE = registerItem("physicsiumchestplate",
            new ModArmorItem(ModArmorMaterials.PHYSICSIUM, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.EPIC).fireproof().maxDamage(100000)));
    public static final Item PHYSICSIUM_LEGGINGS = registerItem("physicsiumleggings",
            new ModArmorItem(ModArmorMaterials.PHYSICSIUM, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.EPIC).fireproof().maxDamage(100000)));
    public static final Item PHYSICSIUM_BOOTS = registerItem("physicsiumboots",
            new ModArmorItem(ModArmorMaterials.PHYSICSIUM, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.EPIC).fireproof().maxDamage(100000)));
    public static final Item PHYSICSIUM_SWORD = registerItem("physicsiumsword",
            new EffectSwordItem(ModToolMaterials.PHYSICSIUM, ModArmorMaterials.PHYSICSIUM, 9, 7f, new Item.Settings().fireproof().rarity(Rarity.EPIC)));
    public static final Item PHYSICSIUM_AXE = registerItem("physicsiumaxe",
            new EffectAxeItem(ModToolMaterials.PHYSICSIUM, ModArmorMaterials.PHYSICSIUM, 19f, 5f, new Item.Settings().fireproof().rarity(Rarity.EPIC)));
    public static final Item PHYSICSIUM_PICKAXE = registerItem("physicsiumpickaxe",
            new EffectPickaxeItem(ModToolMaterials.PHYSICSIUM, ModArmorMaterials.PHYSICSIUM, 4, 5f, new Item.Settings().fireproof().rarity(Rarity.EPIC)));
    public static final Item PHYSICSIUM_SHOVEL = registerItem("physicsiumshovel",
            new ShovelItem(ModToolMaterials.PHYSICSIUM, new Item.Settings().fireproof().rarity(Rarity.EPIC).attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PHYSICSIUM, -1f, 5.5f))));
    public static final Item PHYSICSIUM_HOE = registerItem("physicsiumhoe",
            new HoeItem(ModToolMaterials.PHYSICSIUM, new Item.Settings().fireproof().rarity(Rarity.EPIC).attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PHYSICSIUM, -1, 5.5f))));
    public static final Item TITANIUM_HELMET = registerItem("titaniumhelmet",
            new ModArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.EPIC).fireproof().maxDamage(10000)));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titaniumchestplate",
            new ModArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.EPIC).fireproof().maxDamage(10000)));
    public static final Item TITANIUM_LEGGINGS = registerItem("titaniumleggings",
            new ModArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.EPIC).fireproof().maxDamage(10000)));
    public static final Item TITANIUM_BOOTS = registerItem("titaniumboots",
            new ModArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.EPIC).fireproof().maxDamage(10000)));
    public static final Item TITANIUM_SWORD = registerItem("titaniumsword",
            new EffectSwordItem(ModToolMaterials.TITANIUM, ModArmorMaterials.TITANIUM, 14, 4f, new Item.Settings().fireproof().rarity(Rarity.EPIC)));
    public static final Item TITANIUM_AXE = registerItem("titaniumaxe",
            new AxeItem(ModToolMaterials.TITANIUM, new Item.Settings().fireproof().rarity(Rarity.EPIC).attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TITANIUM, 19f, 2f))));
    public static final Item TITANIUM_PICKAXE = registerItem("titaniumpickaxe",
            new PickaxeItem(ModToolMaterials.TITANIUM, new Item.Settings().fireproof().rarity(Rarity.EPIC).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TITANIUM, 9, 2f))));
    public static final Item TITANIUM_SHOVEL = registerItem("titaniumshovel",
            new ShovelItem(ModToolMaterials.TITANIUM, new Item.Settings().fireproof().rarity(Rarity.EPIC).attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TITANIUM, 4f, 2.5f))));
    public static final Item TITANIUM_HOE = registerItem("titaniumhoe",
            new HoeItem(ModToolMaterials.TITANIUM, new Item.Settings().fireproof().rarity(Rarity.EPIC).attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TITANIUM, 4, 2.5f))));
    public static final Item REINFORCED_TRIPHITE_HELMET = registerItem("reinforcedtriphitehelmet",
            new ModArmorItem(ModArmorMaterials.REINFORCED_TRIPHITE, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(8000)));
    public static final Item REINFORCED_TRIPHITE_CHESTPLATE = registerItem("reinforcedtriphitechestplate",
            new ModArmorItem(ModArmorMaterials.REINFORCED_TRIPHITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(8000)));
    public static final Item REINFORCED_TRIPHITE_LEGGINGS = registerItem("reinforcedtriphiteleggings",
            new ModArmorItem(ModArmorMaterials.REINFORCED_TRIPHITE, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(8000)));
    public static final Item REINFORCED_TRIPHITE_BOOTS = registerItem("reinforcedtriphiteboots",
            new ModArmorItem(ModArmorMaterials.REINFORCED_TRIPHITE, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(8000)));
    public static final Item REINFORCED_TRIPHITE_SWORD = registerItem("reinforcedtriphitesword",
            new EffectSwordItem(ModToolMaterials.REINFORCED_TRIPHITE, ModArmorMaterials.REINFORCED_TRIPHITE, 14, 3f, new Item.Settings().fireproof().rarity(Rarity.RARE)));
    public static final Item REINFORCED_TRIPHITE_AXE = registerItem("reinforcedtriphiteaxe",
            new EffectAxeItem(ModToolMaterials.REINFORCED_TRIPHITE, ModArmorMaterials.REINFORCED_TRIPHITE, 19f, 1f, new Item.Settings().fireproof().rarity(Rarity.RARE)));
    public static final Item REINFORCED_TRIPHITE_PICKAXE = registerItem("reinforcedtriphitepickaxe",
            new EffectPickaxeItem(ModToolMaterials.REINFORCED_TRIPHITE, ModArmorMaterials.REINFORCED_TRIPHITE, 9, 1f, new Item.Settings().fireproof().rarity(Rarity.RARE)));
    public static final Item REINFORCED_TRIPHITE_SHOVEL = registerItem("reinforcedtriphiteshovel",
            new ShovelItem(ModToolMaterials.REINFORCED_TRIPHITE, new Item.Settings().fireproof().rarity(Rarity.RARE).attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.REINFORCED_TRIPHITE, 4f, 1.5f))));
    public static final Item REINFORCED_TRIPHITE_HOE = registerItem("reinforcedtriphitehoe",
            new HoeItem(ModToolMaterials.REINFORCED_TRIPHITE, new Item.Settings().fireproof().rarity(Rarity.RARE).attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_TRIPHITE, 4, 1.5f))));
    public static final Item MYTHRIL_HELMET = registerItem("mythrilhelmet",
            new ModArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(6000)));
    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythrilchestplate",
            new ModArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(6000)));
    public static final Item MYTHRIL_LEGGINGS = registerItem("mythrilleggings",
            new ModArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(6000)));
    public static final Item MYTHRIL_BOOTS = registerItem("mythrilboots",
            new ModArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(6000)));
    public static final Item MYTHRIL_SWORD = registerItem("mythrilsword",
            new EffectSwordItem(ModToolMaterials.MYTHRIL, ModArmorMaterials.MYTHRIL, 9, -1f, new Item.Settings().fireproof().rarity(Rarity.RARE)));
    public static final Item MYTHRIL_AXE = registerItem("mythrilaxe",
            new EffectAxeItem(ModToolMaterials.MYTHRIL, ModArmorMaterials.MYTHRIL, 14f, -1.5f, new Item.Settings().fireproof().rarity(Rarity.RARE)));
    public static final Item MYTHRIL_PICKAXE = registerItem("mythrilpickaxe",
            new PickaxeItem(ModToolMaterials.MYTHRIL, new Item.Settings().fireproof().rarity(Rarity.RARE).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.MYTHRIL, 1, -1f))));
    public static final Item MYTHRIL_SHOVEL = registerItem("mythrilshovel",
            new ShovelItem(ModToolMaterials.MYTHRIL, new Item.Settings().fireproof().rarity(Rarity.RARE).attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.MYTHRIL, 1.5f, -1.5f))));
    public static final Item MYTHRIL_HOE = registerItem("mythrilhoe",
            new HoeItem(ModToolMaterials.MYTHRIL, new Item.Settings().fireproof().rarity(Rarity.RARE).attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.MYTHRIL, -2, 0.5f))));
    public static final Item ENDIUM_HELMET = registerItem("endiumhelmet",
            new ModArmorItem(ModArmorMaterials.ENDIUM, ModArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(4000)));
    public static final Item ENDIUM_CHESTPLATE = registerItem("endiumchestplate",
            new ModArmorItem(ModArmorMaterials.ENDIUM, ModArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(4000)));
    public static final Item ENDIUM_LEGGINGS = registerItem("endiumleggings",
            new ModArmorItem(ModArmorMaterials.ENDIUM, ModArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(4000)));
    public static final Item ENDIUM_BOOTS = registerItem("endiumboots",
            new ModArmorItem(ModArmorMaterials.ENDIUM, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(4000)));
    public static final Item ENDIUM_SWORD = registerItem("endiumsword",
            new EffectSwordItem(ModToolMaterials.ENDIUM, ModArmorMaterials.ENDIUM, 9, -2f, new Item.Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item ENDIUM_AXE = registerItem("endiumaxe",
            new AxeItem(ModToolMaterials.ENDIUM, new Item.Settings().rarity(Rarity.RARE).fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ENDIUM, 13f, -2.5f))));
    public static final Item ENDIUM_PICKAXE = registerItem("endiumpickaxe",
            new PickaxeItem(ModToolMaterials.ENDIUM, new Item.Settings().rarity(Rarity.RARE).fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ENDIUM, 1, -2f))));
    public static final Item ENDIUM_SHOVEL = registerItem("endiumshovel",
            new ShovelItem(ModToolMaterials.ENDIUM, new Item.Settings().rarity(Rarity.RARE).fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ENDIUM, 1.5f, -2.5f))));
    public static final Item ENDIUM_HOE = registerItem("endiumhoe",
            new HoeItem(ModToolMaterials.ENDIUM, new Item.Settings().rarity(Rarity.RARE).fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ENDIUM, -3, 0.0f))));
    public static final Item PHENON_HELMET = registerItem("phenonhelmet",
            new ModArmorItem(ModArmorMaterials.PHENON, ModArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(2500)));
    public static final Item PHENON_CHESTPLATE = registerItem("phenonchestplate",
            new ModArmorItem(ModArmorMaterials.PHENON, ModArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(2500)));
    public static final Item PHENON_LEGGINGS = registerItem("phenonleggings",
            new ModArmorItem(ModArmorMaterials.PHENON, ModArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(2500)));
    public static final Item PHENON_BOOTS = registerItem("phenonboots",
            new ModArmorItem(ModArmorMaterials.PHENON, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(2500)));
    public static final Item PHENON_SWORD = registerItem("phenonsword",
            new SwordItem(ModToolMaterials.PHENON, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PHENON, 3, -2f))));
    public static final Item PHENON_AXE = registerItem("phenonaxe",
            new EffectAxeItem(ModToolMaterials.PHENON, ModArmorMaterials.PHENON, 8f, -2.5f, new Item.Settings().fireproof()));
    public static final Item PHENON_PICKAXE = registerItem("phenonpickaxe",
            new PickaxeItem(ModToolMaterials.PHENON, new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PHENON, 1, -2f))));
    public static final Item PHENON_SHOVEL = registerItem("phenonshovel",
            new ShovelItem(ModToolMaterials.PHENON, new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PHENON, 1.5f, -2.5f))));
    public static final Item PHENON_HOE = registerItem("phenonhoe",
            new HoeItem(ModToolMaterials.PHENON, new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PHENON, -3, 0.0f))));
    public static final Item HYPHITE_HELMET = registerItem("hyphitehelmet",
            new ArmorItem(ModArmorMaterials.HYPHITE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(1000)));
    public static final Item HYPHITE_CHESTPLATE = registerItem("hyphitechestplate",
            new ArmorItem(ModArmorMaterials.HYPHITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(1000)));
    public static final Item HYPHITE_LEGGINGS = registerItem("hyphiteleggings",
            new ArmorItem(ModArmorMaterials.HYPHITE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(1000)));
    public static final Item HYPHITE_BOOTS = registerItem("hyphiteboots",
            new ArmorItem(ModArmorMaterials.HYPHITE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(1000)));
    public static final Item HYPHITE_SWORD = registerItem("hyphitesword",
            new SwordItem(ModToolMaterials.HYPHITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.HYPHITE, 3, -2f))));
    public static final Item HYPHITE_AXE = registerItem("hyphiteaxe",
            new AxeItem(ModToolMaterials.HYPHITE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.HYPHITE, 8f, -2.5f))));
    public static final Item HYPHITE_PICKAXE = registerItem("hyphitepickaxe",
            new PickaxeItem(ModToolMaterials.HYPHITE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.HYPHITE, 1, -2f))));
    public static final Item HYPHITE_SHOVEL = registerItem("hyphiteshovel",
            new ShovelItem(ModToolMaterials.HYPHITE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.HYPHITE, 1.5f, -2.5f))));
    public static final Item HYPHITE_HOE = registerItem("hyphitehoe",
            new HoeItem(ModToolMaterials.HYPHITE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.HYPHITE, -3, 0.0f))));
    public static final Item SAPPHIRE_HELMET = registerItem("sapphirehelmet",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphirechestplate",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphireleggings",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphireboots",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphiresword",
            new EffectSwordItem(ModToolMaterials.SAPPHIRE, ModArmorMaterials.SAPPHIRE, 3, -2.4f, new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item SAPPHIRE_AXE = registerItem("sapphireaxe",
            new AxeItem(ModToolMaterials.SAPPHIRE, new Item.Settings().rarity(Rarity.UNCOMMON).attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, 5.0f, -3.0f))));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphirepickaxe",
            new PickaxeItem(ModToolMaterials.SAPPHIRE, new Item.Settings().rarity(Rarity.UNCOMMON).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, 1, -2.8f))));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphireshovel",
            new ShovelItem(ModToolMaterials.SAPPHIRE, new Item.Settings().rarity(Rarity.UNCOMMON).attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, 1.5f, -3.0f))));
    public static final Item SAPPHIRE_HOE = registerItem("sapphirehoe",
            new HoeItem(ModToolMaterials.SAPPHIRE, new Item.Settings().rarity(Rarity.UNCOMMON).attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, -4, 0.0f))));
    public static final Item RUBY_HELMET = registerItem("rubyhelmet",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item RUBY_CHESTPLATE = registerItem("rubychestplate",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item RUBY_LEGGINGS = registerItem("rubyleggings",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item RUBY_BOOTS = registerItem("rubyboots",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));
    public static final Item RUBY_SWORD = registerItem("rubysword",
            new SwordItem(ModToolMaterials.RUBY,new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, 3, -2.4f))));
    public static final Item RUBY_AXE = registerItem("rubyaxe",
            new EffectAxeItem(ModToolMaterials.RUBY, ModArmorMaterials.RUBY, 5.0f, -3.0f, new Item.Settings().rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item RUBY_PICKAXE = registerItem("rubypickaxe",
            new PickaxeItem(ModToolMaterials.RUBY, new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 1, -2.8f))));
    public static final Item RUBY_SHOVEL = registerItem("rubyshovel",
            new ShovelItem(ModToolMaterials.RUBY, new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.RUBY, 1.5f, -3.0f))));
    public static final Item RUBY_HOE = registerItem("rubyhoe",
            new HoeItem(ModToolMaterials.RUBY, new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.RUBY, -4, 0.0f))));
    public static final Item TOPAZ_HELMET = registerItem("topazhelmet",
            new ModArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item TOPAZ_CHESTPLATE = registerItem("topazchestplate",
            new ModArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item TOPAZ_LEGGINGS = registerItem("topazleggings",
            new ModArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item TOPAZ_BOOTS = registerItem("topazboots",
            new ModArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));
    public static final Item TOPAZ_SWORD = registerItem("topazsword",
            new SwordItem(ModToolMaterials.TOPAZ,new Item.Settings().rarity(Rarity.UNCOMMON).attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TOPAZ, 3, -2.4f))));
    public static final Item TOPAZ_AXE = registerItem("topazaxe",
            new AxeItem(ModToolMaterials.TOPAZ, new Item.Settings().rarity(Rarity.UNCOMMON).attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TOPAZ, 5.0f, -3.0f))));
    public static final Item TOPAZ_PICKAXE = registerItem("topazpickaxe",
            new EffectPickaxeItem(ModToolMaterials.TOPAZ, ModArmorMaterials.TOPAZ, 1, -2.8f, new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item TOPAZ_SHOVEL = registerItem("topazshovel",
            new ShovelItem(ModToolMaterials.TOPAZ, new Item.Settings().rarity(Rarity.UNCOMMON).attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TOPAZ, 1.5f, -3.0f))));
    public static final Item TOPAZ_HOE = registerItem("topazhoe",
            new HoeItem(ModToolMaterials.TOPAZ, new Item.Settings().rarity(Rarity.UNCOMMON).attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TOPAZ, -4, 0.0f))));
    public static final Item OPAL_HELMET = registerItem("opalhelmet",
            new ModArmorItem(ModArmorMaterials.OPAL, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item OPAL_CHESTPLATE = registerItem("opalchestplate",
            new ModArmorItem(ModArmorMaterials.OPAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item OPAL_LEGGINGS = registerItem("opalleggings",
            new ModArmorItem(ModArmorMaterials.OPAL, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item OPAL_BOOTS = registerItem("opalboots",
            new ModArmorItem(ModArmorMaterials.OPAL, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));
    public static final Item OPAL_SWORD = registerItem("opalsword",
            new EffectSwordItem(ModToolMaterials.OPAL, ModArmorMaterials.OPAL, 3, -2.4f, new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item OPAL_AXE = registerItem("opalaxe",
            new EffectAxeItem(ModToolMaterials.OPAL, ModArmorMaterials.OPAL, 5.0f, -3.0f, new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item OPAL_PICKAXE = registerItem("opalpickaxe",
            new PickaxeItem(ModToolMaterials.OPAL, new Item.Settings().rarity(Rarity.UNCOMMON).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.OPAL, 1, -2.8f))));
    public static final Item OPAL_SHOVEL = registerItem("opalshovel",
            new ShovelItem(ModToolMaterials.OPAL, new Item.Settings().rarity(Rarity.UNCOMMON).attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.OPAL, 1.5f, -3.0f))));
    public static final Item OPAL_HOE = registerItem("opalhoe",
            new HoeItem(ModToolMaterials.OPAL, new Item.Settings().rarity(Rarity.UNCOMMON).attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.OPAL, -4, 0.0f))));
    public static final Item ECHO_HELMET = registerItem("echohelmet",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(36))));
    public static final Item ECHO_CHESTPLATE = registerItem("echochestplate",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(36))));
    public static final Item ECHO_LEGGINGS = registerItem("echoleggings",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(36))));
    public static final Item ECHO_BOOTS = registerItem("echoboots",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(36))));
    public static final Item ECHO_SWORD = registerItem("echosword",
            new EffectSwordItem(ModToolMaterials.ECHO, ModArmorMaterials.ECHO,3, -2.4f, new Item.Settings()));
    public static final Item ECHO_AXE = registerItem("echoaxe",
            new AxeItem(ModToolMaterials.ECHO, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ECHO, 5f, -3f))));
    public static final Item ECHO_PICKAXE = registerItem("echopickaxe",
            new PickaxeItem(ModToolMaterials.ECHO, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ECHO, 1, -2.8f))));
    public static final Item ECHO_SHOVEL = registerItem("echoshovel",
            new ShovelItem(ModToolMaterials.ECHO, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ECHO, 1.25f, -2.75f))));
    public static final Item ECHO_HOE = registerItem("echohoe",
            new HoeItem(ModToolMaterials.ECHO, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ECHO, -2, -1f))));
    public static final Item EMERALD_HELMET = registerItem("emeraldhelmet",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(28))));
    public static final Item EMERALD_CHESTPLATE = registerItem("emeraldchestplate",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(28))));
    public static final Item EMERALD_LEGGINGS = registerItem("emeraldleggings",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(28))));
    public static final Item EMERALD_BOOTS = registerItem("emeraldboots",
            new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(28))));
    public static final Item EMERALD_SWORD = registerItem("emeraldsword",
            new SwordItem(ModToolMaterials.EMERALD,new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.EMERALD, 3, -2.4f))));
    public static final Item EMERALD_AXE = registerItem("emeraldaxe",
            new AxeItem(ModToolMaterials.EMERALD, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.EMERALD, 6f, -3f))));
    public static final Item EMERALD_PICKAXE = registerItem("emeraldpickaxe",
            new PickaxeItem(ModToolMaterials.EMERALD, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.EMERALD, 1, -2.8f))));
    public static final Item EMERALD_SHOVEL = registerItem("emeraldshovel",
            new ShovelItem(ModToolMaterials.EMERALD, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.EMERALD, 1.25f, -2.75f))));
    public static final Item EMERALD_HOE = registerItem("emeraldhoe",
            new HoeItem(ModToolMaterials.EMERALD, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.EMERALD, -2, -1f))));
    public static final Item AMETHYST_HELMET = registerItem("amethysthelmet",
            new ModArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(17))));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethystchestplate",
            new ModArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(17))));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethystleggings",
            new ModArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(17))));
    public static final Item AMETHYST_BOOTS = registerItem("amethystboots",
            new ModArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(17))));
    public static final Item AMETHYST_SWORD = registerItem("amethystsword",
            new SwordItem(ModToolMaterials.AMETHYST,new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AMETHYST, 3, -2.4f))));
    public static final Item AMETHYST_AXE = registerItem("amethystaxe",
            new AxeItem(ModToolMaterials.AMETHYST, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AMETHYST, 6f, -3f))));
    public static final Item AMETHYST_PICKAXE = registerItem("amethystpickaxe",
            new PickaxeItem(ModToolMaterials.AMETHYST, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AMETHYST, 1, -2.8f))));
    public static final Item AMETHYST_SHOVEL = registerItem("amethystshovel",
            new ShovelItem(ModToolMaterials.AMETHYST, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AMETHYST, 1.5f, -2.75f))));
    public static final Item AMETHYST_HOE = registerItem("amethysthoe",
            new HoeItem(ModToolMaterials.AMETHYST, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AMETHYST, -2, -1f))));
    public static final Item COPPER_HELMET = registerItem("copperhelmet",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(12))));
    public static final Item COPPER_CHESTPLATE = registerItem("copperchestplate",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(12))));
    public static final Item COPPER_LEGGINGS = registerItem("copperleggings",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(12))));
    public static final Item COPPER_BOOTS = registerItem("copperboots",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(12))));
    public static final Item COPPER_SWORD = registerItem("coppersword",
            new SwordItem(ModToolMaterials.COPPER,new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.COPPER, 3, -2.5f))));
    public static final Item COPPER_AXE = registerItem("copperaxe",
            new AxeItem(ModToolMaterials.COPPER, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.COPPER, 5f, -3.25f))));
    public static final Item COPPER_PICKAXE = registerItem("copperpickaxe",
            new PickaxeItem(ModToolMaterials.COPPER, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER, 1, -2.8f))));
    public static final Item COPPER_SHOVEL = registerItem("coppershovel",
            new ShovelItem(ModToolMaterials.COPPER, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.COPPER, 1.25f, -2.5f))));
    public static final Item COPPER_HOE = registerItem("copperhoe",
            new HoeItem(ModToolMaterials.COPPER, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.COPPER, -2, -1f))));
    public static final Item COPPER_SHIELD = registerItem("coppershield",
            new ShieldItem(new Item.Settings().maxDamage(200)));
    public static final Item AMETHYST_SHIELD = registerItem("amethystshield",
            new ShieldItem(new Item.Settings().maxDamage(350)));
    public static final Item EMERALD_SHIELD = registerItem("emeraldshield",
            new ShieldItem(new Item.Settings().maxDamage(1400)));
    public static final Item ECHO_SHIELD = registerItem("echoshield",
            new ShieldItem(new Item.Settings().maxDamage(2000)));
    public static final Item OPAL_SHIELD = registerItem("opalshield",
            new ShieldItem(new Item.Settings().maxDamage(2031).rarity(Rarity.UNCOMMON)));
    public static final Item TOPAZ_SHIELD = registerItem("topazshield",
            new ShieldItem(new Item.Settings().maxDamage(2031).rarity(Rarity.UNCOMMON)));
    public static final Item RUBY_SHIELD = registerItem("rubyshield",
            new ShieldItem(new Item.Settings().maxDamage(2031).rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item SAPPHIRE_SHIELD = registerItem("sapphireshield",
            new ShieldItem(new Item.Settings().maxDamage(2031).rarity(Rarity.UNCOMMON)));
    public static final Item HYPHITE_SHIELD = registerItem("hyphiteshield",
            new ShieldItem(new Item.Settings().maxDamage(3000)));
    public static final Item PHENON_SHIELD = registerItem("phenonshield",
            new ShieldItem(new Item.Settings().maxDamage(3500).fireproof()));
    public static final Item ENDIUM_SHIELD = registerItem("endiumshield",
            new ShieldItem(new Item.Settings().maxDamage(4000).rarity(Rarity.RARE).fireproof()));
    public static final Item MYTHRIL_SHIELD = registerItem("mythrilshield",
            new ShieldItem(new Item.Settings().maxDamage(6000).rarity(Rarity.RARE).fireproof()));
    public static final Item REINFORCED_TRIPHITE_SHIELD = registerItem("reinforcedtriphiteshield",
            new ShieldItem(new Item.Settings().maxDamage(8000).rarity(Rarity.RARE).fireproof()));
    public static final Item TITANIUM_SHIELD = registerItem("titaniumshield",
            new ShieldItem(new Item.Settings().maxDamage(10000).rarity(Rarity.EPIC).fireproof()));
    public static final Item PHYSICSIUM_SHIELD = registerItem("physicsiumshield",
            new ShieldItem(new Item.Settings().maxDamage(100000).rarity(Rarity.EPIC).fireproof()));
    public static final Item PHYSICSIUM_ELYTRA_CHESTPLATE = registerItem("physicsiumelytrachestplate",
            new PhysicsiumElytraChestplateItem(ModArmorMaterials.PHYSICSIUM, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.EPIC).fireproof().maxDamage(100000)));
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
            new SpawnEggItem(ModEntities.SHRIKE, 0x999999, 0x00b4ff, new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MoreGear.MOD_ID, name), item);
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
