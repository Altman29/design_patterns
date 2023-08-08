package org.example.pattern.combination;

import java.util.ArrayList;

/**
 * 菜单类
 * 树枝节点
 */
public class Menu extends MenuComponent {
    //菜单可以有多个子菜单或者菜单项
    //这里使用ArrayList来存储子菜单和菜单项
    private ArrayList<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public void print() {
        //打印菜单名称
        System.out.println("菜单名称：" + name);
        //打印子菜单或者菜单项名称
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
