package com.github.bollyzhou.design;
//具体装饰
public class AddHuoTui implements JianBing {
    private JianBing jianBing;
    public AddHuoTui(JianBing jianBing){
        this.jianBing = jianBing;
    }
    @Override
    public void make() {
        jianBing.make();
        System.out.println("加一个火腿肠。。。");

    }
}
