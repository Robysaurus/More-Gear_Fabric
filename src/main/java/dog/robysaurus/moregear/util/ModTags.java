package dog.robysaurus.moregear.util;

import dog.robysaurus.moregear.MoreGear;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static TagKey<Block> NEEDS_PHYSICSIUM_TOOL = createTag("needs_physicsium_tool");
        public static TagKey<Block> INCORRECT_FOR_PHYSICSIUM_TOOL = createTag("incorrect_for_physicsium_tool");
        public static TagKey<Block> NEEDS_TITANIUM_TOOL = createTag("needs_titanium_tool");
        public static TagKey<Block> INCORRECT_FOR_TITANIUM_TOOL = createTag("incorrect_for_titanium_tool");
        public static TagKey<Block> NEEDS_REINFORCED_TRIPHITE_TOOL = createTag("needs_reinforcedtriphite_tool");
        public static TagKey<Block> INCORRECT_FOR_REINFORCED_TRIPHITE_TOOL = createTag("incorrect_for_reinforcedtriphite_tool");
        public static TagKey<Block> NEEDS_MYTHRIL_TOOL = createTag("needs_mythril_tool");
        public static TagKey<Block> INCORRECT_FOR_MYTHRIL_TOOL = createTag("incorrect_for_mythril_tool");
        public static TagKey<Block> NEEDS_ENDIUM_TOOL = createTag("needs_endium_tool");
        public static TagKey<Block> INCORRECT_FOR_ENDIUM_TOOL = createTag("incorrect_for_endium_tool");
        public static TagKey<Block> NEEDS_PHENON_TOOL = createTag("needs_phenon_tool");
        public static TagKey<Block> INCORRECT_FOR_PHENON_TOOL = createTag("incorrect_for_phenon_tool");
        public static TagKey<Block> NEEDS_HYPHITE_TOOL = createTag("needs_hyphite_tool");
        public static TagKey<Block> INCORRECT_FOR_HYPHITE_TOOL = createTag("incorrect_for_hyphite_tool");
        public static TagKey<Block> NEEDS_TOPAZ_TOOL = createTag("needs_topaz_tool");
        public static TagKey<Block> INCORRECT_FOR_TOPAZ_TOOL = createTag("incorrect_for_topaz_tool");
        public static TagKey<Block> NEEDS_SAPPHIRE_TOOL = createTag("needs_sapphire_tool");
        public static TagKey<Block> INCORRECT_FOR_SAPPHIRE_TOOL = createTag("incorrect_for_sapphire_tool");
        public static TagKey<Block> NEEDS_RUBY_TOOL = createTag("needs_ruby_tool");
        public static TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");
        public static TagKey<Block> NEEDS_OPAL_TOOL = createTag("needs_opal_tool");
        public static TagKey<Block> INCORRECT_FOR_OPAL_TOOL = createTag("incorrect_for_opal_tool");
        public static TagKey<Block> NEEDS_ECHO_TOOL = createTag("needs_echo_tool");
        public static TagKey<Block> INCORRECT_FOR_ECHO_TOOL = createTag("incorrect_for_echo_tool");
        public static TagKey<Block> NEEDS_EMERALD_TOOL = createTag("needs_emerald_tool");
        public static TagKey<Block> INCORRECT_FOR_EMERALD_TOOL = createTag("incorrect_for_emerald_tool");
        public static TagKey<Block> NEEDS_AMETHYST_TOOL = createTag("needs_amethyst_tool");
        public static TagKey<Block> INCORRECT_FOR_AMETHYST_TOOL = createTag("incorrect_for_amethyst_tool");
        public static TagKey<Block> NEEDS_COPPER_TOOL = createTag("needs_copper_tool");
        public static TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MoreGear.MOD_ID, name));
        }
    }
}
