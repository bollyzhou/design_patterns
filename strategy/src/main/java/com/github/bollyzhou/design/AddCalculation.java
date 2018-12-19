package com.github.bollyzhou.design;

//具体的策略类
public class AddCalculation implements MathCalculation {

    @Override
    public void calculate(double a, double b) {
        System.out.println("运算结果："+ (a+b));
    }
}
