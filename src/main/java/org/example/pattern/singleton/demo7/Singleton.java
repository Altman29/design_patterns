package org.example.pattern.singleton.demo7;

import java.io.Serializable;

/**
 * 静态内部类方式
 */
public class Singleton implements Serializable {
    //私有构造方法
    private Singleton() {
    }

    //定义一个静态内部类
    private static class SingletonHolder {
        //在内部类中声明并初始化外部类的对象,为了防止外部对它进行修改，加上final关键字
        //加final就是常量，常量大写
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
