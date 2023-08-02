package org.example.principles.demo1;

/**
 * 搜狗输入法
 */
public class SogouInput {

    //聚合
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }

}
