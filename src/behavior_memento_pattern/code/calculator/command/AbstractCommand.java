package behavior_memento_pattern.code.calculator.command;

import behavior_memento_pattern.code.calculator.Calculator;

public abstract class AbstractCommand implements Command{

    protected Calculator calculator;

    private Integer res;

    public AbstractCommand(Calculator calculator) {
        this.calculator = calculator;
        this.res = calculator.getRes();
    }

    public Integer getRes() {
        return res;
    }
}
