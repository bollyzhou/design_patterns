package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/20
 * @Description: 代理模式 为其他对象提供一种代理以控制对这个对象的访问
 *
 *  司机为老板开车的例子
 *      老板会开车，但是一般不开车，找了一个司机代理开车
 *
 */
public interface Driver {
    void driveCar();
}
