package org.example.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员
 * 调用者角色
 */
public class Waitor {
    // 持有命令对象
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        commands.add(command);
    }

    // 发送命令
    public void orderUp() {
        System.out.println("服务员通知厨师做菜");
        for (Command command : commands) {
            if (command != null)
                command.execute();
        }
    }

}
