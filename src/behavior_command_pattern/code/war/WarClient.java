package behavior_command_pattern.code.war;

import behavior_command_pattern.code.war.command.AttackCommand;
import behavior_command_pattern.code.war.command.DefenseCommand;
import behavior_command_pattern.code.war.receiver.Lieutenant;
import behavior_command_pattern.code.war.receiver.Soldier;

/**
 * 可以看到命令模式有4个参与角色
 *
 * Command
 * 是一个接口，定义一个命令
 *
 * ConcreteCommand
 * 具体的执行命令，他们需要实现Command接口
 *
 * Receiver
 * 真正执行命令的角色，那些具体的命令引用它，让它完成命令的执行
 *
 * Invoker
 * 负责按照客户端的指令设置并执行命令，像命令的撤销，日志的记录等功能都要在此类中完成
 */
public class WarClient {

    public static void main(String[] args) {

        General general = new General();
        general.addCommand(new AttackCommand(new Soldier()));

//        general.executeCommand();
//        general.clearCommand();

        general.addCommand(new DefenseCommand(new Lieutenant()));

        general.executeCommand();

    }
}
