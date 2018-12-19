package com.github.bollyzhou.design;
//具体被装饰角色
public class MakeBing implements JianBing {
    @Override
    public void make() {
        System.out.println("做好了一个饼。。");
    }
}
