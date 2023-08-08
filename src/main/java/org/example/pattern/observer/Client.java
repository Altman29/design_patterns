package org.example.pattern.observer;

public class Client {
    public static void main(String[] args) {
        //创建微信公众号
        SubscriptionSubject subject = new SubscriptionSubject();

        //订阅公众号
        subject.attach(new WeiXinUser("张三"));
        subject.attach(new WeiXinUser("李四"));
        subject.attach(new WeiXinUser("王五"));

        //公众号更新发出消息给订阅的微信用户
        subject.notify("PHP是世界上最好用的语言！");
    }
}
