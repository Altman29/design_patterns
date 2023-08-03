package org.example.pattern.singleton.demo3;

/**
 * 单例模式
 * 懒汉式
 *  线程不安全
 *  线程安全，在getInstance方法上加synchronized关键字
 */
public class Singleton {
    //私有构造方法
    private Singleton() {
    }

    //声明Singleton类型的变量instance
    private static Singleton instance;

    //提供公共的静态方法，返回该类的实例
    //线程不安全
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
