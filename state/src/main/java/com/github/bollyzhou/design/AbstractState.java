package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/24
 * @Description: 加一个抽象层是，是减少实现时的一些空方法，二是，增加状态类时，需要增加state接口方法，可以减少已有子类的实现时的修改
 */
public abstract class AbstractState implements State {

    Room hotelManagement;

    public AbstractState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    /**
     * 预定房间
     */
    @Override
    public void bookRoom() {
    }

    /**
     * 退订房间
     */
    @Override
    public void unsubscribeRoom() {
    }

    /**
     * 入住房间
     */
    @Override
    public void checkinRoom() {
    }

    /**
     * 退房
     */
    @Override
    public void checkoutRoom() {
    }
}
