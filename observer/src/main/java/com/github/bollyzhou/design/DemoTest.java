package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/19
 * @Description:
 */
public class DemoTest {
    public static void main(String[] args) {
        User zhangsan = new User();
        zhangsan.setName("张三");
        User lisi = new User();
        lisi.setName("李四");

        ActionPlay actionPlay = new ActionPlay();
        actionPlay.addObserver(zhangsan);
        actionPlay.addObserver(lisi);

        actionPlay.modifyMessage("左转");
        actionPlay.modifyMessage("右转");
        actionPlay.modifyMessage("后转");
    }
}
