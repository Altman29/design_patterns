package org.example.pattern.prototype.demo;

/**
 * 具体原型类
 * 实现抽象原型类的 clone() 方法，它是可被复制的对象
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("具体原型创建成功");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Realizetype) super.clone();
    }
}
