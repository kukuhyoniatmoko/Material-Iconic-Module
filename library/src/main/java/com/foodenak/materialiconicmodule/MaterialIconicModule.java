package com.foodenak.materialiconicmodule;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

/**
 * Provides ttf file name, list of all characters
 */
public class MaterialIconicModule implements IconFontDescriptor {
  @Override public String ttfFileName() {
    return "iconify/material_design_iconic_font.ttf";
  }

  @Override public Icon[] characters() {
    return MaterialIconics.values();
  }
}
