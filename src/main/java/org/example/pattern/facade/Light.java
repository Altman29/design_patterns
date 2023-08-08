package org.example.pattern.facade;

/**
 * 灯光类
 * 子系统角色
 */
public class Light {

    public void on() {
        System.out.println("打开灯光");
    }

    public void off() {
        System.out.println("关闭灯光");
    }
}
