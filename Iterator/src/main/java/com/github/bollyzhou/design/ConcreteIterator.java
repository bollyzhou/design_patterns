package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/26
 * @Description:
 */
public class ConcreteIterator implements Iterator {

    private Aggregate aggregate;
    private int count = 0;
    public ConcreteIterator(Aggregate aggregate){
        this.aggregate = aggregate;
    }

    /**
     * 移动到下一个元素
     */
    @Override
    public Object next() {
        Object obj = aggregate.get(count);
        count++;
        return obj;
    }

    /**
     * 是否到了最后一个元素
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        return count != aggregate.getSize();
    }

}
