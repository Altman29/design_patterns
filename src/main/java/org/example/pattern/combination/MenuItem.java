package org.example.pattern.combination;

/**
 * 菜单项
 * 叶子节点
 */
public class MenuItem extends MenuComponent {
    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        System.out.println("菜单项名称：" + name);
    }
}
