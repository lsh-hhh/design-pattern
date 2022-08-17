package create_abstract_factory_pattern.code.furniture.factories;

import create_abstract_factory_pattern.code.furniture.component.*;

public class ESportsFactory implements Factory{
    @Override
    public Chair buildChair() {
        return new ESportsChair();
    }

    @Override
    public SeatCushion buildSeatCushion() {
        return new ESportsSeatCushion();
    }
}
