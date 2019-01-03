package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/21
 * @Description:
 */
public class DemoTest {
    public static void main(String[] args) {
        Component root = new Folder("root");
        Component java = new Folder("java");
        Component C = new Folder("C");
        File test = new File("test");

        Component spring = new Folder("spring");
        Component spring1 = new Folder("spring1");
        java.add(spring);
        java.add(spring1);
        spring.add(test);
        C.add(test);

        root.add(java);
        root.add(C);

        root.display();


    }
}
