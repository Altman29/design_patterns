package org.example.pattern.singleton.demo2;

public class Test {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
        /**
         * true
         * 说明是同一个对象
         */
    }
}
