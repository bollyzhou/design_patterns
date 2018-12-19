package com.github.bollyzhou.design;

/**
 * 对产品生产各部件并组装。
 */
public abstract class ConcreteBuilder implements Builder {

    Car car  = new Car();

    @Override
    public abstract void makeBody();

    @Override
    public abstract void makeSeat();

    @Override
    public abstract void makeTire();

    @Override
    public Car getCar() {
        return car;
    }
}
