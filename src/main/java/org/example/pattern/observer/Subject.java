package org.example.pattern.observer;

/**
 * 抽象主题角色类(被观察者)
 */
public interface Subject {
    //添加订阅者(添加观察者)
    void attach(Observer observer);

    //删除订阅者(删除观察者)
    void detach(Observer observer);

    //通知订阅者(通知观察者)
    void notify(String msg);
}
