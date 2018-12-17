package com.github.bollyzhou.design;

import java.lang.reflect.Type;

/**
 * 简单工厂
 *  简单工厂实现了解耦合的功能，
 *  但是当有新的类型需要提供时要去改变他的生产方法
 *  如：需要提供奥迪车辆。。
 *  如果输入的类型错误，就不能提供正确的车型
 */
public class SimpleFactory {


    /**
     * 生产方法
     * @param type
     * @return
     */
    public Car product(String type){
        //变化的部分。。。
        if("BaoMa".equals(type)){
            return new BaoMaCar();
        }else if ("BenChi".equals(type)){
            return new BaoMaCar();
        }
        //但增加奥迪车时，需要增加if...else ...等等
        else if ("AoDi".equals(type)){
            return new AoDiCar();
        }

        else {
            System.out.println("输入的生产车型错误。。。。。");
            return null;
        }
    }

}
