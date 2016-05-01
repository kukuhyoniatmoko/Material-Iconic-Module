package com.foodenak.materialiconicmodule;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

/**
 * Created by ITP on 5/1/16.
 */
public class MaterialIconicModule implements IconFontDescriptor {
  @Override public String ttfFileName() {
    return "iconify/material_design_iconic_font.ttf";
  }

  @Override public Icon[] characters() {
    return MaterialIconics.values();
  }
}
