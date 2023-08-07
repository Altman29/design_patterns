package org.example.pattern.builder2;

/**
 * 实现Packing 接口的实体类
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
