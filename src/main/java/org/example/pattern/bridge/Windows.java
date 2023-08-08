package org.example.pattern.bridge;

/**
 * 操作系统类windows
 * 具体的抽象化角色
 */
public class Windows extends OperatingSystem {
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
