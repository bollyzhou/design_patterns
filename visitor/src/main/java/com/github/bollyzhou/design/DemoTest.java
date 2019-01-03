package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2019/1/3
 * @Description:
 */
public class DemoTest {
    public static void main(String[] args) {
        ObjectStructure obstr = new ObjectStructure();
        NodeA nodeA = new NodeA();
        NodeB nodeB = new NodeB();

        obstr.addNode(nodeA);
        obstr.addNode(nodeB);

        Visitor visitorA = new VisitorA();
        obstr.acceptVisitor(visitorA);
        System.out.println("==================");
        VisitorB visitorB = new VisitorB();
        obstr.acceptVisitor(visitorB);
    }
}
