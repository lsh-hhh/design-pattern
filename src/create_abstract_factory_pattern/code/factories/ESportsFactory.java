package create_abstract_factory_pattern.code.factories;

import create_abstract_factory_pattern.code.component.*;

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
