package org.example.pattern.proxy.static_proxy;

/**
 * 代售点
 * 代理模式中的代理角色
 */
public class ProxyPoint implements SellTickets {

    //聚合火车站对象
    private TransStation transStation = new TransStation();

    @Override
    public void sell() {
        System.out.println("代售点售票，收取一定的服务费用");//增强功能
        transStation.sell();
    }
}
