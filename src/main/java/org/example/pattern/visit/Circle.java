package org.example.pattern.visit;

public class Circle implements Shape{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
