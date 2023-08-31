package dog.robysaurus.moregear.block;

import dog.robysaurus.moregear.MoreGear;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block TITANIUM_BLOCK = registerBlock("titaniumblock",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).instrument(Instrument.IRON_XYLOPHONE).requiresTool().strength(40f,1500f).sounds(BlockSoundGroup.METAL).slipperiness(0.999f)), Rarity.RARE, true);
    public static final Block TITANIUM_ORE = registerBlock("titaniumore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).requiresTool().strength(30f,1000f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(20,20)), Rarity.UNCOMMON, true);
    public static final Block TOPAZ_BLOCK = registerBlock("topazblock",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(30f,900f).sounds(BlockSoundGroup.METAL)), Rarity.COMMON, false);
    public static final Block TOPAZ_ORE = registerBlock("topazore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).requiresTool().strength(20f,750f), UniformIntProvider.create(5,10)), Rarity.COMMON, false);
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphireblock",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(30f,900f).sounds(BlockSoundGroup.METAL)), Rarity.COMMON, false);
    public static final Block SAPPHIRE_ORE = registerBlock("sapphireore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).requiresTool().strength(20f,750f), UniformIntProvider.create(5,10)), Rarity.COMMON, false);
    public static final Block RUBY_BLOCK = registerBlock("rubyblock",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(30f,900f).sounds(BlockSoundGroup.METAL)), Rarity.COMMON, true);
    public static final Block RUBY_ORE = registerBlock("rubyore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).requiresTool().strength(20f,750f), UniformIntProvider.create(5,10)), Rarity.COMMON, true);
    public static final Block OPAL_BLOCK = registerBlock("opalblock",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(30f,900f).sounds(BlockSoundGroup.METAL)), Rarity.COMMON, false);
    public static final Block OPAL_ORE = registerBlock("opalore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool().strength(20f,750f), UniformIntProvider.create(5,10)), Rarity.COMMON, false);
    private static Block registerBlock(String name, Block block, Rarity rarity, boolean fireproof){
        registerBlockItem(name, block, rarity, fireproof);
        return Registry.register(Registries.BLOCK, new Identifier(MoreGear.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, Rarity rarity, boolean fireproof){
        if(fireproof){
            return Registry.register(Registries.ITEM, new Identifier(MoreGear.MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings().rarity(rarity).fireproof()));
        }else{
            return Registry.register(Registries.ITEM, new Identifier(MoreGear.MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings().rarity(rarity)));
        }
    }
    public static void registerModBlocks(){
        MoreGear.LOGGER.info("Registering Mod Blocks for "+MoreGear.MOD_ID);
    }
}
