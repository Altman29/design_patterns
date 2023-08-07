package org.example.pattern.proxy.static_proxy;

public class Test {
    public static void main(String[] args) {
        ProxyPoint sellTickets = new ProxyPoint();
        sellTickets.sell();
    }
}
