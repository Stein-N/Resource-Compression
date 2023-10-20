package me.xstopho.resourcecompression;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.xstopho.resourcecompression.config.Config;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceCompression implements ModInitializer {
	public static final String MOD_ID = "resource-compression";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Config CONFIG = AutoConfig.register(Config.class, JanksonConfigSerializer::new).getConfig();

	@Override
	public void onInitialize() {

	}
}