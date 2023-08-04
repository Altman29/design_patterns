package org.example.pattern.factory.before;

public class Test {
    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        //创建对象
//        Coffee coffee = store.orderCoffee("latte");
        Coffee coffee = store.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
