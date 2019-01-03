package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2019/1/3
 * @Description:
 */
public class NodeB implements Node {
    @Override
    public void accept(Visitor vistor) {
        vistor.visitor(this);
    }

    /**
     * NodeA特有的方法
     */
    public String operationB(){
        return "NodeB";
    }

}
