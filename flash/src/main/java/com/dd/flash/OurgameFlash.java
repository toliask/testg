package com.dd.flash;

import playn.core.PlayN;
import playn.flash.FlashGame;
import playn.flash.FlashPlatform;

import com.dd.core.Ourgame;

public class OurgameFlash extends FlashGame {

  @Override
  public void start() {
    FlashPlatform platform = FlashPlatform.register();
    platform.assetManager().setPathPrefix("ourgameflash/");
    PlayN.run(new Ourgame());
  }
}
