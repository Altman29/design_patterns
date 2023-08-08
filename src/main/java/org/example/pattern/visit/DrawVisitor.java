package org.example.pattern.visit;

public class DrawVisitor implements Visitor{
    @Override
    public void visit(Circle circle) {
        System.out.println("draw circle");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("draw rectangle");
    }
}
