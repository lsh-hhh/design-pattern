package struction_bridge_partner.code.order.handler;

import struction_bridge_partner.code.order.calculator.Calculator;

public abstract class AbstractHandler {

    protected Calculator calculator;

    public AbstractHandler(Calculator calculator) {
        this.calculator = calculator;
    }

    public abstract void handle();
}
