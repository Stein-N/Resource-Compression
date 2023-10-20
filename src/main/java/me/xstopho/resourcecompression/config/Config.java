package me.xstopho.resourcecompression.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@me.shedaniel.autoconfig.annotation.Config(name = "resource-compression")
public class Config implements ConfigData {

    @Comment("\nSet the max Level of Compression."
            + "\nOnly supports up to level 9.")
    public int maxCompression = 9;
}
