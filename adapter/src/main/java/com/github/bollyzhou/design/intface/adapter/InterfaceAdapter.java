package com.github.bollyzhou.design.intface.adapter;

/**
 * 接口适配器，只用重写想要适配的方法即可
 */
public class InterfaceAdapter extends AbstractCharge {
    @Override
    public int chargeFor220V() {
        int charge = super.chargeFor220V();
        System.out.println("接口适配器模式改变电压值");
        int i = charge / 44;
        return i;
    }

}
