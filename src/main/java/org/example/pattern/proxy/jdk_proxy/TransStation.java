package org.example.pattern.proxy.jdk_proxy;

/**
 * 火车站
 * 代理模式中的真实角色
 */
public class TransStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站售票");
    }
}
