package behavior_memento_pattern.code.calculator.command;

import behavior_memento_pattern.code.calculator.Calculator;

public class AddCommand extends AbstractCommand{

    public AddCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public Integer execute(int x, int y) {
        System.out.print("执行相加操作 ");
        return x + y;
    }
}
