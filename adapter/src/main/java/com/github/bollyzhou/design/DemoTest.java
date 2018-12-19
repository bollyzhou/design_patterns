package com.github.bollyzhou.design;

import com.github.bollyzhou.design.intface.adapter.InterfaceAdapter;

public class DemoTest {
    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        int charge = classAdapter.charge();
        System.out.println("类适配器得到充电电压："+charge);


        ObjectAdapter objectAdapter = new ObjectAdapter(new Charged220V());
        int charge1 = objectAdapter.charge();
        System.out.println("对象的适配器模式充电电压："+charge1);

        InterfaceAdapter interfaceAdapter = new InterfaceAdapter();
        int charge2 = interfaceAdapter.chargeFor220V();
        System.out.println("接口适配器模式充电电压："+charge2);
    }

}
