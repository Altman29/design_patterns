package org.example.pattern.responsibility;

public class Client {
    public static void main(String[] args) {
        //创建请假请求
        LeaveRequest request = new LeaveRequest("小明", 5, "身体不适");

        //创建各级领导
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        //设置各级领导的上一级领导
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        //提交请假请求
        groupLeader.submit(request);
    }
}
