package org.example.pattern.factory.abstract_factory;

/**
 * 测试类： 抽象工厂模式
 *
 * 如果要增加一个产品族的话，只需要增加一个具体工厂类和相应的具体产品类即可
 */
public class Test {
    public static void main(String[] args) {
        //创建的是意大利风味甜品工厂
        ItalyDessertFactory factory = new ItalyDessertFactory();
        //获取的是美式风味甜品工厂
//        AmericanDessertFactory factory = new AmericanDessertFactory();
        //获取拿铁咖啡和提拉米苏甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
        dessert.show();
    }

}
