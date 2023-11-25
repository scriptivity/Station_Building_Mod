
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stationbuildingmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StationBuildingModModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("station_building_mod", "station_building_tab"),
				builder -> builder.title(Component.translatable("item_group.station_building_mod.station_building_tab")).icon(() -> new ItemStack(StationBuildingModModItems.LOGO_ITEM.get())).displayItems((parameters, tabData) -> {
					tabData.accept(StationBuildingModModItems.LOGO_ITEM.get());
					tabData.accept(StationBuildingModModBlocks.DROPDOWN_01.get().asItem());
					tabData.accept(StationBuildingModModBlocks.DROPDOWN_02.get().asItem());
					tabData.accept(StationBuildingModModBlocks.DROPDOWN_LIGHT_01.get().asItem());
					tabData.accept(StationBuildingModModBlocks.DROPDOWN_03.get().asItem());
				}).withSearchBar());
	}
}
