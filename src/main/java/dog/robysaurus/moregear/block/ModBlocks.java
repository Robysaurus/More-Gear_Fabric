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
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).instrument(Instrument.IRON_XYLOPHONE).requiresTool().strength(40f,1000f).sounds(BlockSoundGroup.METAL).slipperiness(0.999f)), Rarity.RARE, true);
    public static final Block TITANIUM_ORE = registerBlock("titaniumore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).requiresTool().strength(30f,750f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(20,20)), Rarity.UNCOMMON, true);
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
