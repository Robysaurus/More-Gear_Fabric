package dog.robysaurus.moregear.item.custom;

import net.fabricmc.fabric.api.entity.event.v1.FabricElytraItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.registry.entry.RegistryEntry;

public class PhysicsiumElytraChestplateItem extends ModArmorItem implements FabricElytraItem {
    public PhysicsiumElytraChestplateItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings) {
        super(material, type, settings);
    }
}
