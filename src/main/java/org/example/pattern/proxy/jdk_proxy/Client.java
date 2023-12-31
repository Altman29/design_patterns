package org.example.pattern.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        //获取代理对象
        //1.创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //2.使用factory对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyInstance();
        //3.调用卖票方法
        proxyObject.sell();
    }
}
