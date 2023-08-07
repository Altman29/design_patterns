package org.example.pattern.builder2.impl;

import org.example.pattern.builder2.Burger;

/**
 * 蔬菜汉堡
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.f;
    }
}
