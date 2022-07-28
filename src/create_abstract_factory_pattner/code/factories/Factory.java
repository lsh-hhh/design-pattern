package create_abstract_factory_pattner.code.factories;

import create_abstract_factory_pattner.code.component.Chair;
import create_abstract_factory_pattner.code.component.SeatCushion;

public interface Factory {

    Chair buildChair();

    SeatCushion buildSeatCushion();
}
