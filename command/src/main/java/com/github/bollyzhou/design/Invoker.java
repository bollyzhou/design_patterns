package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/27
 * @Description:命令传送者
 */
public class Invoker {
    //需要传达的命令
    private Command command; //可换成用list进行记录，最后统一执行命令

    public void setCommand(Command command){
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void executeCommand(){
        command.execute();
    }

}
