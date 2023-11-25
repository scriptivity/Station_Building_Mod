
package net.mcreator.stationbuildingmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LogoItemItem extends Item {
	public LogoItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
