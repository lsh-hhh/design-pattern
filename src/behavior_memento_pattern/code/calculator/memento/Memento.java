package behavior_memento_pattern.code.calculator.memento;

import behavior_memento_pattern.code.calculator.command.Command;

public class Memento {

    public Command command;

    public Memento(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}
