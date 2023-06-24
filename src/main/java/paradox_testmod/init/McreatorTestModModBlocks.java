
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package paradox_testmod.init;

import paradox_testmod.block.TestDimensionPortalBlock;
import paradox_testmod.block.StarsteelOreBlock;
import paradox_testmod.block.StarsteelBlockBlock;
import paradox_testmod.block.SkulkPortalBlockBlock;

import paradox_testmod.McreatorTestModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class McreatorTestModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McreatorTestModMod.MODID);
	public static final RegistryObject<Block> SKULK_PORTAL_BLOCK = REGISTRY.register("skulk_portal_block", () -> new SkulkPortalBlockBlock());
	public static final RegistryObject<Block> TEST_DIMENSION_PORTAL = REGISTRY.register("test_dimension_portal", () -> new TestDimensionPortalBlock());
	public static final RegistryObject<Block> STARSTEEL_ORE = REGISTRY.register("starsteel_ore", () -> new StarsteelOreBlock());
	public static final RegistryObject<Block> STARSTEEL_BLOCK = REGISTRY.register("starsteel_block", () -> new StarsteelBlockBlock());
}
