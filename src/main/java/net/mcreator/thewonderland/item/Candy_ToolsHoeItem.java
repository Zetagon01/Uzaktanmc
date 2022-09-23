
package net.mcreator.thewonderland.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class Candy_ToolsHoeItem extends HoeItem {
	public Candy_ToolsHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheWonderlandModItems.CANDY_BAR.get()));
			}
		},

				0, -3f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}

}
