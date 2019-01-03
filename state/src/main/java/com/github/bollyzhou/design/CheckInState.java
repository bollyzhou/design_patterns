package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/24
 * @Description:入住房间只能退房
 */
public class CheckInState extends AbstractState {

    public CheckInState(Room hotelManagement) {
       super(hotelManagement);
    }
    /**
     * 预定房间
     */
    @Override
    public void bookRoom() {
        System.out.println("该房间已经入住了...");
    }

    /**
     * 退订房间
     */
    @Override
    public void unsubscribeRoom() {
        System.out.println("该房间已经入住了...");
    }

    /**
     * 入住房间
     */
    @Override
    public void checkinRoom() {
        System.out.println("该房间已经入住了...");
    }
    /**
     * 退房
     */
    @Override
    public void checkoutRoom() {
        System.out.println("退房成功...");
        //状态变成入住
        hotelManagement.setState(hotelManagement.getFreeTimeState());
    }
}
