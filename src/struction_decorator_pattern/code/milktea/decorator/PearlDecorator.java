package struction_decorator_pattern.code.milktea.decorator;

import struction_decorator_pattern.code.milktea.MilkTea;

import java.math.BigDecimal;

public class PearlDecorator extends AbstractDecorator{

    public PearlDecorator(MilkTea milkTea) {
        super(milkTea);
        additive = AdditiveEnum.PEARL;
    }

    @Override
    public BigDecimal worth() {
        return worth;
    }

}
