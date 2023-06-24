
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package paradox_testmod.init;

import paradox_testmod.item.WorldINeverKnewItem;
import paradox_testmod.item.TestDimensionItem;
import paradox_testmod.item.StarsteelSwordItem;
import paradox_testmod.item.StarsteelShovelItem;
import paradox_testmod.item.StarsteelPickaxeItem;
import paradox_testmod.item.StarsteelIngotItem;
import paradox_testmod.item.StarsteelHoeItem;
import paradox_testmod.item.StarsteelAxeItem;
import paradox_testmod.item.StarsteelArmorItem;
import paradox_testmod.item.RangedItem;
import paradox_testmod.item.PopularMonsterStereoTestItem;
import paradox_testmod.item.PopularMonsterItem;
import paradox_testmod.item.MoonwalkerItem;
import paradox_testmod.item.LostItAllItem;
import paradox_testmod.item.LetItAllBurnItem;
import paradox_testmod.item.AddictItem;

import paradox_testmod.McreatorTestModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class McreatorTestModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McreatorTestModMod.MODID);
	public static final RegistryObject<Item> SKULK_PORTAL_BLOCK = block(McreatorTestModModBlocks.SKULK_PORTAL_BLOCK, McreatorTestModModTabs.TAB_TEST_CREATIVE_INVENTORY_TAB);
	public static final RegistryObject<Item> TEST_DIMENSION = REGISTRY.register("test_dimension", () -> new TestDimensionItem());
	public static final RegistryObject<Item> STARSTEEL_ORE = block(McreatorTestModModBlocks.STARSTEEL_ORE, McreatorTestModModTabs.TAB_TEST_CREATIVE_INVENTORY_TAB);
	public static final RegistryObject<Item> STARSTEEL_INGOT = REGISTRY.register("starsteel_ingot", () -> new StarsteelIngotItem());
	public static final RegistryObject<Item> STARSTEEL_BLOCK = block(McreatorTestModModBlocks.STARSTEEL_BLOCK, McreatorTestModModTabs.TAB_TEST_CREATIVE_INVENTORY_TAB);
	public static final RegistryObject<Item> RANGED = REGISTRY.register("ranged", () -> new RangedItem());
	public static final RegistryObject<Item> POPULAR_MONSTER = REGISTRY.register("popular_monster", () -> new PopularMonsterItem());
	public static final RegistryObject<Item> POPULAR_MONSTER_STEREO_TEST = REGISTRY.register("popular_monster_stereo_test", () -> new PopularMonsterStereoTestItem());
	public static final RegistryObject<Item> LOST_IT_ALL = REGISTRY.register("lost_it_all", () -> new LostItAllItem());
	public static final RegistryObject<Item> WORLD_I_NEVER_KNEW = REGISTRY.register("world_i_never_knew", () -> new WorldINeverKnewItem());
	public static final RegistryObject<Item> ADDICT = REGISTRY.register("addict", () -> new AddictItem());
	public static final RegistryObject<Item> LET_IT_ALL_BURN = REGISTRY.register("let_it_all_burn", () -> new LetItAllBurnItem());
	public static final RegistryObject<Item> MOONWALKER = REGISTRY.register("moonwalker", () -> new MoonwalkerItem());
	public static final RegistryObject<Item> STARSTEEL_ARMOR_HELMET = REGISTRY.register("starsteel_armor_helmet", () -> new StarsteelArmorItem.Helmet());
	public static final RegistryObject<Item> STARSTEEL_ARMOR_CHESTPLATE = REGISTRY.register("starsteel_armor_chestplate", () -> new StarsteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STARSTEEL_ARMOR_LEGGINGS = REGISTRY.register("starsteel_armor_leggings", () -> new StarsteelArmorItem.Leggings());
	public static final RegistryObject<Item> STARSTEEL_ARMOR_BOOTS = REGISTRY.register("starsteel_armor_boots", () -> new StarsteelArmorItem.Boots());
	public static final RegistryObject<Item> STARSTEEL_SWORD = REGISTRY.register("starsteel_sword", () -> new StarsteelSwordItem());
	public static final RegistryObject<Item> STARSTEEL_PICKAXE = REGISTRY.register("starsteel_pickaxe", () -> new StarsteelPickaxeItem());
	public static final RegistryObject<Item> STARSTEEL_AXE = REGISTRY.register("starsteel_axe", () -> new StarsteelAxeItem());
	public static final RegistryObject<Item> STARSTEEL_SHOVEL = REGISTRY.register("starsteel_shovel", () -> new StarsteelShovelItem());
	public static final RegistryObject<Item> STARSTEEL_HOE = REGISTRY.register("starsteel_hoe", () -> new StarsteelHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
