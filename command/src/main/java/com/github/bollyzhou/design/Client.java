package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/27
 * @Description:命令发出者
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        BreakFastCommand breakFastCommand = new BreakFastCommand(receiver);
        LunchCommand lunchCommand = new LunchCommand(receiver);
        DinnerCommand dinnerCommand = new DinnerCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(breakFastCommand);
        invoker.executeCommand();

        invoker.setCommand(lunchCommand);
        invoker.executeCommand();

        invoker.setCommand(dinnerCommand);
        invoker.executeCommand();


    }
}
