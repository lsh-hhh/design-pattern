package behavior_memento_pattern.code.calculator;

import behavior_memento_pattern.code.calculator.command.AddCommand;
import behavior_memento_pattern.code.calculator.command.Command;
import behavior_memento_pattern.code.calculator.command.SubtractCommand;
import behavior_memento_pattern.code.calculator.memento.CommandCareTaker;
import behavior_memento_pattern.code.calculator.memento.Memento;

public class Calculator {

    private Integer res;

    public Integer getRes() {
        return res;
    }

    public Integer add(int x, int y, CommandCareTaker commandCareTaker) {
        AddCommand addCommand = new AddCommand(this);
        res = addCommand.execute(x, y);
        commandCareTaker.saveMemento(new Memento(addCommand));
        return res;
    }

    public Integer sub(int x, int y, CommandCareTaker commandCareTaker) {
        Command subCommand = new SubtractCommand(this);
        res = subCommand.execute(x, y);
        commandCareTaker.saveMemento(new Memento(subCommand));
        return res;
    }

    public Memento execute(int x, int y, Command command) {
        res = command.execute(x, y);
        return new Memento(command);
    }

    public void restore(Memento memento) {
        System.out.print("撤销上一个操作，calculator = ");
        res = memento.getCommand().getRes();
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "res=" + res +
                '}';
    }
}
