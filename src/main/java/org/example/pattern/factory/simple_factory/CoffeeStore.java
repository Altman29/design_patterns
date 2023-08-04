package org.example.pattern.factory.simple_factory;


/**
 * 咖啡店
 * 简单工厂模式 改进
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        //调用生成咖啡的方法
        Coffee coffee = factory.createCoffee(type);

        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
