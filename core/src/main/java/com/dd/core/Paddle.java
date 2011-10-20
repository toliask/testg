package com.dd.core;

import playn.core.Image;

public class Paddle {
  private int x, y, vx, vy;
  private Image img;
  
  public Paddle() {
    x = 0;
    y = 0;
    vx = 0;
    vy = 0;
    img = null;
  }

  public Paddle(int x, int y, int vx, int vy, Image img) {
    this.x = x;
    this.y = y;
    this.vx = vx;
    this.vy = vy;
    this.img = img;
  }
  
  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getVx() {
    return vx;
  }

  public void setVx(int vx) {
    this.vx = vx;
  }

  public int getVy() {
    return vy;
  }

  public void setVy(int vy) {
    this.vy = vy;
  }

  public Image getImg() {
    return img;
  }

  public void setImg(Image img) {
    this.img = img;
  }
}
