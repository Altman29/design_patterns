package org.example.pattern.combination;

public class Client {
    public static void main(String[] args) {
        //创建菜单树
        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("展开菜单", 3));
        menu1.add(new MenuItem("编辑菜单", 3));
        menu1.add(new MenuItem("删除菜单", 3));
        menu1.add(new MenuItem("新增菜单", 3));



        MenuComponent menu2 = new Menu("权限管理", 2);
        menu2.add(new MenuItem("角色授权", 3));
        menu2.add(new MenuItem("修改密码", 3));

        MenuComponent menu3 = new Menu("角色管理", 2);
        menu3.add(new MenuItem("页面访问", 3));
        menu3.add(new MenuItem("提交保存", 3));


        System.out.println("===== 从根节点开始遍历菜单树 =====");
        menu2.print();
    }
}
