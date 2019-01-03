package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/27
 * @Description:做早餐命令
 */
public class BreakFastCommand implements Command {
    //命令执行者
    private Receiver receiver;

    public BreakFastCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.makeBreakfast();
    }
}
