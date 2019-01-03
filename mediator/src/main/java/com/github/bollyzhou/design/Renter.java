package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/25
 * @Description:具体同事类：租客
 */
public class Renter implements Colleague {
    private String name;

    public Renter(String name) {
        this.name = name;
    }

    /**
     * 给中介发送消息
     *
     * @param message
     * @param mediator
     */
    @Override
    public void sendToMediator(String message, Mediator mediator) {
        mediator.sendMessageToColleague(this,message);
    }

    /**
     * 获取消息
     *
     * @param message
     */
    @Override
    public void getMessage(String message) {
        System.out.println("租客"+name+"收到消息："+message);
    }
}
