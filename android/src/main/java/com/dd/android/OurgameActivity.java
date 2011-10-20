package com.dd.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import com.dd.core.Ourgame;

public class OurgameActivity extends GameActivity {

  @Override
  public void main(){
    platform().assetManager().setPathPrefix("com/dd/resources");
    PlayN.run(new Ourgame());
  }
  
  @Override
  public boolean usePortraitOrientation() {
    return true;
  }
}
