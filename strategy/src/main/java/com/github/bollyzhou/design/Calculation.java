package com.github.bollyzhou.design;

//策略类的使用环境
public class Calculation {

    private MathCalculation mathCalculation;

    Calculation(MathCalculation mathCalculation){
        this.mathCalculation = mathCalculation;
    }

    void calculate(double a,double b){
        mathCalculation.calculate(a,b);
    }
}
