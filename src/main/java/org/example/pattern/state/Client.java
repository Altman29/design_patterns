package org.example.pattern.state;

public class Client {
    public static void main(String[] args) {
        //创建环境角色类
        Context context = new Context();

        //设置电梯初始状态
        context.setLiftState(Context.RUNNING_STATE);

        //电梯开门
        context.open();
        //电梯关门
        context.close();
        //电梯运行
        context.run();
        //电梯停止
        context.stop();
    }
}
