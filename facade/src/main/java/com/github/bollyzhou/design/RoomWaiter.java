package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/20
 * @Description: 外观模式 为系统中的一组接口提供一个一致的界面，Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 *
 *  外观模式的外观类用单例。
 *
 *  优点:
 *      我们提供给用户的某个功能，可能是包含很多个步骤的，但我们可以把这些步骤封装到一个统一的接口中，让用户感觉仅仅就是一个单一的操作，使用起来也就更加简单
 *  缺点:
 *      如果要增加子系统，是比较麻烦的
 */
public enum RoomWaiter {
    /**
     * 外观模式的外观类
     */
    roomWaiter;
    Light light = new Light();
    TV tv = new TV();
    AirCondition airCondition = new AirCondition();
    void turnON(){
        light.turnON();
        tv.turnON();
        airCondition.turnON();
    }
    void turnOFF(){
        light.turnOFF();
        tv.turnOFF();
        airCondition.turnOFF();
    }
}
