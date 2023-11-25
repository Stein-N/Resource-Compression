package net.xstopho.resourcecompression;

import net.xstopho.resourcecompression.config.ConstantConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants {

	public static final String MOD_ID = "resourcecompression";
	public static final String MOD_NAME = "Resource Compression";
	public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
	public static final Integer COMPRESSION = ConstantConfig.COMPRESSION_LEVEL.get();
}