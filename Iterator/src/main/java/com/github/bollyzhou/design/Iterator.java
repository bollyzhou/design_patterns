package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/26
 * @Description:迭代器接口
 */
public interface Iterator {

    /**
     * 获取下一个元素
     */
    Object next();

    /**
     * 是否到了最后一个元素
     * @return
     */
    boolean hasNext();


}
