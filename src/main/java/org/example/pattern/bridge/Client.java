package org.example.pattern.bridge;

public class Client {
    public static void main(String[] args) {
        // 创建操作系统对象
        OperatingSystem os = new Mac(new RMVBFile());
        // 调用操作系统对象的方法
        os.play("战狼2");
    }
}
