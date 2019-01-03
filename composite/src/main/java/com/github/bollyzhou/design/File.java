package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/21
 * @Description: 文件类
 */
public class File implements Component {
    private String name;
    public File(String name){
        this.name = name;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void display() {
        System.out.println("File:"+name);
    }
}
