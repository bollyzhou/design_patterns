package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/19
 * @Description: 具体观察者类
 */
public class User implements Observer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("姓名："+name +"，做动作："+msg);
    }
}
