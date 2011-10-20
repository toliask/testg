package com.dd.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import com.dd.core.Ourgame;

public class OurgameJava {

  public static void main(String[] args) {
    JavaPlatform platform = JavaPlatform.register();
    platform.assetManager().setPathPrefix("src/main/java/com/dd/resources");
    PlayN.run(new Ourgame());
  }
}
