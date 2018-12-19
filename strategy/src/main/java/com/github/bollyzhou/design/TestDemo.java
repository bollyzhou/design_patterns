package com.github.bollyzhou.design;

public class TestDemo {
    public static void main(String[] args) {
        //计算加法
        Calculation add = new Calculation(new AddCalculation());
        add.calculate(2d,1d);

        //计算减法
        Calculation subtract = new Calculation(new SubtractionCalculation());
        subtract.calculate(2d,1d);
    }
}
