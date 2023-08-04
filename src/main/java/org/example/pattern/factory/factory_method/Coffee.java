package org.example.pattern.factory.factory_method;

/**
 * 咖啡类
 * 抽象产品角色
 */
public abstract class Coffee {

    public abstract String getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}
