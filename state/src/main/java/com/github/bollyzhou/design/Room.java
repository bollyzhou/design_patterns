package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/24
 * @Description:房间类 就是判断条件的集合方法类
 */
public class Room {
    //房间有三个状态
    private State freeTimeState;
    private State bookedState;
    private State checkInState;

    //房间当前状态
    State state;
    public Room(){
        freeTimeState = new FreeTimeState(this);
        bookedState = new BookedState(this);
        checkInState = new CheckInState(this);

        state = freeTimeState;
    }

    /**
     * 预定房间
     */
    public void bookRoom() {
        state.bookRoom();
    }

    /**
     * 退订房间
     */
    public void unsubscribeRoom() {
        state.unsubscribeRoom();
    }

    /**
     * 入住房间
     */
    public void checkinRoom() {
        state.checkinRoom();
    }

    /**
     * 退房
     */
    public void checkoutRoom() {
        state.checkoutRoom();
    }

    @Override
    public String toString(){
        return "该房间的状态是:"+getState().getClass().getName();
    }

    //以下是getter and setter 方法

    public State getFreeTimeState() {
        return freeTimeState;
    }

    public void setFreeTimeState(State freeTimeState) {
        this.freeTimeState = freeTimeState;
    }

    public State getBookedState() {
        return bookedState;
    }

    public void setBookedState(State bookedState) {
        this.bookedState = bookedState;
    }

    public State getCheckInState() {
        return checkInState;
    }

    public void setCheckInState(State checkInState) {
        this.checkInState = checkInState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
