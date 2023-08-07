package org.example.pattern.builder2.builder;

import org.example.pattern.builder2.impl.ChickenBurger;
import org.example.pattern.builder2.impl.Coke;
import org.example.pattern.builder2.impl.Pepsi;
import org.example.pattern.builder2.impl.VegBurger;
import org.example.pattern.builder2.meal.Meal;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
