package org.example.principles.demo3.after;

/**
 * 硬盘接口
 */
public interface HardDisk {

    //存储数据的方法
    void save(String data);

    //获取数据的方法
    String get();
}
