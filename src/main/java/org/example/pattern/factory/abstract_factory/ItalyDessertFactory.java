package org.example.pattern.factory.abstract_factory;

/**
 * 意大利甜品工厂
 * 具体工厂类
 *  生产意大利风味的提拉米苏和拿铁咖啡
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
