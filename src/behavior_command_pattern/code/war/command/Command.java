package behavior_command_pattern.code.war.command;

public abstract class Command {

    protected String content;

    public Command(String content) {
        this.content = content;
    }

    public abstract void execute();
}
