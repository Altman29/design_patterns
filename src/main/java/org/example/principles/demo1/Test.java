package org.example.principles.demo1;

/**
 * 测试类：开闭原则的体现
 * 开闭原则：对扩展开放，对修改关闭
 * 现在尽量不要去修改原来的代码，而是通过扩展的方式来实现新的功能，加一个皮肤A，
 * 只需要增加一个皮肤A的类继承AbstractSkin即可，不需要修改原来的代码
 */
public class Test {
    public static void main(String[] args) {
        SogouInput sogouInput = new SogouInput();
//        sogouInput.setSkin(new DefaultSkin());
        sogouInput.setSkin(new HeimaSkin());
        sogouInput.display();
    }
}
