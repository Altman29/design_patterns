package org.example.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题角色类(被观察者)
 */
public class SubscriptionSubject implements Subject {
    //定义一个集合，用来存储所有的观察者对象
    private List<Observer> weixinUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String msg) {
        for (Observer observer : weixinUserList) {
            observer.update(msg);
        }
    }
}
