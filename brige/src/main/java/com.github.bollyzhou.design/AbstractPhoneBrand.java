package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/20
 * @Description: 抽象手机品牌 将手机软件接口聚合到这个类中 是撘成了桥接模式的桥梁
 *
 * 具体的手机品牌子类对具体的手机软件实现类解耦合。
 * 当有新的手机品牌增加，或者新增软件时，都不用去修改现有的代码，只要新增对应的子类和实现类即可。
 *
 *
 */
public abstract class AbstractPhoneBrand {
    protected SoftWare softWare;
    public AbstractPhoneBrand(SoftWare softWare){
        this.softWare = softWare;
    }
    abstract void use();
}
