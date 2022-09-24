
package net.mcreator.thewonderland.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class Lv2DemonicSwordItem extends SwordItem {
	public Lv2DemonicSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				3, -3.2000000000000001f,

				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}

}
