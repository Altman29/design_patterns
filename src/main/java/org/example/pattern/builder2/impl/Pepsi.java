package org.example.pattern.builder2.impl;

import org.example.pattern.builder2.ColdDrink;

/**
 * 百事可乐
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 32.f;
    }
}
