package com.github.bollyzhou.design;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZST
 * @Date: 2018/12/21
 * @Description: 节点类
 */
public class Folder implements Component {

    private String name;
    List<Component> list;

    public Folder(String name){
        this.name = name;
        list = new ArrayList<>();
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        if(!list.isEmpty()){
            list.remove(component);
        }
    }

    @Override
    public void display() {
        System.out.println("folder:"+this.name);
        for(Component component:list){
            if(component instanceof File){
                component.display();
            }else {
                if(null != component){
                    component.display();
                }
            }
        }
    }
}
