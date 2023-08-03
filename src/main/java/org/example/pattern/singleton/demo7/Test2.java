package org.example.pattern.singleton.demo7;

import java.lang.reflect.Constructor;

/**
 * 测试通过反射的方式，破坏单例模式
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        //1.获取Singleton对象的字节码对象
        Class<Singleton> clazz = Singleton.class;
        //2.通过反射获取对象
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        //3.设置暴力访问,取消访问权限检查
        constructor.setAccessible(true);
        //4.创建对象
        Singleton singleton = constructor.newInstance();
        Singleton singleton1 = constructor.newInstance();

        System.out.println(singleton);
        System.out.println(singleton1);

        /**
         * org.example.pattern.singleton.demo7.Singleton@5e2de80c
         * org.example.pattern.singleton.demo7.Singleton@1d44bcfa
         * 单例模式被破坏了，俩次获取的对象地址不一样
         */
    }
}
