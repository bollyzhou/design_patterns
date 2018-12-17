package com.github.bollyzhou.design;

/**
 * 工厂接口
 * 当新增车辆类型时只要增加工厂接口的实现类就可以了
 */
public interface FactoryInterFace {
    Car product();
}
