package com.github.bollyzhou.design;

/**
 * 各个部件的单独创造的接口
 */
public interface Builder {
   public void makeBody();
   public void makeSeat();
   public void makeTire();
   Car getCar();
}
