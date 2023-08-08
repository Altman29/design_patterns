package org.example.pattern.state;

/**
 * 抽象电梯状态
 */
public abstract class LiftState {
    //声明环境角色类变量
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 电梯开门动作
     */
    public abstract void open();

    /**
     * 电梯关门动作
     */
    public abstract void close();

    /**
     * 电梯运行动作
     */
    public abstract void run();

    /**
     * 电梯停止动作
     */
    public abstract void stop();
}
