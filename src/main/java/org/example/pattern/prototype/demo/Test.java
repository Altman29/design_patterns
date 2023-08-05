package org.example.pattern.prototype.demo;

/**
 * 访问类
 *
 * 具体原型创建成功
 * 具体原型复制成功
 * 原型对象和克隆对象是否相同：false
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建原型对象
        Realizetype realizetype = new Realizetype();
        //调用 clone 方法创建克隆对象
        Realizetype clone = realizetype.clone();

        System.out.println("原型对象和克隆对象是否相同：" + (realizetype == clone));
    }
}
