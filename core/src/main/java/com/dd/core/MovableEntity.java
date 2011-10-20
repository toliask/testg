package com.dd.core;

import playn.core.Image;

public class MovableEntity {
  private float x, y, vx, vy, px, py;
  private Image img;
  private String desc;
  
  public MovableEntity() {
    x = 0;
    y = 0;
    vx = 0;
    vy = 0;
    img = null;
    desc = "no desc";
  }

  public MovableEntity(int x, int y, Image img) {
    this.x = x;
    this.y = y;
    px = x;
    py = y;
    this.vx = 0;
    this.vy = 0;
    this.img = img;
    desc = "no desc";
  }
  
  public MovableEntity(int x, int y, Image img, String desc) {
    this.x = x;
    this.y = y;
    px = x;
    py = y;
    this.vx = 0;
    this.vy = 0;
    this.img = img;
    this.desc = desc;
  }
  
  public boolean is(String desc) {
    return this.desc.equals(desc);
  }
  
  public float getX() {
    return x;
  }

  public void setX(float x) {
    px = x;
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    py = y;
    this.y = y;
  }

  public float getVx() {
    return vx;
  }

  public void setVx(float vx) {
    this.vx = vx;
  }

  public float getVy() {
    return vy;
  }

  public void setVy(float vy) {
    this.vy = vy;
  }

  public Image getImg() {
    return img;
  }

  public void setImg(Image img) {
    this.img = img;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public float getPx() {
    return px;
  }

  public float getPy() {
    return py;
  }
}
