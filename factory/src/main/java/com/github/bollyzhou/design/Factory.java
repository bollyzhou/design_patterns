package com.github.bollyzhou.design;

/**
 * 工厂方法
 * 为了避免简单工厂的输入错误的问题，还有改写if else的方法，我们对简单工厂进行修改
 *
 * 我们提共具体的车辆类型
 *
 * 但是有新的车型提供时还是要修改的
 *
 *
 * 静态工厂
 * 将方法都改写为静态，没有了实例创建，比工厂方法更优一些；
 * 但是增加车型时仍然要修改
 *
 *
 *
 * 怎么样才能解决新增车型时不修改工厂类。
 * 使用抽象工厂，将工厂抽象出来。
 */
public class Factory {

    public Car productBaoMaCar(){
      return new BaoMaCar();
    }
    public Car productBenChiCar(){
        return new BenChiCar();
    }
    //新增车型时要增加这部分代码  变化部分
    public Car productAoDiCar(){
        return new AoDiCar();
    }


    public static Car getBaoMaCarStatic(){
        return new BaoMaCar();
    }
}
