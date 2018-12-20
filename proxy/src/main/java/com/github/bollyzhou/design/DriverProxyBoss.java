package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/20
 * @Description:
 */
public class DriverProxyBoss implements Driver {
    private Boss boss;
    public DriverProxyBoss(){
        boss = new Boss();
    }
    @Override
    public void driveCar() {
        boss.driveCar();
    }
}
