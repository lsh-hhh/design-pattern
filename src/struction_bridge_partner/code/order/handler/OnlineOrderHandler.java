package struction_bridge_partner.code.order.handler;

import struction_bridge_partner.code.order.calculator.Calculator;

public class OnlineOrderHandler extends AbstractHandler{

    public OnlineOrderHandler(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void handle() {

        if (!calculator.getType().equals("onlineOrder")) {
            throw new RuntimeException("类型错误");
        }
        System.out.println("进行 线上订单 处理~");
        System.out.println("处理类型为： " + calculator.getType());
        System.out.println("获得佣金比例为 " + calculator.getRate() + "%");
    }
}
