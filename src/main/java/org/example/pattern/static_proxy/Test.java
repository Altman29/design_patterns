package org.example.pattern.static_proxy;

public class Test {
    public static void main(String[] args) {
        ProxyPoint sellTickets = new ProxyPoint();
        sellTickets.sell();
    }
}
