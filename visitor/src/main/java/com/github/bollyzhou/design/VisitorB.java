package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2019/1/3
 * @Description:
 */
public class VisitorB implements Visitor {
    @Override
    public void visitor(NodeA node) {
        System.out.println("VisitorB 访问："+node.operationA());
    }

    @Override
    public void visitor(NodeB node) {
        System.out.println("VisitorB 访问："+node.operationB());
    }
}
