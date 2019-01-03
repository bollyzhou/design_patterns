package com.github.bollyzhou.design;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZST
 * @Date: 2019/1/3
 * @Description:
 */
public class ObjectStructure {
    List<Node> nodeList = new ArrayList<>();
    void addNode(Node node){
        nodeList.add(node);
    }

    void acceptVisitor(Visitor visitor){
        for (Node node : nodeList){
            node.accept(visitor);
        }
    }
}
