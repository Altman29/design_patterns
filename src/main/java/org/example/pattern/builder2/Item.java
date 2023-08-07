package org.example.pattern.builder2;

/**
 * 表示食物条目的接口
 */
public interface Item {
     String name();

    Packing packing();

    float price();

}
