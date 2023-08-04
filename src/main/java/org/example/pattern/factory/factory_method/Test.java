package org.example.pattern.factory.factory_method;

public class Test {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
//        store.setFactory(new AmericanCoffeeFactory());
        store.setFactory(new LatteCoffeeFactory());
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
