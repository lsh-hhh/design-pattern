package struction_decorator_pattner.code.milktea.decorator;

import struction_decorator_pattner.code.milktea.MilkTea;

import java.math.BigDecimal;

public class GrapeDecorator extends AbstractDecorator{

    public GrapeDecorator(MilkTea milkTea) {
        super(milkTea);
        additive = AdditiveEnum.GRAPE;
    }

    @Override
    public BigDecimal worth() {
        return worth;
    }

}
