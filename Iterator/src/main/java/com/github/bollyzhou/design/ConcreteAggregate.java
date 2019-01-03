package com.github.bollyzhou.design;

import java.util.ArrayList;

/**
 * @Author: ZST
 * @Date: 2018/12/26
 * @Description:
 */
public class ConcreteAggregate implements Aggregate {
    private Object[] song = new Object[100];
    private int index = 0;

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public void add(Object object) {
        song[index++] = object;
    }

    @Override
    public Object get(int index) {
        return song[index];
    }

    @Override
    public int getSize() {
        return index;
    }
}
