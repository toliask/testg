package com.dd.html;

import playn.core.PlayN;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import com.dd.core.Ourgame;

public class OurgameHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlPlatform platform = HtmlPlatform.register();
    platform.assetManager().setPathPrefix("ourgame/");
    PlayN.run(new Ourgame());
  }
}
