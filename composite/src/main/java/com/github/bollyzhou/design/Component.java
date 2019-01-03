package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/20
 * @Description: compsite 组合模式 将对象组合成树形结构以表示“部分-整体”的层次结构。Composite使用户对单个对象和组合对象的使用具有一致性。
 *
 *     何时使用：
 *
 *     当想表示对象的部分-整体层次结构。
 *     希望用户用一致的方式处理个体对象和组合对象。
 *
 *     优点：
 *
 *     组合模式中包含个体对象和组合对象，并形成树形结构，使用户可以方便地处理个体对象和组合对象。
 *     组合对象和个体对象实现了相同的接口，用户一般无须区分个体对象和组合对象。
 *     当增加新的Composite节点和Leaf节点时，用户的重要代码不需要做出修改。
 *
 */
//抽象组件
public interface Component {
    void add(Component component);
    void remove(Component component);
    void display();
}
