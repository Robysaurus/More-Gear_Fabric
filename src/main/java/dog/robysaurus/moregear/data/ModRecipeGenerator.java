package dog.robysaurus.moregear.data;

import com.google.common.collect.ImmutableList;
import dog.robysaurus.moregear.block.ModBlocks;
import dog.robysaurus.moregear.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generate(RecipeExporter exporter) {
        //Tool Crafting Recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_SWORD).input('#', Items.STICK).input('X', Items.COPPER_INGOT).pattern("X").pattern("X").pattern("#").criterion("has_copper_ingot", VanillaRecipeProvider.conditionsFromItem(Items.COPPER_INGOT)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_AXE).input('#', Items.STICK).input('X', Items.COPPER_INGOT).pattern("XX").pattern("X#").pattern(" #").criterion("has_copper_ingot", VanillaRecipeProvider.conditionsFromItem(Items.COPPER_INGOT)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE).input('#', Items.STICK).input('X', Items.COPPER_INGOT).pattern("XXX").pattern(" # ").pattern(" # ").criterion("has_copper_ingot", VanillaRecipeProvider.conditionsFromItem(Items.COPPER_INGOT)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL).input('#', Items.STICK).input('X', Items.COPPER_INGOT).pattern("X").pattern("#").pattern("#").criterion("has_copper_ingot", VanillaRecipeProvider.conditionsFromItem(Items.COPPER_INGOT)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HOE).input('#', Items.STICK).input('X', Items.COPPER_INGOT).pattern("XX").pattern(" #").pattern(" #").criterion("has_copper_ingot", VanillaRecipeProvider.conditionsFromItem(Items.COPPER_INGOT)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_SWORD).input('#', Items.STICK).input('X', Items.AMETHYST_SHARD).pattern("X").pattern("X").pattern("#").criterion("has_amethyst_shard", VanillaRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_AXE).input('#', Items.STICK).input('X', Items.AMETHYST_SHARD).pattern("XX").pattern("X#").pattern(" #").criterion("has_amethyst_shard", VanillaRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_PICKAXE).input('#', Items.STICK).input('X', Items.AMETHYST_SHARD).pattern("XXX").pattern(" # ").pattern(" # ").criterion("has_amethyst_shard", VanillaRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_SHOVEL).input('#', Items.STICK).input('X', Items.AMETHYST_SHARD).pattern("X").pattern("#").pattern("#").criterion("has_amethyst_shard", VanillaRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_HOE).input('#', Items.STICK).input('X', Items.AMETHYST_SHARD).pattern("XX").pattern(" #").pattern(" #").criterion("has_amethyst_shard", VanillaRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_SWORD).input('#', Items.STICK).input('X', Items.EMERALD).pattern("X").pattern("X").pattern("#").criterion("has_emerald", VanillaRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_AXE).input('#', Items.STICK).input('X', Items.EMERALD).pattern("XX").pattern("X#").pattern(" #").criterion("has_emerald", VanillaRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_PICKAXE).input('#', Items.STICK).input('X', Items.EMERALD).pattern("XXX").pattern(" # ").pattern(" # ").criterion("has_emerald", VanillaRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_SHOVEL).input('#', Items.STICK).input('X', Items.EMERALD).pattern("X").pattern("#").pattern("#").criterion("has_emerald", VanillaRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_HOE).input('#', Items.STICK).input('X', Items.EMERALD).pattern("XX").pattern(" #").pattern(" #").criterion("has_emerald", VanillaRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ECHO_SWORD).input('#', Items.STICK).input('X', Items.ECHO_SHARD).pattern("X").pattern("X").pattern("#").criterion("has_echo_shard", VanillaRecipeProvider.conditionsFromItem(Items.ECHO_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ECHO_AXE).input('#', Items.STICK).input('X', Items.ECHO_SHARD).pattern("XX").pattern("X#").pattern(" #").criterion("has_echo_shard", VanillaRecipeProvider.conditionsFromItem(Items.ECHO_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ECHO_PICKAXE).input('#', Items.STICK).input('X', Items.ECHO_SHARD).pattern("XXX").pattern(" # ").pattern(" # ").criterion("has_echo_shard", VanillaRecipeProvider.conditionsFromItem(Items.ECHO_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ECHO_SHOVEL).input('#', Items.STICK).input('X', Items.ECHO_SHARD).pattern("X").pattern("#").pattern("#").criterion("has_echo_shard", VanillaRecipeProvider.conditionsFromItem(Items.ECHO_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ECHO_HOE).input('#', Items.STICK).input('X', Items.ECHO_SHARD).pattern("XX").pattern(" #").pattern(" #").criterion("has_echo_shard", VanillaRecipeProvider.conditionsFromItem(Items.ECHO_SHARD)).offerTo(exporter);
        //Armor Crafting Recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_HELMET).input('X', Items.COPPER_INGOT).pattern("XXX").pattern("X X").criterion("has_copper_ingot", VanillaRecipeProvider.conditionsFromItem(Items.COPPER_INGOT)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE).input('X', Items.COPPER_INGOT).pattern("X X").pattern("XXX").pattern("XXX").criterion("has_copper_ingot", VanillaRecipeProvider.conditionsFromItem(Items.COPPER_INGOT)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS).input('X', Items.COPPER_INGOT).pattern("XXX").pattern("X X").pattern("X X").criterion("has_copper_ingot", VanillaRecipeProvider.conditionsFromItem(Items.COPPER_INGOT)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS).input('X', Items.COPPER_INGOT).pattern("X X").pattern("X X").criterion("has_copper_ingot", VanillaRecipeProvider.conditionsFromItem(Items.COPPER_INGOT)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_HELMET).input('X', Items.AMETHYST_SHARD).pattern("XXX").pattern("X X").criterion("has_amethyst_shard", VanillaRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_CHESTPLATE).input('X', Items.AMETHYST_SHARD).pattern("X X").pattern("XXX").pattern("XXX").criterion("has_amethyst_shard", VanillaRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_LEGGINGS).input('X', Items.AMETHYST_SHARD).pattern("XXX").pattern("X X").pattern("X X").criterion("has_amethyst_shard", VanillaRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_BOOTS).input('X', Items.AMETHYST_SHARD).pattern("X X").pattern("X X").criterion("has_amethyst_shard", VanillaRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ECHO_HELMET).input('X', Items.ECHO_SHARD).pattern("XXX").pattern("X X").criterion("has_echo_shard", VanillaRecipeProvider.conditionsFromItem(Items.ECHO_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ECHO_CHESTPLATE).input('X', Items.ECHO_SHARD).pattern("X X").pattern("XXX").pattern("XXX").criterion("has_echo_shard", VanillaRecipeProvider.conditionsFromItem(Items.ECHO_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ECHO_LEGGINGS).input('X', Items.ECHO_SHARD).pattern("XXX").pattern("X X").pattern("X X").criterion("has_echo_shard", VanillaRecipeProvider.conditionsFromItem(Items.ECHO_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ECHO_BOOTS).input('X', Items.ECHO_SHARD).pattern("X X").pattern("X X").criterion("has_echo_shard", VanillaRecipeProvider.conditionsFromItem(Items.ECHO_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_HELMET).input('X', Items.EMERALD).pattern("XXX").pattern("X X").criterion("has_emerald", VanillaRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_CHESTPLATE).input('X', Items.EMERALD).pattern("X X").pattern("XXX").pattern("XXX").criterion("has_emerald", VanillaRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_LEGGINGS).input('X', Items.EMERALD).pattern("XXX").pattern("X X").pattern("X X").criterion("has_emerald", VanillaRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_BOOTS).input('X', Items.EMERALD).pattern("X X").pattern("X X").criterion("has_emerald", VanillaRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter);
        //Shield Recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_SHIELD).input('W', ItemTags.PLANKS).input('o', Items.COPPER_INGOT).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_copper_ingot", VanillaRecipeProvider.conditionsFromItem(Items.COPPER_INGOT)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_SHIELD).input('W', ItemTags.PLANKS).input('o', Items.AMETHYST_SHARD).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_amethyst", VanillaRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_SHIELD).input('W', ItemTags.PLANKS).input('o', Items.EMERALD).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_emerald", VanillaRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ECHO_SHIELD).input('W', ItemTags.PLANKS).input('o', Items.ECHO_SHARD).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_echo", VanillaRecipeProvider.conditionsFromItem(Items.ECHO_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.HYPHITE_SHIELD).input('W', ItemTags.PLANKS).input('o', ModItems.HYPHITE).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_hyphite", VanillaRecipeProvider.conditionsFromItem(ModItems.HYPHITE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OPAL_SHIELD).input('W', ItemTags.PLANKS).input('o', ModItems.OPAL).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_opal", VanillaRecipeProvider.conditionsFromItem(ModItems.OPAL)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TOPAZ_SHIELD).input('W', ItemTags.PLANKS).input('o', ModItems.TOPAZ).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_topaz", VanillaRecipeProvider.conditionsFromItem(ModItems.TOPAZ)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_SHIELD).input('W', ItemTags.PLANKS).input('o', ModItems.RUBY).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_ruby", VanillaRecipeProvider.conditionsFromItem(ModItems.RUBY)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SAPPHIRE_SHIELD).input('W', ItemTags.PLANKS).input('o', ModItems.SAPPHIRE).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_sapphire", VanillaRecipeProvider.conditionsFromItem(ModItems.SAPPHIRE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PHENON_SHIELD).input('W', ItemTags.PLANKS).input('o', ModItems.PHENON).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_phenon", VanillaRecipeProvider.conditionsFromItem(ModItems.PHENON)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ENDIUM_SHIELD).input('W', ItemTags.PLANKS).input('o', ModItems.ENDIUM).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_endium", VanillaRecipeProvider.conditionsFromItem(ModItems.ENDIUM)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MYTHRIL_SHIELD).input('W', ItemTags.PLANKS).input('o', ModItems.MYTHRIL).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_mythril", VanillaRecipeProvider.conditionsFromItem(ModItems.MYTHRIL)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.REINFORCED_TRIPHITE_SHIELD).input('W', ItemTags.PLANKS).input('o', ModItems.REINFORCED_TRIPHITE).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_reinforced_triphite", VanillaRecipeProvider.conditionsFromItem(ModItems.REINFORCED_TRIPHITE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TITANIUM_SHIELD).input('W', ItemTags.PLANKS).input('o', ModItems.TITANIUM).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_titanium", VanillaRecipeProvider.conditionsFromItem(ModItems.TITANIUM)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PHYSICSIUM_SHIELD).input('W', ItemTags.PLANKS).input('o', ModItems.PHYSICSIUM).pattern("WoW").pattern("WWW").pattern(" W ").criterion("has_physicsium", VanillaRecipeProvider.conditionsFromItem(ModItems.PHYSICSIUM)).offerTo(exporter);
        //Refined/Ingot Ore Recipes
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PHENON).input(ModItems.PHENON_SCRAP, 4).input(Items.DIAMOND, 4).group("phenon").criterion("has_phenonscrap", VanillaRecipeProvider.conditionsFromItem(ModItems.PHENON_SCRAP)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDIUM).input(ModItems.ENDIUM_SCRAP, 4).input(Items.NETHERITE_SCRAP, 4).group("endium").criterion("has_endiumscrap", VanillaRecipeProvider.conditionsFromItem(ModItems.ENDIUM_SCRAP)).offerTo(exporter);
        //Raw Ore Smelting Recipes
        offerSmelting(exporter, ImmutableList.of(ModItems.UNREFINED_HYPHITE), RecipeCategory.MISC, ModItems.HYPHITE, 1.5f, 200, "hyphite");
        offerSmelting(exporter, ImmutableList.of(ModItems.RAW_OPAL), RecipeCategory.MISC, ModItems.OPAL, 1.5f, 200, "opal");
        offerSmelting(exporter, ImmutableList.of(ModItems.RAW_TOPAZ), RecipeCategory.MISC, ModItems.TOPAZ, 1.f, 200, "topaz");
        offerSmelting(exporter, ImmutableList.of(ModItems.RAW_RUBY), RecipeCategory.MISC, ModItems.RUBY, 1.5f, 200, "ruby");
        offerSmelting(exporter, ImmutableList.of(ModItems.RAW_SAPPHIRE), RecipeCategory.MISC, ModItems.SAPPHIRE, 1.5f, 200, "sapphire");
        offerSmelting(exporter, ImmutableList.of(ModItems.RAW_MYTHRIL), RecipeCategory.MISC, ModItems.MYTHRIL, 2.25f, 200, "mythril");
        offerSmelting(exporter, ImmutableList.of(ModItems.RAW_TRIPHITE), RecipeCategory.MISC, ModItems.REINFORCED_TRIPHITE, 2.75f, 200, "reinforced_triphite");
        offerSmelting(exporter, ImmutableList.of(ModItems.RAW_TITANIUM), RecipeCategory.MISC, ModItems.TITANIUM, 3.5f, 200, "titanium");
        //Ore Extraction Recipes
        offerSmelting(exporter, ImmutableList.of(ModBlocks.HYPHITE_ORE), RecipeCategory.MISC, ModItems.HYPHITE, 1.5f, 200, "hyphite");
        offerSmelting(exporter, ImmutableList.of(ModBlocks.OPAL_ORE), RecipeCategory.MISC, ModItems.OPAL, 1.5f, 200, "opal");
        offerSmelting(exporter, ImmutableList.of(ModBlocks.TOPAZ_ORE), RecipeCategory.MISC, ModItems.TOPAZ, 1.f, 200, "topaz");
        offerSmelting(exporter, ImmutableList.of(ModBlocks.RUBY_ORE), RecipeCategory.MISC, ModItems.RUBY, 1.5f, 200, "ruby");
        offerSmelting(exporter, ImmutableList.of(ModBlocks.SAPPHIRE_ORE), RecipeCategory.MISC, ModItems.SAPPHIRE, 1.5f, 200, "sapphire");
        offerSmelting(exporter, ImmutableList.of(ModBlocks.UNREFINED_PHENON_BLOCK), RecipeCategory.MISC, ModItems.PHENON_SCRAP, 1.75f, 200, "phenon");
        offerSmelting(exporter, ImmutableList.of(ModBlocks.ANCIENT_ENDIUM), RecipeCategory.MISC, ModItems.ENDIUM_SCRAP, 2f, 200, "endium");
        offerSmelting(exporter, ImmutableList.of(ModBlocks.MYTHRIL_ORE), RecipeCategory.MISC, ModItems.MYTHRIL, 2.25f, 200, "mythril");
        offerSmelting(exporter, ImmutableList.of(ModBlocks.TRIPHITE_ORE), RecipeCategory.MISC, ModItems.REINFORCED_TRIPHITE, 2.75f, 200, "reinforced_triphite");
        offerSmelting(exporter, ImmutableList.of(ModBlocks.TITANIUM_ORE), RecipeCategory.MISC, ModItems.TITANIUM, 3.5f, 200, "titanium");
        offerSmelting(exporter, ImmutableList.of(ModBlocks.PHYSICSIUM_ORE), RecipeCategory.MISC, ModItems.PHYSICSIUM_NUGGET, 5f, 200, "physicsium");
        offerBlasting(exporter, ImmutableList.of(ModBlocks.HYPHITE_ORE), RecipeCategory.MISC, ModItems.HYPHITE, 1.5f, 100, "hyphite");
        offerBlasting(exporter, ImmutableList.of(ModBlocks.OPAL_ORE), RecipeCategory.MISC, ModItems.OPAL, 1.5f, 100, "opal");
        offerBlasting(exporter, ImmutableList.of(ModBlocks.TOPAZ_ORE), RecipeCategory.MISC, ModItems.TOPAZ, 1.f, 100, "topaz");
        offerBlasting(exporter, ImmutableList.of(ModBlocks.RUBY_ORE), RecipeCategory.MISC, ModItems.RUBY, 1.5f, 100, "ruby");
        offerBlasting(exporter, ImmutableList.of(ModBlocks.SAPPHIRE_ORE), RecipeCategory.MISC, ModItems.SAPPHIRE, 1.5f, 100, "sapphire");
        offerBlasting(exporter, ImmutableList.of(ModBlocks.UNREFINED_PHENON_BLOCK), RecipeCategory.MISC, ModItems.PHENON_SCRAP, 1.75f, 100, "phenon");
        offerBlasting(exporter, ImmutableList.of(ModBlocks.ANCIENT_ENDIUM), RecipeCategory.MISC, ModItems.ENDIUM_SCRAP, 2f, 100, "endium");
        offerBlasting(exporter, ImmutableList.of(ModBlocks.MYTHRIL_ORE), RecipeCategory.MISC, ModItems.MYTHRIL, 2.25f, 100, "mythril");
        offerBlasting(exporter, ImmutableList.of(ModBlocks.TRIPHITE_ORE), RecipeCategory.MISC, ModItems.REINFORCED_TRIPHITE, 2.75f, 100, "reinforced_triphite");
        offerBlasting(exporter, ImmutableList.of(ModBlocks.TITANIUM_ORE), RecipeCategory.MISC, ModItems.TITANIUM, 3.5f, 100, "titanium");
        offerBlasting(exporter, ImmutableList.of(ModBlocks.PHYSICSIUM_ORE), RecipeCategory.MISC, ModItems.PHYSICSIUM_NUGGET, 5f, 100, "physicsium");
        //Ore Block Recipes
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PHYSICSIUM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PHYSICSIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TITANIUM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.REINFORCED_TRIPHITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.REINFORCED_TRIPHITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.MYTHRIL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MYTHRIL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ENDIUM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDIUM_BLOCK, "endium_compacting", null, "endium_decompacting", null);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PHENON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PHENON_BLOCK, "phenon_compacting", null, "phenon_decompacting", null);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SAPPHIRE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RUBY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TOPAZ, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOPAZ_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.OPAL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.HYPHITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HYPHITE_BLOCK);
        //Template Duping Recipes
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.PHYSICSIUM_UPGRADE, ModBlocks.PHYSICSIUM_ORE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.TITANIUM_UPGRADE, ModBlocks.TITANIUM_ORE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.REINFORCED_TRIPHITE_UPGRADE, ModBlocks.TRIPHITE_ORE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.MYTHRIL_UPGRADE, ModBlocks.MYTHRIL_ORE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.ENDIUM_UPGRADE, ModBlocks.ANCIENT_ENDIUM);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.PHENON_UPGRADE, ModBlocks.UNREFINED_PHENON_BLOCK);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.SAPPHIRE_UPGRADE, ModBlocks.SAPPHIRE_ORE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.RUBY_UPGRADE, ModBlocks.RUBY_ORE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.TOPAZ_UPGRADE, ModBlocks.TOPAZ_ORE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.OPAL_UPGRADE, ModBlocks.OPAL_ORE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.HYPHITE_UPGRADE, ModBlocks.HYPHITE_ORE);
        //Upgrade Recipes
        offerUpgradeRecipe(exporter, ModItems.ELYTRA_CHESTPLATE_UPGRADE, ModItems.PHYSICSIUM_CHESTPLATE, Items.ELYTRA, ModItems.PHYSICSIUM_ELYTRA_CHESTPLATE, "elytra_chestplate");
        offerUpgradeRecipe(exporter, ModItems.PHYSICSIUM_UPGRADE, ModItems.TITANIUM_HELMET, ModItems.PHYSICSIUM, ModItems.PHYSICSIUM_HELMET, "physicsium");
        offerUpgradeRecipe(exporter, ModItems.PHYSICSIUM_UPGRADE, ModItems.TITANIUM_CHESTPLATE, ModItems.PHYSICSIUM, ModItems.PHYSICSIUM_CHESTPLATE, "physicsium");
        offerUpgradeRecipe(exporter, ModItems.PHYSICSIUM_UPGRADE, ModItems.TITANIUM_LEGGINGS, ModItems.PHYSICSIUM, ModItems.PHYSICSIUM_LEGGINGS, "physicsium");
        offerUpgradeRecipe(exporter, ModItems.PHYSICSIUM_UPGRADE, ModItems.TITANIUM_BOOTS, ModItems.PHYSICSIUM, ModItems.PHYSICSIUM_BOOTS, "physicsium");
        offerUpgradeRecipe(exporter, ModItems.PHYSICSIUM_UPGRADE, ModItems.TITANIUM_SWORD, ModItems.PHYSICSIUM, ModItems.PHYSICSIUM_SWORD, "physicsium");
        offerUpgradeRecipe(exporter, ModItems.PHYSICSIUM_UPGRADE, ModItems.TITANIUM_AXE, ModItems.PHYSICSIUM, ModItems.PHYSICSIUM_AXE, "physicsium");
        offerUpgradeRecipe(exporter, ModItems.PHYSICSIUM_UPGRADE, ModItems.TITANIUM_PICKAXE, ModItems.PHYSICSIUM, ModItems.PHYSICSIUM_PICKAXE, "physicsium");
        offerUpgradeRecipe(exporter, ModItems.PHYSICSIUM_UPGRADE, ModItems.TITANIUM_SHOVEL, ModItems.PHYSICSIUM, ModItems.PHYSICSIUM_SHOVEL, "physicsium");
        offerUpgradeRecipe(exporter, ModItems.PHYSICSIUM_UPGRADE, ModItems.TITANIUM_HOE, ModItems.PHYSICSIUM, ModItems.PHYSICSIUM_HOE, "physicsium");
        offerUpgradeRecipe(exporter, ModItems.TITANIUM_UPGRADE, ModItems.REINFORCED_TRIPHITE_HELMET, ModItems.TITANIUM, ModItems.TITANIUM_HELMET, "titanium");
        offerUpgradeRecipe(exporter, ModItems.TITANIUM_UPGRADE, ModItems.REINFORCED_TRIPHITE_CHESTPLATE, ModItems.TITANIUM, ModItems.TITANIUM_CHESTPLATE, "titanium");
        offerUpgradeRecipe(exporter, ModItems.TITANIUM_UPGRADE, ModItems.REINFORCED_TRIPHITE_LEGGINGS, ModItems.TITANIUM, ModItems.TITANIUM_LEGGINGS, "titanium");
        offerUpgradeRecipe(exporter, ModItems.TITANIUM_UPGRADE, ModItems.REINFORCED_TRIPHITE_BOOTS, ModItems.TITANIUM, ModItems.TITANIUM_BOOTS, "titanium");
        offerUpgradeRecipe(exporter, ModItems.TITANIUM_UPGRADE, ModItems.REINFORCED_TRIPHITE_SWORD, ModItems.TITANIUM, ModItems.TITANIUM_SWORD, "titanium");
        offerUpgradeRecipe(exporter, ModItems.TITANIUM_UPGRADE, ModItems.REINFORCED_TRIPHITE_AXE, ModItems.TITANIUM, ModItems.TITANIUM_AXE, "titanium");
        offerUpgradeRecipe(exporter, ModItems.TITANIUM_UPGRADE, ModItems.REINFORCED_TRIPHITE_PICKAXE, ModItems.TITANIUM, ModItems.TITANIUM_PICKAXE, "titanium");
        offerUpgradeRecipe(exporter, ModItems.TITANIUM_UPGRADE, ModItems.REINFORCED_TRIPHITE_SHOVEL, ModItems.TITANIUM, ModItems.TITANIUM_SHOVEL, "titanium");
        offerUpgradeRecipe(exporter, ModItems.TITANIUM_UPGRADE, ModItems.REINFORCED_TRIPHITE_HOE, ModItems.TITANIUM, ModItems.TITANIUM_HOE, "titanium");
        offerUpgradeRecipe(exporter, ModItems.REINFORCED_TRIPHITE_UPGRADE, ModItems.MYTHRIL_HELMET, ModItems.REINFORCED_TRIPHITE, ModItems.REINFORCED_TRIPHITE_HELMET, "reinforcedtriphite");
        offerUpgradeRecipe(exporter, ModItems.REINFORCED_TRIPHITE_UPGRADE, ModItems.MYTHRIL_CHESTPLATE, ModItems.REINFORCED_TRIPHITE, ModItems.REINFORCED_TRIPHITE_CHESTPLATE, "reinforcedtriphite");
        offerUpgradeRecipe(exporter, ModItems.REINFORCED_TRIPHITE_UPGRADE, ModItems.MYTHRIL_LEGGINGS, ModItems.REINFORCED_TRIPHITE, ModItems.REINFORCED_TRIPHITE_LEGGINGS, "reinforcedtriphite");
        offerUpgradeRecipe(exporter, ModItems.REINFORCED_TRIPHITE_UPGRADE, ModItems.MYTHRIL_BOOTS, ModItems.REINFORCED_TRIPHITE, ModItems.REINFORCED_TRIPHITE_BOOTS, "reinforcedtriphite");
        offerUpgradeRecipe(exporter, ModItems.REINFORCED_TRIPHITE_UPGRADE, ModItems.MYTHRIL_SWORD, ModItems.REINFORCED_TRIPHITE, ModItems.REINFORCED_TRIPHITE_SWORD, "reinforcedtriphite");
        offerUpgradeRecipe(exporter, ModItems.REINFORCED_TRIPHITE_UPGRADE, ModItems.MYTHRIL_AXE, ModItems.REINFORCED_TRIPHITE, ModItems.REINFORCED_TRIPHITE_AXE, "reinforcedtriphite");
        offerUpgradeRecipe(exporter, ModItems.REINFORCED_TRIPHITE_UPGRADE, ModItems.MYTHRIL_PICKAXE, ModItems.REINFORCED_TRIPHITE, ModItems.REINFORCED_TRIPHITE_PICKAXE, "reinforcedtriphite");
        offerUpgradeRecipe(exporter, ModItems.REINFORCED_TRIPHITE_UPGRADE, ModItems.MYTHRIL_SHOVEL, ModItems.REINFORCED_TRIPHITE, ModItems.REINFORCED_TRIPHITE_SHOVEL, "reinforcedtriphite");
        offerUpgradeRecipe(exporter, ModItems.REINFORCED_TRIPHITE_UPGRADE, ModItems.MYTHRIL_HOE, ModItems.REINFORCED_TRIPHITE, ModItems.REINFORCED_TRIPHITE_HOE, "reinforcedtriphite");
        offerUpgradeRecipe(exporter, ModItems.MYTHRIL_UPGRADE, ModItems.ENDIUM_HELMET, ModItems.MYTHRIL, ModItems.MYTHRIL_HELMET, "mythril");
        offerUpgradeRecipe(exporter, ModItems.MYTHRIL_UPGRADE, ModItems.ENDIUM_CHESTPLATE, ModItems.MYTHRIL, ModItems.MYTHRIL_CHESTPLATE, "mythril");
        offerUpgradeRecipe(exporter, ModItems.MYTHRIL_UPGRADE, ModItems.ENDIUM_LEGGINGS, ModItems.MYTHRIL, ModItems.MYTHRIL_LEGGINGS, "mythril");
        offerUpgradeRecipe(exporter, ModItems.MYTHRIL_UPGRADE, ModItems.ENDIUM_BOOTS, ModItems.MYTHRIL, ModItems.MYTHRIL_BOOTS, "mythril");
        offerUpgradeRecipe(exporter, ModItems.MYTHRIL_UPGRADE, ModItems.ENDIUM_SWORD, ModItems.MYTHRIL, ModItems.MYTHRIL_SWORD, "mythril");
        offerUpgradeRecipe(exporter, ModItems.MYTHRIL_UPGRADE, ModItems.ENDIUM_AXE, ModItems.MYTHRIL, ModItems.MYTHRIL_AXE, "mythril");
        offerUpgradeRecipe(exporter, ModItems.MYTHRIL_UPGRADE, ModItems.ENDIUM_PICKAXE, ModItems.MYTHRIL, ModItems.MYTHRIL_PICKAXE, "mythril");
        offerUpgradeRecipe(exporter, ModItems.MYTHRIL_UPGRADE, ModItems.ENDIUM_SHOVEL, ModItems.MYTHRIL, ModItems.MYTHRIL_SHOVEL, "mythril");
        offerUpgradeRecipe(exporter, ModItems.MYTHRIL_UPGRADE, ModItems.ENDIUM_HOE, ModItems.MYTHRIL, ModItems.MYTHRIL_HOE, "mythril");
        offerUpgradeRecipe(exporter, ModItems.ENDIUM_UPGRADE, ModItems.PHENON_HELMET, ModItems.ENDIUM, ModItems.ENDIUM_HELMET, "endium");
        offerUpgradeRecipe(exporter, ModItems.ENDIUM_UPGRADE, ModItems.PHENON_CHESTPLATE, ModItems.ENDIUM, ModItems.ENDIUM_CHESTPLATE, "endium");
        offerUpgradeRecipe(exporter, ModItems.ENDIUM_UPGRADE, ModItems.PHENON_LEGGINGS, ModItems.ENDIUM, ModItems.ENDIUM_LEGGINGS, "endium");
        offerUpgradeRecipe(exporter, ModItems.ENDIUM_UPGRADE, ModItems.PHENON_BOOTS, ModItems.ENDIUM, ModItems.ENDIUM_BOOTS, "endium");
        offerUpgradeRecipe(exporter, ModItems.ENDIUM_UPGRADE, ModItems.PHENON_SWORD, ModItems.ENDIUM, ModItems.ENDIUM_SWORD, "endium");
        offerUpgradeRecipe(exporter, ModItems.ENDIUM_UPGRADE, ModItems.PHENON_AXE, ModItems.ENDIUM, ModItems.ENDIUM_AXE, "endium");
        offerUpgradeRecipe(exporter, ModItems.ENDIUM_UPGRADE, ModItems.PHENON_PICKAXE, ModItems.ENDIUM, ModItems.ENDIUM_PICKAXE, "endium");
        offerUpgradeRecipe(exporter, ModItems.ENDIUM_UPGRADE, ModItems.PHENON_SHOVEL, ModItems.ENDIUM, ModItems.ENDIUM_SHOVEL, "endium");
        offerUpgradeRecipe(exporter, ModItems.ENDIUM_UPGRADE, ModItems.PHENON_HOE, ModItems.ENDIUM, ModItems.ENDIUM_HOE, "endium");
        offerUpgradeRecipe(exporter, ModItems.PHENON_UPGRADE, ModItems.HYPHITE_HELMET, ModItems.PHENON, ModItems.PHENON_HELMET, "phenon");
        offerUpgradeRecipe(exporter, ModItems.PHENON_UPGRADE, ModItems.HYPHITE_CHESTPLATE, ModItems.PHENON, ModItems.PHENON_CHESTPLATE, "phenon");
        offerUpgradeRecipe(exporter, ModItems.PHENON_UPGRADE, ModItems.HYPHITE_LEGGINGS, ModItems.PHENON, ModItems.PHENON_LEGGINGS, "phenon");
        offerUpgradeRecipe(exporter, ModItems.PHENON_UPGRADE, ModItems.HYPHITE_BOOTS, ModItems.PHENON, ModItems.PHENON_BOOTS, "phenon");
        offerUpgradeRecipe(exporter, ModItems.PHENON_UPGRADE, ModItems.HYPHITE_SWORD, ModItems.PHENON, ModItems.PHENON_SWORD, "phenon");
        offerUpgradeRecipe(exporter, ModItems.PHENON_UPGRADE, ModItems.HYPHITE_AXE, ModItems.PHENON, ModItems.PHENON_AXE, "phenon");
        offerUpgradeRecipe(exporter, ModItems.PHENON_UPGRADE, ModItems.HYPHITE_PICKAXE, ModItems.PHENON, ModItems.PHENON_PICKAXE, "phenon");
        offerUpgradeRecipe(exporter, ModItems.PHENON_UPGRADE, ModItems.HYPHITE_SHOVEL, ModItems.PHENON, ModItems.PHENON_SHOVEL, "phenon");
        offerUpgradeRecipe(exporter, ModItems.PHENON_UPGRADE, ModItems.HYPHITE_HOE, ModItems.PHENON, ModItems.PHENON_HOE, "phenon");
        offerUpgradeRecipe(exporter, ModItems.SAPPHIRE_UPGRADE, Items.NETHERITE_HELMET, ModItems.SAPPHIRE, ModItems.SAPPHIRE_HELMET, "sapphire");
        offerUpgradeRecipe(exporter, ModItems.SAPPHIRE_UPGRADE, Items.NETHERITE_CHESTPLATE, ModItems.SAPPHIRE, ModItems.SAPPHIRE_CHESTPLATE, "sapphire");
        offerUpgradeRecipe(exporter, ModItems.SAPPHIRE_UPGRADE, Items.NETHERITE_LEGGINGS, ModItems.SAPPHIRE, ModItems.SAPPHIRE_LEGGINGS, "sapphire");
        offerUpgradeRecipe(exporter, ModItems.SAPPHIRE_UPGRADE, Items.NETHERITE_BOOTS, ModItems.SAPPHIRE, ModItems.SAPPHIRE_BOOTS, "sapphire");
        offerUpgradeRecipe(exporter, ModItems.SAPPHIRE_UPGRADE, Items.NETHERITE_SWORD, ModItems.SAPPHIRE, ModItems.SAPPHIRE_SWORD, "sapphire");
        offerUpgradeRecipe(exporter, ModItems.SAPPHIRE_UPGRADE, Items.NETHERITE_AXE, ModItems.SAPPHIRE, ModItems.SAPPHIRE_AXE, "sapphire");
        offerUpgradeRecipe(exporter, ModItems.SAPPHIRE_UPGRADE, Items.NETHERITE_PICKAXE, ModItems.SAPPHIRE, ModItems.SAPPHIRE_PICKAXE, "sapphire");
        offerUpgradeRecipe(exporter, ModItems.SAPPHIRE_UPGRADE, Items.NETHERITE_SHOVEL, ModItems.SAPPHIRE, ModItems.SAPPHIRE_SHOVEL, "sapphire");
        offerUpgradeRecipe(exporter, ModItems.SAPPHIRE_UPGRADE, Items.NETHERITE_HOE, ModItems.SAPPHIRE, ModItems.SAPPHIRE_HOE, "sapphire");
        offerUpgradeRecipe(exporter, ModItems.RUBY_UPGRADE, Items.NETHERITE_HELMET, ModItems.RUBY, ModItems.RUBY_HELMET, "ruby");
        offerUpgradeRecipe(exporter, ModItems.RUBY_UPGRADE, Items.NETHERITE_CHESTPLATE, ModItems.RUBY, ModItems.RUBY_CHESTPLATE, "ruby");
        offerUpgradeRecipe(exporter, ModItems.RUBY_UPGRADE, Items.NETHERITE_LEGGINGS, ModItems.RUBY, ModItems.RUBY_LEGGINGS, "ruby");
        offerUpgradeRecipe(exporter, ModItems.RUBY_UPGRADE, Items.NETHERITE_BOOTS, ModItems.RUBY, ModItems.RUBY_BOOTS, "ruby");
        offerUpgradeRecipe(exporter, ModItems.RUBY_UPGRADE, Items.NETHERITE_SWORD, ModItems.RUBY, ModItems.RUBY_SWORD, "ruby");
        offerUpgradeRecipe(exporter, ModItems.RUBY_UPGRADE, Items.NETHERITE_AXE, ModItems.RUBY, ModItems.RUBY_AXE, "ruby");
        offerUpgradeRecipe(exporter, ModItems.RUBY_UPGRADE, Items.NETHERITE_PICKAXE, ModItems.RUBY, ModItems.RUBY_PICKAXE, "ruby");
        offerUpgradeRecipe(exporter, ModItems.RUBY_UPGRADE, Items.NETHERITE_SHOVEL, ModItems.RUBY, ModItems.RUBY_SHOVEL, "ruby");
        offerUpgradeRecipe(exporter, ModItems.RUBY_UPGRADE, Items.NETHERITE_HOE, ModItems.RUBY, ModItems.RUBY_HOE, "ruby");
        offerUpgradeRecipe(exporter, ModItems.TOPAZ_UPGRADE, Items.NETHERITE_HELMET, ModItems.TOPAZ, ModItems.TOPAZ_HELMET, "topaz");
        offerUpgradeRecipe(exporter, ModItems.TOPAZ_UPGRADE, Items.NETHERITE_CHESTPLATE, ModItems.TOPAZ, ModItems.TOPAZ_CHESTPLATE, "topaz");
        offerUpgradeRecipe(exporter, ModItems.TOPAZ_UPGRADE, Items.NETHERITE_LEGGINGS, ModItems.TOPAZ, ModItems.TOPAZ_LEGGINGS, "topaz");
        offerUpgradeRecipe(exporter, ModItems.TOPAZ_UPGRADE, Items.NETHERITE_BOOTS, ModItems.TOPAZ, ModItems.TOPAZ_BOOTS, "topaz");
        offerUpgradeRecipe(exporter, ModItems.TOPAZ_UPGRADE, Items.NETHERITE_SWORD, ModItems.TOPAZ, ModItems.TOPAZ_SWORD, "topaz");
        offerUpgradeRecipe(exporter, ModItems.TOPAZ_UPGRADE, Items.NETHERITE_AXE, ModItems.TOPAZ, ModItems.TOPAZ_AXE, "topaz");
        offerUpgradeRecipe(exporter, ModItems.TOPAZ_UPGRADE, Items.NETHERITE_PICKAXE, ModItems.TOPAZ, ModItems.TOPAZ_PICKAXE, "topaz");
        offerUpgradeRecipe(exporter, ModItems.TOPAZ_UPGRADE, Items.NETHERITE_SHOVEL, ModItems.TOPAZ, ModItems.TOPAZ_SHOVEL, "topaz");
        offerUpgradeRecipe(exporter, ModItems.TOPAZ_UPGRADE, Items.NETHERITE_HOE, ModItems.TOPAZ, ModItems.TOPAZ_HOE, "topaz");
        offerUpgradeRecipe(exporter, ModItems.OPAL_UPGRADE, Items.NETHERITE_HELMET, ModItems.OPAL, ModItems.OPAL_HELMET, "opal");
        offerUpgradeRecipe(exporter, ModItems.OPAL_UPGRADE, Items.NETHERITE_CHESTPLATE, ModItems.OPAL, ModItems.OPAL_CHESTPLATE, "opal");
        offerUpgradeRecipe(exporter, ModItems.OPAL_UPGRADE, Items.NETHERITE_LEGGINGS, ModItems.OPAL, ModItems.OPAL_LEGGINGS, "opal");
        offerUpgradeRecipe(exporter, ModItems.OPAL_UPGRADE, Items.NETHERITE_BOOTS, ModItems.OPAL, ModItems.OPAL_BOOTS, "opal");
        offerUpgradeRecipe(exporter, ModItems.OPAL_UPGRADE, Items.NETHERITE_SWORD, ModItems.OPAL, ModItems.OPAL_SWORD, "opal");
        offerUpgradeRecipe(exporter, ModItems.OPAL_UPGRADE, Items.NETHERITE_AXE, ModItems.OPAL, ModItems.OPAL_AXE, "opal");
        offerUpgradeRecipe(exporter, ModItems.OPAL_UPGRADE, Items.NETHERITE_PICKAXE, ModItems.OPAL, ModItems.OPAL_PICKAXE, "opal");
        offerUpgradeRecipe(exporter, ModItems.OPAL_UPGRADE, Items.NETHERITE_SHOVEL, ModItems.OPAL, ModItems.OPAL_SHOVEL, "opal");
        offerUpgradeRecipe(exporter, ModItems.OPAL_UPGRADE, Items.NETHERITE_HOE, ModItems.OPAL, ModItems.OPAL_HOE, "opal");
        offerUpgradeRecipe(exporter, ModItems.HYPHITE_UPGRADE, Items.NETHERITE_HELMET, ModItems.HYPHITE, ModItems.HYPHITE_HELMET, "hyphite");
        offerUpgradeRecipe(exporter, ModItems.HYPHITE_UPGRADE, Items.NETHERITE_CHESTPLATE, ModItems.HYPHITE, ModItems.HYPHITE_CHESTPLATE, "hyphite");
        offerUpgradeRecipe(exporter, ModItems.HYPHITE_UPGRADE, Items.NETHERITE_LEGGINGS, ModItems.HYPHITE, ModItems.HYPHITE_LEGGINGS, "hyphite");
        offerUpgradeRecipe(exporter, ModItems.HYPHITE_UPGRADE, Items.NETHERITE_BOOTS, ModItems.HYPHITE, ModItems.HYPHITE_BOOTS, "hyphite");
        offerUpgradeRecipe(exporter, ModItems.HYPHITE_UPGRADE, Items.NETHERITE_SWORD, ModItems.HYPHITE, ModItems.HYPHITE_SWORD, "hyphite");
        offerUpgradeRecipe(exporter, ModItems.HYPHITE_UPGRADE, Items.NETHERITE_AXE, ModItems.HYPHITE, ModItems.HYPHITE_AXE, "hyphite");
        offerUpgradeRecipe(exporter, ModItems.HYPHITE_UPGRADE, Items.NETHERITE_PICKAXE, ModItems.HYPHITE, ModItems.HYPHITE_PICKAXE, "hyphite");
        offerUpgradeRecipe(exporter, ModItems.HYPHITE_UPGRADE, Items.NETHERITE_SHOVEL, ModItems.HYPHITE, ModItems.HYPHITE_SHOVEL, "hyphite");
        offerUpgradeRecipe(exporter, ModItems.HYPHITE_UPGRADE, Items.NETHERITE_HOE, ModItems.HYPHITE, ModItems.HYPHITE_HOE, "hyphite");
    }

    public static void offerUpgradeRecipe(RecipeExporter exporter, Item template, Item input, Item material, Item result, String name) {
        if(input instanceof ArmorItem){
            SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(template), Ingredient.ofItems(input), Ingredient.ofItems(material), RecipeCategory.COMBAT, result).criterion("has_"+name, RecipeProvider.conditionsFromItem(material)).offerTo(exporter, RecipeProvider.getItemPath(result) + "_smithing");
        }else{
            SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(template), Ingredient.ofItems(input), Ingredient.ofItems(material), RecipeCategory.TOOLS, result).criterion("has_"+name, RecipeProvider.conditionsFromItem(material)).offerTo(exporter, RecipeProvider.getItemPath(result) + "_smithing");
        }
    }
}
