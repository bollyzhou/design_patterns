package com.github.bollyzhou.design;

import java.util.ArrayList;

/**
 * @Author: ZST
 * @Date: 2018/12/26
 * @Description:
 */
public class DemoTest {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.add("a");
        concreteAggregate.add("b");
        concreteAggregate.add("c");
        concreteAggregate.add("d");
        concreteAggregate.add("e");


        Iterator iterator = concreteAggregate.createIterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next.toString());
        }
    }
}
