package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/24
 * @Description:预定房间可以退订和入住，还有可能被被人尝试预定
 */
public class BookedState extends AbstractState {


    public BookedState(Room hotelManagement) {
        super(hotelManagement);
    }

    /**
     * 预定房间
     */
    @Override
    public void bookRoom() {
        System.out.println("该房间已近给预定了...");
    }
    /**
     * 退订房间
     */
    @Override
    public void unsubscribeRoom() {
        System.out.println("该房间已经退订了...");
        //状态改成空闲
        hotelManagement.setState(hotelManagement.getFreeTimeState());
    }
    /**
     * 入住房间
     */
    @Override
    public void checkinRoom() {
        System.out.println("入住成功...");
        //状态变成入住
        hotelManagement.setState(hotelManagement.getCheckInState());
    }

}
