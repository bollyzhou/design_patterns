package com.githit.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/26
 * @Description:备忘录（Memento）：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
 *
 * 备忘录类
 */
public class Memento {
    private String state;

    public Memento(Originator originator) {
        this.state = originator.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
