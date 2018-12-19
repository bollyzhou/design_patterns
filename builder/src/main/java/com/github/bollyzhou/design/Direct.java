package com.github.bollyzhou.design;

/**
 * 指挥者
 * 构建一个使用Builder接口的对象。它主要是用于创建一个复杂的对象，它主要有两个作用，
 * 一是：隔离了客户与对象的生产过程，
 * 二是：负责控制产品对象的生产过程。
 */
public class Direct {
    private Builder builder;
    public Direct(Builder builder){
        this.builder = builder;
    }
    Car creatCar(){
        builder.makeBody();
        builder.makeSeat();
        builder.makeTire();
        return builder.getCar();
    }
}
