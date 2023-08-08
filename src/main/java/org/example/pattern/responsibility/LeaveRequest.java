package org.example.pattern.responsibility;

/**
 * 请假请求
 */
public class LeaveRequest {
    // 姓名
    private String name;
    // 请假天数
    private Integer days;
    // 请假原因
    private String reason;

    public LeaveRequest(String name, Integer days, String reason) {
        this.name = name;
        this.days = days;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public Integer getDays() {
        return days;
    }

    public String getReason() {
        return reason;
    }
}
