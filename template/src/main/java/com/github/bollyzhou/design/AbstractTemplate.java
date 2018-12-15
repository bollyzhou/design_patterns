package com.github.bollyzhou.design;

/**
 * 模板模式
 * 平时是应用的比较多的设计模式
 * 1、提高代码的复用性 将公共部分的代码提取出来，写到一个稳定的骨架里
 * 2、有稳定的一个骨架，将骨架的流程步骤确定，变化的部分抽象出来，给子类去实现
 * 3、子类实现的方法就是变化部分，不会影响骨架的稳定
 */
public abstract class AbstractTemplate {

    /**
     * 1、规定一个固定的骨架流程
     * 2、学习要先获得书，再读，最后写感想
     * 3、确定的步骤骨架 骨架中的各个步骤的方法可以是实现的可以是抽象的。
     */
    void study(){
        getBook();
        for (int i=0;i<3;i++){
            readBood();
        }
        writeThoughs();
    }
    void readBood(){
        System.out.println("一直看。。。");
    }
    abstract void getBook();

    abstract void writeThoughs();
}
