package com.github.bollyzhou.design;

import java.util.List;

/**
 * @Author: ZST
 * @Date: 2018/12/25
 * @Description:房产中介
 */
public class RoomMediator implements Mediator {
    private List<Colleague> renterList;
    private List<Colleague> landlordList;

    public RoomMediator(List<Colleague> renterList, List<Colleague> landlordList) {
        this.renterList = renterList;
        this.landlordList = landlordList;
    }

    /**
     * 给同事发消息
     *
     * @param colleague
     * @param message
     */
    @Override
    public void sendMessageToColleague(Colleague colleague, String message) {
        if(colleague instanceof Renter){
            for(Colleague renter : renterList){
                renter.getMessage(message);
            }
        }else {
            for (Colleague landlord : landlordList) {
                landlord.getMessage(message);
            }
        }

    }
}
