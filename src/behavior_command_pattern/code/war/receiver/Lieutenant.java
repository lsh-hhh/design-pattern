package behavior_command_pattern.code.war.receiver;

import behavior_command_pattern.code.war.command.Command;

public class Lieutenant {

    public void attack() {
        System.out.println("上尉发起攻击");
    }

    public void defense() {
        System.out.println("上尉挡住了攻击");
    }

}
