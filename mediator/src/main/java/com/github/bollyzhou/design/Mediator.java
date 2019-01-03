package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/25
 * @Description:中介者模式：用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显示的相互引用，从而使其耦合松散，而且可以独立的改变他们之前的交互
 *
 *  中介者接口类
 */
public interface Mediator {
    /**
     * 给同事发消息
     * @param colleague
     * @param message
     */
    void sendMessageToColleague(Colleague colleague,String message);
}
