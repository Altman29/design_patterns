package org.example.pattern.responsibility;

/**
 * 部门经理
 */
public class Manager extends Handler {

    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" +
                leaveRequest.getDays() + "天，理由：" +
                leaveRequest.getReason());
        System.out.println("部门经理审批：同意");
    }
}
