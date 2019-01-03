package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/25
 * @Description:抽象同事类
 */
public interface Colleague {
    /**
     * 给中介发送消息
     * @param message
     * @param mediator
     */
    void sendToMediator(String message,Mediator mediator);

    /**
     * 获取消息
     */
    void getMessage(String message);
}
