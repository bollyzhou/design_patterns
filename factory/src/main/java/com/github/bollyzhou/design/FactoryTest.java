package com.github.bollyzhou.design;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car baoMaCar = factory.productBaoMaCar();
        baoMaCar.drive();

        /**
         * 静态工厂测试
         *
         * 减少了Factory工厂类的实例，较比工厂模式性能更优一些
         */


        Car baoMaCarStatic = Factory.getBaoMaCarStatic();
        baoMaCarStatic.drive();

    }
}
