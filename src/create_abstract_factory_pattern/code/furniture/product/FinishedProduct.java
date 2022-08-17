package create_abstract_factory_pattern.code.furniture.product;

import create_abstract_factory_pattern.code.furniture.component.Chair;
import create_abstract_factory_pattern.code.furniture.component.SeatCushion;
import create_abstract_factory_pattern.code.furniture.factories.Factory;

public class FinishedProduct {

    private final Chair chair;

    private final SeatCushion seatCushion;

    public FinishedProduct(Factory factory) {
        chair = factory.buildChair();
        seatCushion = factory.buildSeatCushion();
    }

    public void description() {
        System.out.println("椅子是" + chair.getName());
        System.out.println("坐垫是" + seatCushion.getName());
    }
}
