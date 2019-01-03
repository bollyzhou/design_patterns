package com.githit.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/26
 * @Description:发起人
 */
public class Originator {
    private String state;

    /**
     * 保存到备忘录
     * @return
     */
    public Memento saveMemerto(){
        return new Memento(this);
    }

    /**
     * 从备忘录中恢复
     * @param memento
     */
    public void recover(Memento memento){
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
