package org.example.pattern.factory.abstract_factory;

/**
 * 美式甜品工厂
 * 具体工厂类
 * 生产美式咖啡和抹茶慕斯
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchMousse();
    }
}
