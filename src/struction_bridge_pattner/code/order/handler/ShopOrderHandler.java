package struction_bridge_pattner.code.order.handler;

import struction_bridge_pattner.code.order.calculator.Calculator;

public class ShopOrderHandler extends AbstractHandler{

    public ShopOrderHandler(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void handle() {

        if (!calculator.getType().equals("shopOrder")) {
            throw new RuntimeException("类型错误");
        }

        System.out.println("进行 门店订单 处理~");
        System.out.println("处理类型为： " + calculator.getType());
        System.out.println("获得佣金比例为 " + calculator.getRate() + "%");
    }
}
