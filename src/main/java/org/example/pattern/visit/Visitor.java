package org.example.pattern.visit;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
