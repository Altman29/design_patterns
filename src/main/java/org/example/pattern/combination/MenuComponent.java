package org.example.pattern.combination;

/**
 * 菜单组件
 * 抽象根节点
 */
public abstract class MenuComponent {

    //菜单组件名称
    protected String name;
    //菜单组件层级
    protected int level;

    //添加子菜单
    public void add(MenuComponent menuComponent) {
        //根节点不支持添加子菜单，抛出异常
        throw new UnsupportedOperationException();
    }

    //移除子菜单
    public void remove(MenuComponent menuComponent) {
        //根节点不支持移除子菜单，抛出异常
        throw new UnsupportedOperationException();
    }

    //获取子菜单
    public MenuComponent getChild(int i) {
        //根节点不支持获取子菜单，抛出异常
        throw new UnsupportedOperationException();
    }

    //获取菜单组件名称
    public String getName() {
        return name;
    }

    //打印菜单组件名称
    public abstract void print();
}
