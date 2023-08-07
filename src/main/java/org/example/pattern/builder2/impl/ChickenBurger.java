package org.example.pattern.builder2.impl;

import org.example.pattern.builder2.Burger;

/**
 * 鸡肉汉堡
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.1f;
    }
}
