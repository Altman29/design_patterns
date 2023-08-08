package org.example.pattern.class_adapter;

/**
 * 适配器类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("adapter read TF card ");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write TF card ");
        writeTF(msg);
    }
}
