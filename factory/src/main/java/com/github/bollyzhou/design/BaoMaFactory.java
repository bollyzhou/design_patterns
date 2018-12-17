package com.github.bollyzhou.design;

public class BaoMaFactory implements FactoryInterFace {
    public Car product() {
        return new BaoMaCar();
    }
}
