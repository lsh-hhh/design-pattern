package struction_bridge_pattern.code.order.handler;

import struction_bridge_pattern.code.order.calculator.Calculator;

public abstract class AbstractHandler {

    protected Calculator calculator;

    public AbstractHandler(Calculator calculator) {
        this.calculator = calculator;
    }

    public abstract void handle();
}
