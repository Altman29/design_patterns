package org.example.pattern.facade;

public class Client {
    public static void main(String[] args) {
        //创建智能对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        //控制家电
        facade.say("打开");
        System.out.println("-----------------------");
        facade.say("关闭");
    }
}
