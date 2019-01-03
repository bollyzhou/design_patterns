package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2019/1/3
 * @Description:
 */
public class NodeA implements Node {
    @Override
    public void accept(Visitor vistor) {
        vistor.visitor(this);
    }

    /**
     * NodeA特有的方法
     */
    public String operationA(){
        return "NodeA";
    }

}
