package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/20
 * @Description: 被代理对象
 */
public class Boss implements Driver {
    @Override
    public void driveCar() {
        System.out.println("开车。。。。。");
    }
}
