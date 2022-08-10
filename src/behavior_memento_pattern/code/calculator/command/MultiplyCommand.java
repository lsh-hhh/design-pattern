package behavior_memento_pattern.code.calculator.command;

import behavior_memento_pattern.code.calculator.Calculator;

public class MultiplyCommand extends AbstractCommand {

    public MultiplyCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public Integer execute(int x, int y) {
        System.out.print("执行相乘操作 ");
        return x * y;
    }
}
