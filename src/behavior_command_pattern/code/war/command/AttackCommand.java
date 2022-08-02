package behavior_command_pattern.code.war.command;

public class AttackCommand extends Command{

    public AttackCommand(String content) {
        super(content);
    }

    @Override
    public void execute() {

        System.out.println("全军出击：" + content);
    }
}
