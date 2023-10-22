package me.xstopho.resourcecompression;

import me.xstopho.resourcecompression.init.RCBlocks;
import me.xstopho.resourcecompression.init.RCItemGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceCompression implements ModInitializer {
	public static final String MOD_ID = "resource-compression";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		RCBlocks.init();
		RCItemGroup.init();
	}
}