package create_abstract_factory_pattern.code.factories;

import create_abstract_factory_pattern.code.component.Chair;
import create_abstract_factory_pattern.code.component.NormalChair;
import create_abstract_factory_pattern.code.component.NormalSeatCushion;
import create_abstract_factory_pattern.code.component.SeatCushion;

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
