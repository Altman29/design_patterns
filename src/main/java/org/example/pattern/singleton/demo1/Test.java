package org.example.pattern.singleton.demo1;

public class Test {
    public static void main(String[] args) {
        //创建Singleton类的对象
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2);
        /*
        org.example.pattern.singleton.demo1.Singleton@5e2de80c
        org.example.pattern.singleton.demo1.Singleton@5e2de80c
        可以看到俩个对象的地址是一样的，说明是同一个对象
         */
    }
}
