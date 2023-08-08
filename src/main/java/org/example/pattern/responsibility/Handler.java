package org.example.pattern.responsibility;

/**
 * 抽象处理者
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    //该领导处理的请假天数区间
    private int numStart;
    private int numEnd;

    //领导上面还有领导 声明后继者
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //设置上级领导对象
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //各级领导处理请假请求的方法
    protected abstract void handleLeave(LeaveRequest leaveRequest);

    //提交请假条
    public final void submit(LeaveRequest leaveRequest) {
        //如果当前领导能处理该请假条
        if (leaveRequest.getDays() >= this.numStart && leaveRequest.getDays() < this.numEnd) {
            this.handleLeave(leaveRequest);
        } else {
            //否则交给上级领导处理
            if (this.nextHandler != null) {
                this.nextHandler.submit(leaveRequest);
            } else {
                System.out.println("请假条不通过");
            }
        }
    }
}
