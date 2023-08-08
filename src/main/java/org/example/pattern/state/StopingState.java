package org.example.pattern.state;

/**
 * 电梯停止状态
 */
public class StopingState extends LiftState {
    @Override
    public void open() {
        //状态修改
        super.context.setLiftState(Context.OPENNING_STATE);
        //调用当前状态中的context中的open方法
        super.context.open();
    }

    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.CLOSING_STATE);
        //调用当前状态中的context中的close方法
        super.context.close();
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
        System.out.println("电梯停止了...");
    }
}
