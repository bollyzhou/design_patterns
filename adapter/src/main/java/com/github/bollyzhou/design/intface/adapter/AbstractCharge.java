package com.github.bollyzhou.design.intface.adapter;

/**
 * 实现类
 */
public abstract class AbstractCharge implements Charge {

    @Override
    public int chargeFor220V() {
        System.out.println("我是220V电压");
        return 220;
    }

    @Override
    public int chargeFor200V() {
        return 0;
    }

    @Override
    public int chargeFor180V() {
        return 0;
    }

    @Override
    public int chargeFor150V() {
        return 0;
    }

    @Override
    public int chargeFor100V() {
        return 0;
    }
}
