package create_abstract_factory_partner.code.factories;

import create_abstract_factory_partner.code.component.Chair;
import create_abstract_factory_partner.code.component.NormalChair;
import create_abstract_factory_partner.code.component.NormalSeatCushion;
import create_abstract_factory_partner.code.component.SeatCushion;

public class NormalFactory implements Factory{


    @Override
    public Chair buildChair() {
        return new NormalChair();
    }

    @Override
    public SeatCushion buildSeatCushion() {
        return new NormalSeatCushion();
    }
}
