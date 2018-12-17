package com.github.bollyzhou.design;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Car baoMa = factory.product("BaoMa");
        baoMa.drive();
    }
}
