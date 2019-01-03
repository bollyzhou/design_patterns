package com.githit.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/26
 * @Description:
 */
public class DemoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("on");
        System.out.println(originator.getState());
        Caretaker caretaker = new Caretaker(originator.saveMemerto());
        originator.setState("off");
        System.out.println(originator.getState());
        originator.recover(caretaker.getMemento());

        System.out.println(originator.getState());
    }
}
