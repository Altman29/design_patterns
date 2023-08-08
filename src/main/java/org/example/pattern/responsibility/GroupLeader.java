package org.example.pattern.responsibility;

/**
 * 组长
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" +
                leaveRequest.getDays() + "天，理由：" +
                leaveRequest.getReason());
        System.out.println("组长审批：同意");
    }
}
