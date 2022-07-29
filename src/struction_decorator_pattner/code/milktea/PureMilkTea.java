package struction_decorator_pattner.code.milktea;

import java.math.BigDecimal;

public class PureMilkTea implements MilkTea {

    private BigDecimal worth = BigDecimal.TEN;

    @Override
    public BigDecimal worth() {
        return worth;
    }

    @Override
    public void billPrint() {
        System.out.println("一杯无添加奶茶，单价：" + worth);
    }
}
