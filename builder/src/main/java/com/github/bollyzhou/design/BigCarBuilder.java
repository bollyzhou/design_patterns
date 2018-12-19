package com.github.bollyzhou.design;

/**
 * 具体车部件的生产
 */
public class BigCarBuilder extends ConcreteBuilder {
    @Override
    public void makeBody() {
        car.setBody("大车身");
    }

    @Override
    public void makeSeat() {
        car.setSeat("大车座");
    }

    @Override
    public void makeTire() {
        car.setTire("大轮胎");
    }
}
