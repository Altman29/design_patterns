package org.example.pattern.factory.config_factory;

/**
 * 测试类
 *  静态工厂加配置文件实现解耦
 */
public class Test {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american1");
        System.out.println(coffee.getName());
        System.out.println("==============");
//        Coffee latte = CoffeeFactory.createCoffee("latte");
//        System.out.println(latte.getName());
    }
}
