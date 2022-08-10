package behavior_memento_pattern.code.calculator.command;

import behavior_memento_pattern.code.calculator.Calculator;

public class SubtractCommand extends AbstractCommand {

    public SubtractCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public Integer execute(int x, int y) {
        System.out.print("执行相减操作 ");
        return x - y;
    }
}
