package net.gaymeow.amends;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.gaymeow.amends.datagen.ModItemTagsProvider;
import net.gaymeow.amends.datagen.ModModelProvider;

// Data Generation
public class AmendsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
	}
}
