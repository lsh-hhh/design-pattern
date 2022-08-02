package struction_decorator_pattern.code.milktea.decorator;

import struction_decorator_pattern.code.milktea.MilkTea;

import java.math.BigDecimal;

public abstract class AbstractDecorator implements MilkTea {

    protected MilkTea milkTea;

    protected BigDecimal worth;

    protected Integer nums;

    protected AdditiveEnum additive;

    public AbstractDecorator(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public void billPrint() {
        milkTea.billPrint();
        System.out.println(additive.getName() + "(" + additive.getPrice() + ") * " + nums );
    }

    public BigDecimal addSomething(Integer nums) {
        this.nums = nums;
        BigDecimal worth = milkTea.worth();
        // 加料值多少钱
        BigDecimal additiveWorth = additive.getPrice().multiply(BigDecimal.valueOf(nums));
        this.worth = worth.add(additiveWorth);
        return additiveWorth;
    }
}
