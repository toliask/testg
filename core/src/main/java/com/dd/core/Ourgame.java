package com.dd.core;

import static playn.core.PlayN.assetManager;
import static playn.core.PlayN.graphics;
import static playn.core.PlayN.pointer;

import java.util.ArrayList;
import java.util.List;

import playn.core.Game;
import playn.core.Image;
import playn.core.ImageLayer;
import playn.core.Pointer;
import playn.core.SurfaceLayer;

public class Ourgame implements Game {
  private SurfaceLayer paddleLayer;
  private Image ball;
  private List<MovableEntity> entities;
  private MovableEntity p1;

  @Override
  public void init() {
    // create and add background image layer
    Image bgImage = assetManager().getImage("images/bg.png");
    Image paddleImage = assetManager().getImage("images/paddle.png");
    Image ballImage = assetManager().getImage("images/ball.png");

    ImageLayer bgLayer = graphics().createImageLayer(bgImage);
    paddleLayer = graphics().createSurfaceLayer(480, 800);

    graphics().rootLayer().add(bgLayer);
    graphics().rootLayer().add(paddleLayer);
    graphics().setSize(480, 800);

    p1 = new MovableEntity(160, 650, paddleImage, "paddle1");
    MovableEntity p2 = new MovableEntity(160, 10, paddleImage, "paddle2");
    MovableEntity ball = new MovableEntity(320, 390, ballImage, "ball");
    ball.setVx(5);
    ball.setVy(8);

    entities = new ArrayList<MovableEntity>();
    entities.add(p1);
    entities.add(p2);
    entities.add(ball);
    
    pointer().setListener(new Pointer.Adapter() {
      @Override
      public void onPointerStart(Pointer.Event event) {
        if (event.y() > 680 && event.x() > 400)
          p1.setVx(5);
        else if (event.y() > 680 && event.x() < 80)
          p1.setVx(-5);
        else
          p1.setVx(0);
      }
      
      public void onPointerEnd(Pointer.Event event) {
        p1.setVx(0);
      }
    });
  }

  @Override
  public void paint(float alpha) {
    // the background automatically paints itself, so no need to do anything here!
    paddleLayer.surface().clear();

    for (MovableEntity e : entities) {
      paddleLayer.surface().drawImage(e.getImg(), e.getX()*alpha + e.getPx()*(1-alpha), e.getY());
    }

  }

  @Override
  public void update(float delta) {
    for (MovableEntity e : entities) {
      if (e.is("paddle1")) {
        if (e.getX() + e.getVx() > 320 || e.getX() + e.getVx() < 0) {
          e.setVx(0);
        }
        e.setX(e.getX() + e.getVx());
      }
      if (e.is("ball")) {
        if (e.getX() + e.getVx() > 460 || e.getX() + e.getVx() < 0) {
          e.setVx(e.getVx()*-1);
        }
        e.setX(e.getX() + e.getVx());
        
        if (e.getY() + e.getVy() > 780 || e.getY() + e.getVy() < 0) {
          e.setVy(e.getVy()*-1);
        }
        e.setY(e.getY() + e.getVy());
      }

    }
  }

  @Override
  public int updateRate() {
    return 25;
  }
}
