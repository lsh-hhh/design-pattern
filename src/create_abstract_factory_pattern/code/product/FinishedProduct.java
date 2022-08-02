package create_abstract_factory_pattern.code.product;

import create_abstract_factory_pattern.code.component.Chair;
import create_abstract_factory_pattern.code.component.SeatCushion;
import create_abstract_factory_pattern.code.factories.Factory;

public class FinishedProduct {

    private Chair chair;

    private SeatCushion seatCushion;

    public FinishedProduct(Factory factory) {
        chair = factory.buildChair();
        seatCushion = factory.buildSeatCushion();
    }

    public void description() {
        System.out.println("椅子是" + chair.getName());
        System.out.println("坐垫是" + seatCushion.getName());
    }
}
