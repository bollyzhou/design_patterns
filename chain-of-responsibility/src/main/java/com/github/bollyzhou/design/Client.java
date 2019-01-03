package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/27
 * @Description: 测试
 */
public class Client {
    public static void main(String[] args) {
        Handle1 handle1 = new Handle1();
        Handle2 handle2 = new Handle2();
        Handle3 handle3 = new Handle3();

        handle1.setNextHandle(handle2);
        handle2.setNextHandle(handle3);

        handle1.doHandle();
    }
}
