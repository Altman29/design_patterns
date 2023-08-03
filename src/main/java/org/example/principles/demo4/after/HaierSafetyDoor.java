package org.example.principles.demo4.after;

/**
 * 海尔安全门
 * 实现防盗接口和防水接口，不需要被迫实现防火功能
 */
public class HaierSafetyDoor implements AntiTheft, WaterProof{

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
