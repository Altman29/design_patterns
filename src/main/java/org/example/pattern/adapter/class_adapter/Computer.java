package org.example.pattern.adapter.class_adapter;

/**
 * 电脑
 *  电脑只能读取SD卡
 */
public class Computer {
    //从SD卡中读取数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
}
