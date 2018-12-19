package com.github.bollyzhou.design;
/**
 * 适配器
 * Charged220V 是适配器的属性， 是以对象的形式存在的，所以这个是对象适配器
 * 组合模式比继承更优
*/
public class ObjectAdapter implements ICharged5v {
    private ICharged220V charged220V;
    public ObjectAdapter(ICharged220V charged220V){
        this.charged220V = charged220V;
    }
    @Override
    public int charge() {
        int charge = charged220V.charge();
        System.out.println("对象的适配器模式变压。。。");
        int i = charge / 44;
        return i;
    }
}
