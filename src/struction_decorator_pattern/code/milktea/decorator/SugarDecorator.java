package struction_decorator_pattern.code.milktea.decorator;

import struction_decorator_pattern.code.milktea.MilkTea;

import java.math.BigDecimal;

public class SugarDecorator extends AbstractDecorator{

    public SugarDecorator(MilkTea milkTea) {
        super(milkTea);
        additive = AdditiveEnum.SUGAR;
    }

    @Override
    public BigDecimal worth() {
        return worth;
    }

}
