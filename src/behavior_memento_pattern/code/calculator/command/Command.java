package behavior_memento_pattern.code.calculator.command;

public interface Command {

    Integer execute(int x, int y);

    Integer getRes();
}
