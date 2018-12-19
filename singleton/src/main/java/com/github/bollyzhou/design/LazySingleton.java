package com.github.bollyzhou.design;

/**
 * @Author: ZST
 * @Date: 2018/12/19
 * @Description: 懒汉式单例模式（双重检查）
 *
 */
public class LazySingleton {
    private volatile static LazySingleton lazySingleton = null;
    //构造参数私有化
    private LazySingleton(){

    }
    public LazySingleton getLazySingleton(){
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                    return new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
