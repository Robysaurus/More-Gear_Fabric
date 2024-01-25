package dog.robysaurus.moregear.item.custom;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class PhysicsItem extends SwordItem {
    public PhysicsItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isDamageable() {
        return false;
    }
}
