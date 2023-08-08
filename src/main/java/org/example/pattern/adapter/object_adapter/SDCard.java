package org.example.pattern.adapter.object_adapter;

/**
 * SD卡
 * 目标接口
 */
public interface SDCard {
    // 读取SD卡方法
    public String readSD();

    // 写入SD卡功能
    public void writeSD(String msg);
}
