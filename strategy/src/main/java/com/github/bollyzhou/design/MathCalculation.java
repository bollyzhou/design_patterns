package com.github.bollyzhou.design;

/**
 * 策略模式
 * 针对一组算法，将每一种算法都封装到具有共同接口的独立的类中，从而是它们可以相互替换。
 * 对一组算法行为，抽象成接口，如果新增算法时，只要增加实现类就可以了
 *
 * 优点
 *      1、代码的复用性提高了
 *      2、可以管理这一组的行为
 * 缺点
 *      1、必需要知道所有的策略类
 *      2、如果策略比较多，那么实现类也大量的增多
 *
 *
 */
//策略类接口
public interface MathCalculation {
    void calculate(double a,double b);
}
