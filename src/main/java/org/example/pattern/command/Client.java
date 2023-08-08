package org.example.pattern.command;

public class Client {
    public static void main(String[] args) {
        //创建订单1
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面", 1);
        order1.setFood("小杯可乐", 2);


        //创建订单2
        Order order2 = new Order();
        order2.setDiningTable(3);
        order2.setFood("尖椒肉丝盖饭", 1);
        order2.setFood("小杯雪碧", 1);

        //创建厨师
        Chief chief = new Chief();

        //创建命令对象
        Command command1 = new OrderCommand(chief, order1);
        Command command2 = new OrderCommand(chief, order2);

        //创建服务员(调用者)
        Waitor waitor = new Waitor();
        waitor.setCommand(command1);
        waitor.setCommand(command2);

        waitor.orderUp();

    }
}
