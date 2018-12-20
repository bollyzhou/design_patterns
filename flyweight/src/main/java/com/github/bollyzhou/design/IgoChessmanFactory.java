package com.github.bollyzhou.design;

import java.util.Hashtable;

/**
 * @Author: ZST
 * @Date: 2018/12/20
 * @Description: 享元模式: 运用共享技术有效地支持大量细粒度的对象。
 *
 *     何时使用：
 *
 *      一个应用程序使用大量的对象，这些对象之间部分属性本质上是相同的，这时应使用享元来封装相同的部分。
 *      对象的多数状态都可变为外部状态，就可以考虑将这样的对象作为系统中发的享元来使用。
 *
 *
 *     优点:
 *      1、使用享元可以节省内存的开销，特别适合处理大量细粒度对象，这些对象的许多属性值是相同的，而且一旦创建则不允许修改。
 *      2、享元模式中的享元可以使用方法的参数接收外部状态中的数据，但外部状态数据不会干扰到享元中的内部数据，这就使享元可以在不同的环境中被共享。
 *      3、在JAVA语言中，String类型就是使用了享元模式。String对象是final类型，对象一旦创建就不可改变。在JAVA中字符串常量都是存在常量池中的，JAVA会确保一个字符串常量在常量池中只有一个拷贝。String str="string"，其中"str"就是一个字符串常量。
 *     缺点：
 *      享元模式使得系统更加复杂。为了使对象可以共享，需要将一些状态外部化，这使得程序的逻辑复杂化。享元模式将享元对象的状态外部化，而读取外部状态使得运行时间变长。
 *    
 *
 *     享元模式包括三种角色：
 *
 *      享元接口（Plyweight）：定义了对外公开的获取其内部数据和接收外部数据的方法。
 *      具体享元（Concrete Plyweight）：享元接口的实现。
 *      享元工厂（Plyweight Factory）：该类的实例负责创建和管理享元对象，用户或其他对象必须请求他以获取一个享元对象。
 *
 *
 *
 */
//围棋棋子工厂类：享元工厂类，使用单例模式进行设计
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht; //使用Hashtable来存储享元对象，充当享元池

    private IgoChessmanFactory() {
        ht = new Hashtable();
        IgoChessman black,white;
        black = new BlackIgoChessman();
        ht.put("b",black);
        white = new WhiteIgoChessman();
        ht.put("w",white);
    }

    //返回享元工厂类的唯一实例
    public static IgoChessmanFactory getInstance() {

        return instance;
    }

    //通过key来获取存储在Hashtable中的享元对象
    public IgoChessman getIgoChessman(String color) {

        return (IgoChessman)ht.get(color);
    }

    //获取最终创建的实例个数
    public int getIgoChessmanCount() {
        return ht.size();
    }
}
