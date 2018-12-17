package com.github.bollyzhou.design;

public class AoDiFactory implements FactoryInterFace {
    public Car product() {
        return new AoDiCar();
    }
}
