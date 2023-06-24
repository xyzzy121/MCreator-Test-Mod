
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package paradox_testmod.init;

import paradox_testmod.enchantment.EnchantmentTestEnchantment;

import paradox_testmod.McreatorTestModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class McreatorTestModModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, McreatorTestModMod.MODID);
	public static final RegistryObject<Enchantment> ENCHANTMENT_TEST = REGISTRY.register("enchantment_test", () -> new EnchantmentTestEnchantment());
}
