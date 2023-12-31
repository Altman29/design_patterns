package org.example.pattern.factory.simple_factory;

/**
 * 简单工厂模式
 * 简单咖啡工厂类，用来生成咖啡对象
 */
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您点的咖啡没有");
        }
        return coffee;
    }
}
