package com.github.bollyzhou.design;

//具体模板
public class ReaderTemplate extends AbstractTemplate {


    @Override
    void getBook() {
        System.out.println("获得新书===神雕侠侣");
    }

    @Override
    void writeThoughs() {
        System.out.println("读书心得：杨过和小龙女最终归隐江湖");
    }
}
