package com.githit.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/26
 * @Description:备忘录管理类 （负责人角色）
 */
public class Caretaker {
    private Memento memento;
    public Caretaker(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
