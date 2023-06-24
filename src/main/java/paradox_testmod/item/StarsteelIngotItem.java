
package paradox_testmod.item;

import paradox_testmod.init.McreatorTestModModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StarsteelIngotItem extends Item {
	public StarsteelIngotItem() {
		super(new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST_CREATIVE_INVENTORY_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
