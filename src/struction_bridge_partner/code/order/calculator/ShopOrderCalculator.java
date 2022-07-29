package struction_bridge_partner.code.order.calculator;

public class ShopOrderCalculator implements Calculator{

    private String type;

    private Integer rate;

    public ShopOrderCalculator() {
        initRule();
    }

    @Override
    public void initRule() {
        type = "shopOrder";
        rate = 20;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Integer getRate() {
        return rate;
    }
}
