package behavior_command_pattern.code.war;

import behavior_command_pattern.code.war.command.Command;

import java.util.ArrayList;
import java.util.List;

public class General {

    private final List<Command> commands = new ArrayList<>();

    public void clearCommand() {
        commands.clear();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommand() {
        commands.forEach(Command::execute);
    }
}
