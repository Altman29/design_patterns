package org.example.pattern.bridge;

/**
 * avi视频文件类
 * 具体的实现化角色
 */
public class AVIFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
