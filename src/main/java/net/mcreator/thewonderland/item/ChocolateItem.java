
package net.mcreator.thewonderland.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.thewonderland.init.TheWonderlandModFluids;

public class ChocolateItem extends BucketItem {
	public ChocolateItem() {
		super(TheWonderlandModFluids.CHOCOLATE,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
