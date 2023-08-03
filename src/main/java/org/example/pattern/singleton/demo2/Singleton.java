package org.example.pattern.singleton.demo2;

/**
 * 单例模式
 *  饿汉式-静态代码块方式
 *
 *  和方式一一样，只不过将创建对象的代码放到了静态代码块中
 */
public class Singleton {
    //1.私有构造方法
    private Singleton(){}

    //2.创建本类对象
    private static Singleton instance; // null

    static { // 在静态代码块中，创建单例对象
        instance = new Singleton();
    }

    //3.提供公共的静态方法，让外界获取本类对象
    public static Singleton getInstance(){
        return instance;
    }
}
