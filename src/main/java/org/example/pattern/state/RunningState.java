package org.example.pattern.state;

/**
 * 电梯运行状态
 */
public class RunningState extends LiftState {
    @Override
    public void open() {
        //do nothing
    }

    @Override
    public void close() {
        //do nothing
    }

    @Override
    public void run() {
        System.out.println("电梯正在运行...");
    }

    @Override
    public void stop() {
        //状态修改
        super.context.setLiftState(Context.STOPPING_STATE);
        //调用当前状态中的context中的stop方法
        super.context.stop();
    }
}
