package org.example.pattern.command;

import java.util.Map;

/**
 * 具体命令
 */
public class OrderCommand implements Command {

    //需要持有接收者的引用
    private Chief receiver;
    //持有订单
    private Order order;

    public OrderCommand(Chief receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单： ");
        Map<String, Integer> foodDir = order.getFoodDir();
        //遍历订单中的菜品及份数
        for (Map.Entry<String, Integer> entry : foodDir.entrySet()) {
            receiver.makeFood(entry.getKey(), entry.getValue());
        }
        System.out.println("订单完成");
    }
}
