package com.github.bollyzhou.design;

/**
 * 具体车部件的生产
 */
public class SmallCarBuilder extends ConcreteBuilder {
    @Override
    public void makeBody() {
        car.setBody("小车身");
    }

    @Override
    public void makeSeat() {
        car.setSeat("小车座");
    }

    @Override
    public void makeTire() {
        car.setTire("小轮胎");
    }
}
