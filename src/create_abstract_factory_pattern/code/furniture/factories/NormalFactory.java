package create_abstract_factory_pattern.code.furniture.factories;

import create_abstract_factory_pattern.code.furniture.component.Chair;
import create_abstract_factory_pattern.code.furniture.component.NormalChair;
import create_abstract_factory_pattern.code.furniture.component.NormalSeatCushion;
import create_abstract_factory_pattern.code.furniture.component.SeatCushion;

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
