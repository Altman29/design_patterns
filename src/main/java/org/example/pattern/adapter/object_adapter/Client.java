package org.example.pattern.adapter.object_adapter;

public class Client {
    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        // 读取SD卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("=============");

        //对象适配器模式
        // 使用该计算机读取TF卡中的数据
        // 通过适配器类，将TF卡转换成SD卡的形式
        String s = computer.readSD(new SDAdapterTF(new TFCardImpl()));
        System.out.println(s);
    }
}
