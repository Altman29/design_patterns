package org.example.pattern.visit;

public class ResizeVisitor implements Visitor{
    @Override
    public void visit(Circle circle) {
        System.out.println("resize circle");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("resize rectangle");
    }
}
