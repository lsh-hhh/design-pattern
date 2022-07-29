package struction_bridge_partner.code.order;

import struction_bridge_partner.code.order.calculator.OnlineOrderCalculator;
import struction_bridge_partner.code.order.calculator.ShopOrderCalculator;
import struction_bridge_partner.code.order.handler.OnlineOrderHandler;
import struction_bridge_partner.code.order.handler.ShopOrderHandler;

public class BridgeClient {

    public static void main(String[] args) {

        new OnlineOrderHandler(new OnlineOrderCalculator()).handle();
        System.out.println();
        new ShopOrderHandler(new ShopOrderCalculator()).handle();
    }
}
