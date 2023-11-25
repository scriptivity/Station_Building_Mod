
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stationbuildingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.stationbuildingmod.block.DropdownLight01Block;
import net.mcreator.stationbuildingmod.block.Dropdown03Block;
import net.mcreator.stationbuildingmod.block.Dropdown02Block;
import net.mcreator.stationbuildingmod.block.Dropdown01Block;
import net.mcreator.stationbuildingmod.StationBuildingModMod;

public class StationBuildingModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StationBuildingModMod.MODID);
	public static final RegistryObject<Block> DROPDOWN_01 = REGISTRY.register("dropdown_01", () -> new Dropdown01Block());
	public static final RegistryObject<Block> DROPDOWN_02 = REGISTRY.register("dropdown_02", () -> new Dropdown02Block());
	public static final RegistryObject<Block> DROPDOWN_LIGHT_01 = REGISTRY.register("dropdown_light_01", () -> new DropdownLight01Block());
	public static final RegistryObject<Block> DROPDOWN_03 = REGISTRY.register("dropdown_03", () -> new Dropdown03Block());
}
