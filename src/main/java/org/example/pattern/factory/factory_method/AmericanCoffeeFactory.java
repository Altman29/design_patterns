package org.example.pattern.factory.factory_method;

/**
 * 美式咖啡工厂，专门用来生产美式咖啡
 * 具体工厂角色
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
