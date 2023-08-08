package org.example.pattern.responsibility;

/**
 * 总经理
 */
public class GeneralManager extends Handler {

    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" +
                leaveRequest.getDays() + "天，理由：" +
                leaveRequest.getReason());
        System.out.println("总经理审批：同意");
    }
}
