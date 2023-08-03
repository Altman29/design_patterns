package org.example.principles.demo4.before;

/**
 * 测试类
 * 如果现在想要新的品牌的安全门，比如海尔品牌的安全门，
 * 只想要防水和防盗功能，不想要防火功能，被迫实现了防火功能，
 * 那么就需要修改代码，违反了接口隔离原则
 */
public class Test {
    public static void main(String[] args) {
        SafetyDoor door = new HeimaSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
