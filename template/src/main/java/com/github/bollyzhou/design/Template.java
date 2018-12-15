package com.github.bollyzhou.design;

//具体模板
public class Template extends AbstractTemplate {
    @Override
    void getBook() {
        System.out.println("获得新书=====射雕英雄传");
    }
    @Override
    void writeThoughs() {
        System.out.println("看书心得：侠之大者，为国为民！");
    }
}
