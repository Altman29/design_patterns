package org.example.pattern.bridge;

/**
 * rmvb视频文件类
 * 具体的实现化角色
 */
public class RMVBFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件：" + fileName);
    }
}
