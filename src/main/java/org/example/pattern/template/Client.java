package org.example.pattern.template;

public class Client {
    public static void main(String[] args) {
        //炒包菜
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();
        System.out.println("-----------------------");
        //炒菜心
        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}
