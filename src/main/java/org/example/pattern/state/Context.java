package org.example.pattern.state;

/**
 * 环境角色类
 */
public class Context {

    //定义出所有的电梯状态
    public final static OpeningState OPENNING_STATE = new OpeningState();
    public final static ClosingState CLOSING_STATE = new ClosingState();
    public final static RunningState RUNNING_STATE = new RunningState();
    public final static StopingState STOPPING_STATE = new StopingState();

    //定义一个当前电梯状态
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    //设置当前电梯状态
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //把当前的状态中的Context(环境)对象
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
