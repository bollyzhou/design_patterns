package com.github.bollyzhou.design;

public class BenChiFactory implements FactoryInterFace {
    public Car product() {
        return new BenChiCar();
    }
}
