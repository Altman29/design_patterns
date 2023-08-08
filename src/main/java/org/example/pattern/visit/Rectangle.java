package org.example.pattern.visit;

public class Rectangle implements Shape{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
