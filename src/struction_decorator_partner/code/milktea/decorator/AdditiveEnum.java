package struction_decorator_partner.code.milktea.decorator;

import java.math.BigDecimal;

public enum AdditiveEnum {

    GRAPE("葡萄干", BigDecimal.valueOf(0.5)),
    PEARL("珍珠", BigDecimal.valueOf(0.3)),
    SUGAR("白糖", BigDecimal.valueOf(0.2)),
    ;

    AdditiveEnum(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    private final String name;

    private final BigDecimal price;

    public String getName() {
        return name;
    }


    public BigDecimal getPrice() {
        return price;
    }
}
