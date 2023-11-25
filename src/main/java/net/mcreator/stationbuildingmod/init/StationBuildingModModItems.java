
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stationbuildingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.stationbuildingmod.item.LogoItemItem;
import net.mcreator.stationbuildingmod.StationBuildingModMod;

public class StationBuildingModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StationBuildingModMod.MODID);
	public static final RegistryObject<Item> LOGO_ITEM = REGISTRY.register("logo_item", () -> new LogoItemItem());
	public static final RegistryObject<Item> DROPDOWN_01 = block(StationBuildingModModBlocks.DROPDOWN_01);
	public static final RegistryObject<Item> DROPDOWN_02 = block(StationBuildingModModBlocks.DROPDOWN_02);
	public static final RegistryObject<Item> DROPDOWN_LIGHT_01 = block(StationBuildingModModBlocks.DROPDOWN_LIGHT_01);
	public static final RegistryObject<Item> DROPDOWN_03 = block(StationBuildingModModBlocks.DROPDOWN_03);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
