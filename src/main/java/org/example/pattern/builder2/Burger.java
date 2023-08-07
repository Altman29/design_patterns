package org.example.pattern.builder2;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
