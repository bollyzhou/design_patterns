package com.github.bollyzhou.design;

/**
 * 适配器
 * Charged220V 是适配器的父类， 是以类的形式存在的，所以这个是类适配器
 */
public class ClassAdapter extends Charged220V implements ICharged5v {
    @Override
    public int charge(){
        int charge = super.charge();
        System.out.println("类的适配器模式改变电压值");
        int i = charge / 44;
        return i;
    }
}
