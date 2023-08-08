package org.example.pattern.bridge;

/**
 * 操作系统类
 * 抽象化角色
 */
public abstract class OperatingSystem {
    // 声明实现化角色
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    // 调用实现化角色的接口方法
    public abstract void play(String fileName);
}
