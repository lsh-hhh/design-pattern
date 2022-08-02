package struction_bridge_pattern.code.order.calculator;

public class OnlineOrderCalculator implements Calculator{

    private String type;

    private Integer rate;

    public OnlineOrderCalculator() {
        initRule();
    }

    @Override
    public void initRule() {
        type = "onlineOrder";
        rate = 10;
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
