
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package paradox_testmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class McreatorTestModModTabs {
	public static CreativeModeTab TAB_TEST_CREATIVE_INVENTORY_TAB;

	public static void load() {
		TAB_TEST_CREATIVE_INVENTORY_TAB = new CreativeModeTab("tabtest_creative_inventory_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(McreatorTestModModItems.POPULAR_MONSTER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
