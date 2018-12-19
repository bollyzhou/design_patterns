package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/19
 * @Description: 被观察者
 */
public interface Observerable {
    void addObserver(Observer observer);

    void delectObserver(Observer observer);

    void modifyMessage(String msg);
}
