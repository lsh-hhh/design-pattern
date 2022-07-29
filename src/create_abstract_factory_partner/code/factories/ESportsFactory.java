package create_abstract_factory_partner.code.factories;

import create_abstract_factory_partner.code.component.*;

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
