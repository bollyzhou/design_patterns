package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/27
 * @Description:命令模式--command 将一个请求封装为一个对象，从而使用户可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。
 *
 *     何时使用：
 *
 *     程序需要在不同的时刻指定、排列和执行请求。
 *     程序需要提供撤销操作。
 *
 *     优点：
 *
 *     1、在命令模式中，请求者（Invoker）不直接与接受者（Receiver）交互，及请求者（Invoker）不包含接受者（Receiver）的引用，因此彻底消除了彼此间的耦合。
 *     2、命令模式满足“开-闭原则”。如果增加新的具体命令和该命令的接受者，不必修改调用者的代码，调用者就可以使用新的命令对象；反之，如果增加新的调用者，不必修改现有具体命令和接收者，新增加的调用者就可以使用已有的具体命令。
 *     3、由于请求者的请求被封装到具体的命令中，那么就可以将具体命令保存到持久化的媒介中，在需要的时候，重新执行这个具体命令。因此，使用命令模式可以记录日志。
 *     4、使用命令模式可以对请求者的“请求”进行排队。每个请求都各自对应一个具体命令，因此可以按一定顺序执行这些具体命令。
 *
 *
 *
 * 命令类
 */
public interface Command {
    void execute();
}