package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2019/1/3
 * @Description:
 */
public interface Visitor {
    void visitor(NodeA node);
    void visitor(NodeB node);
}
