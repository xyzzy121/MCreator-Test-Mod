
package paradox_testmod.item;

import paradox_testmod.init.McreatorTestModModTabs;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class PopularMonsterItem extends RecordItem {
	public PopularMonsterItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcreator_test_mod:pop")), new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST_CREATIVE_INVENTORY_TAB).stacksTo(1).rarity(Rarity.RARE), 4400);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
