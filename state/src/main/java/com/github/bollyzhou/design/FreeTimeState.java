package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/24
 * @Description:房间空闲状态可以预定和入住，
 */
public class FreeTimeState extends AbstractState {


    public FreeTimeState(Room hotelManagement) {
        super(hotelManagement);
    }

    /**
     * 预定房间
     */
    @Override
    public void bookRoom() {
        System.out.println("您已经成功预订了...");
        //将房间的状态改为已预订
        hotelManagement.setState(hotelManagement.getBookedState());
    }


    /**
     * 入住房间
     */
    @Override
    public void checkinRoom() {
        System.out.println("您已经成功预订了...");
        //将房间状态改成已入住
        hotelManagement.setState(hotelManagement.getCheckInState());
    }
}
