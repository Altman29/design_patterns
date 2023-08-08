package org.example.pattern.visit;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Visitor drawVisitor = new DrawVisitor();
        Visitor resizeVisitor = new ResizeVisitor();

        circle.accept(drawVisitor);
        rectangle.accept(drawVisitor);

        System.out.println("---------------");
        circle.accept(resizeVisitor);
        rectangle.accept(resizeVisitor);
    }
}
