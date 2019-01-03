package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/27
 * @Description:做晚餐命令
 */
public class DinnerCommand implements Command {
    //命令执行者
    private Receiver receiver;

    public DinnerCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.makeDinner();
    }
}
