package com.github.bollyzhou.design;

public class AbstrctFactoryTest {
    public static void main(String[] args) {
        BaoMaFactory baoMaFactory = new BaoMaFactory();
        Car car = baoMaFactory.product();
        car.drive();
    }
}
