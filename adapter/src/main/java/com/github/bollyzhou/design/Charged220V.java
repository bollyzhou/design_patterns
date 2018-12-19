package com.github.bollyzhou.design;

/**
 * 适配器模式
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，主的目的是兼容性，让原本因接口不匹配不能一起工作的两个类可以协同工作。其别名为包装器(Wrapper)
 *
 * 主要分为三类：类适配器模式、对象的适配器模式、接口的适配器模式。
 *
 */
public class Charged220V implements ICharged220V {
    @Override
    public int charge() {
        System.out.println("我是220V电压。。。");
        return 220;
    }
}
