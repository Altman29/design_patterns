package org.example.pattern.factory.factory_method;

/**
 * 拿铁咖啡工厂，专门用来生产拿铁咖啡
 * 具体工厂角色
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
