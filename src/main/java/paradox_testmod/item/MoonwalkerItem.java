
package paradox_testmod.item;

import paradox_testmod.init.McreatorTestModModTabs;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MoonwalkerItem extends RecordItem {
	public MoonwalkerItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcreator_test_mod:moonwalker")), new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST_CREATIVE_INVENTORY_TAB).stacksTo(1).rarity(Rarity.RARE), 4660);
	}
}
