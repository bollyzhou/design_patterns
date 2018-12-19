package com.github.bollyzhou.design;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZST
 * @Date: 2018/12/19
 * @Description:  具体被观察者类  观察者的容器
 *  将所有的观察者列表作为他的属性组合。
 *  有一个通用的遍历方法，将要改变的信息，通知给每一位观察者
 *
 *  根据指令做动作
 */
public class ActionPlay implements Observerable {
    private List<Observer> list;
    public ActionPlay(){
        list = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void delectObserver(Observer observer) {
        if(!list.isEmpty()){
            list.remove(observer);
        }
    }

    /**
     * 遍历观察者列表，将修改信息发送给每一个观察者
     * @param msg
     */
    @Override
    public void modifyMessage(String msg) {
        for (Observer observer: list) {
            observer.update(msg);
        }
    }
}
