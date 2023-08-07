package org.example.pattern.proxy.cglib_proxy;

public class Client {
    public static void main(String[] args) {
        //获取代理对象
        //1.创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //2.使用factory对象的方法获取代理对象
        TransStation proxyObject = factory.getProxyInstance();
        //3.调用卖票方法
        proxyObject.sell();
    }
}
