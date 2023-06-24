
package paradox_testmod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

public class EnchantmentTestEnchantment extends Enchantment {
	public EnchantmentTestEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 999;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 1;
	}
}
