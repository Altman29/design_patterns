package org.example.pattern.singleton.demo4;

/**
 * 单例模式
 * 懒汉式 双重检查锁方式
 */
public class Singleton {

    //私有构造方法
    private Singleton() {
    }

    //声明Singleton类型的变量instance
    //volatile关键字保证，当instance变量被初始化成Singleton实例时，多个线程可以正确处理instance变量
    private static volatile Singleton instance;

    //对外提供公共的访问方式
    public static Singleton getInstance() {
        //第一次判断，如果instance不为null，不需要抢占锁，直接返回对象
        if (instance == null) {
            //抢占锁
            synchronized (Singleton.class) {
                //第二次判断，如果instance仍然为null，才创建对象
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
