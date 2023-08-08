package org.example.pattern.state;

/**
 * 电梯关门状态
 */
public class ClosingState extends LiftState {
    @Override
    public void open() {
        //状态修改
        super.context.setLiftState(Context.OPENNING_STATE);
        //调用当前状态中的context中的open方法
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯关门...");
    }

    @Override
    public void run() {
        //状态修改
        super.context.setLiftState(Context.RUNNING_STATE);
        //调用当前状态中的context中的run方法
        super.context.run();
    }

    @Override
    public void stop() {
        //状态修改
        super.context.setLiftState(Context.STOPPING_STATE);
        //调用当前状态中的context中的stop方法
        super.context.stop();
    }
}
