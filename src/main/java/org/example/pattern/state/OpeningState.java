package org.example.pattern.state;

/**
 * 电梯开门状态
 */
public class OpeningState extends LiftState {
    //当前状态要执行的方法
    @Override
    public void open() {
        System.out.println("电梯开门...");
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
        //do nothing
    }

    @Override
    public void stop() {
        //do nothing
    }
}
