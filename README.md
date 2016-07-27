# material-iconic-module
[![](https://jitpack.io/v/kukuhyoniatmoko/material-iconic-module.svg)](https://jitpack.io/#kukuhyoniatmoko/material-iconic-module)  [![Build Status](https://travis-ci.org/kukuhyoniatmoko/material-iconic-module.svg?branch=master)](https://travis-ci.org/kukuhyoniatmoko/material-iconic-module)

Module for [Iconify] (https://github.com/JoanZapata/android-iconify) with fonts from [zavoloklom/material-design-iconic-font] (https://github.com/zavoloklom/material-design-iconic-font)

### Install
```gradle
dependencies {
    compile 'com.github.kukuhyoniatmoko:material-iconic-module:1.0.1'
}
```
```java
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Iconify.with(new MaterialIconicModule());
    }
}
```
### Create Drawable
```java
    Drawable icon = new IconDrawable(context, MaterialIconics.zmdi_android);
```
### Available Icons
See all available icons at: http://zavoloklom.github.io/material-design-iconic-font/icons.html
use __zmdi__ as key prefix, for example key __android__ icon is __zmdi-android__