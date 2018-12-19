package com.github.bollyzhou.design;
//具体装饰
public class AddEgg implements JianBing {
    private JianBing jianBing;
    public AddEgg(JianBing jianBing){
        this.jianBing = jianBing;
    }

    @Override
    public void make() {
        jianBing.make();
        System.out.println("加个鸡蛋");
    }
}
