package org.example.pattern.strategy;

public class Client {
    public static void main(String[] args) {
        //春节来了，使用春节促销活动
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
        System.out.println("-----------------------");
        //中秋节来了，使用中秋节促销活动
        salesMan = new SalesMan(new StrategyB());
        salesMan.salesManShow();
        System.out.println("-----------------------");
        //国庆节来了，使用国庆节促销活动
        salesMan = new SalesMan(new StrategyC());
        salesMan.salesManShow();


    }
}
