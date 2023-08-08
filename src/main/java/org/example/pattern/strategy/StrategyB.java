package org.example.pattern.strategy;

public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满100减10");
    }
}
