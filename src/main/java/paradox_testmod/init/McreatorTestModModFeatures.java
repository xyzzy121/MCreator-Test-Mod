
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package paradox_testmod.init;

import paradox_testmod.world.features.ores.StarsteelOreFeature;

import paradox_testmod.McreatorTestModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class McreatorTestModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, McreatorTestModMod.MODID);
	public static final RegistryObject<Feature<?>> STARSTEEL_ORE = REGISTRY.register("starsteel_ore", StarsteelOreFeature::feature);
}
