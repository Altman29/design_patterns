package org.example.pattern.adapter.object_adapter;

/**
 * TF卡
 * 被适配者接口
 */
public interface TFCard {

    // 读取TF卡方法
    public String readTF();

    // 写入TF卡功能
    public void writeTF(String msg);
}
