package org.example.pattern.prototype.test;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建原型对象
        Citation citation = new Citation();
        //克隆奖状对象
        Citation citation1 = citation.clone();

        citation.setName("张三");
        citation1.setName("李四");

        citation.show();
        citation1.show();
    }
}
