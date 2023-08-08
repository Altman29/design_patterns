package org.example.pattern.class_adapter;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello word SDCard";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
