
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package paradox_testmod.init;

import paradox_testmod.McreatorTestModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

public class McreatorTestModModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, McreatorTestModMod.MODID);
	public static final RegistryObject<PaintingVariant> VERGIL_PAINTING = REGISTRY.register("vergil_painting", () -> new PaintingVariant(64, 64));
	public static final RegistryObject<PaintingVariant> LEONKENNEDY = REGISTRY.register("leonkennedy", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> PAINTING_1 = REGISTRY.register("painting_1", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> LIGHT_YAGAMI = REGISTRY.register("light_yagami", () -> new PaintingVariant(48, 48));
}
