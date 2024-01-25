package dog.robysaurus.moregear.entity;

import dog.robysaurus.moregear.MoreGear;
import dog.robysaurus.moregear.entity.custom.ShrikeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<ShrikeEntity> SHRIKE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MoreGear.MOD_ID, "shrike"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ShrikeEntity::new).dimensions(EntityDimensions.fixed(1.5f, 3f)).build());
    public static void registerModEntities() {
        MoreGear.LOGGER.info("Registering Mod Entities for " + MoreGear.MOD_ID);
    }
}
