package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/26
 * @Description:聚合类接口
 */
public interface Aggregate {
    public Iterator createIterator();
    public void add(Object object);
    public Object get(int index);
    public int getSize();
}
