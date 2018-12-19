package com.github.bollyzhou.design;

public class DemoTest {
    public static void main(String[] args) {
        BigCarBuilder bigCarBuilder = new BigCarBuilder();
        Direct direct = new Direct(bigCarBuilder);
        Car car = direct.creatCar();
        System.out.println(car.getBody());
        System.out.println(car.getSeat());
        System.out.println(car.getTire());

        SmallCarBuilder smallCarBuilder = new SmallCarBuilder();
        Direct direct1 = new Direct(smallCarBuilder);
        Car smallCar = direct1.creatCar();
        System.out.println(smallCar.getBody());
        System.out.println(smallCar.getSeat());
        System.out.println(smallCar.getTire());
    }
}
