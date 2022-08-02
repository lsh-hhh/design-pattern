package behavior_command_pattern.code.war.command;

import behavior_command_pattern.code.war.receiver.Lieutenant;

public class DefenseCommand implements Command{

    private Lieutenant lieutenant;
    public DefenseCommand(Lieutenant lieutenant) {
        this.lieutenant = lieutenant;
    }

    @Override
    public void execute() {
        lieutenant.defense();
    }

}
