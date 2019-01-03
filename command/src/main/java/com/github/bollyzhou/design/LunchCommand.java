package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/27
 * @Description:做午餐命令
 */
public class LunchCommand implements Command {
    //命令执行者
    private Receiver receiver;

    public LunchCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.makeLunch();
    }
}
