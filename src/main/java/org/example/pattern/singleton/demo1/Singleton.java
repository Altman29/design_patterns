package org.example.pattern.singleton.demo1;

/**
 * 单例模式
 *  饿汉式-静态成员变量方式
 */
public class Singleton {
    //1.私有构造方法
    private Singleton(){}

    //2.创建本类对象
    private static Singleton instance = new Singleton();

    //3.提供公共的静态方法，让外界获取本类对象
    public static Singleton getInstance(){
        return instance;
    }
}



