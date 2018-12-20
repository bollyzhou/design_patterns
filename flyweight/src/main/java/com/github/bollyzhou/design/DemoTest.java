package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/20
 * @Description:
 */
public class DemoTest {
    public static void main(String args[]) {
        IgoChessman black1,black2,black3,white1,white2;
        IgoChessmanFactory factory;

        //获取享元工厂对象
        factory = IgoChessmanFactory.getInstance();

        //通过享元工厂获取三颗黑子
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");


        //通过享元工厂获取两颗白子
        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");


        //显示棋子，同时设置棋子的坐标位置
        black1.display(new Coordinates(1,2));
        black2.display(new Coordinates(3,4));
        black3.display(new Coordinates(1,3));
        white1.display(new Coordinates(2,5));
        white2.display(new Coordinates(2,4));

        //获取最终的棋子数量
        int count = factory.getIgoChessmanCount();
        System.out.println("棋子数量："+count);
    }
}
