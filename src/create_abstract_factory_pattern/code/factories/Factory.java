package create_abstract_factory_pattern.code.factories;

import create_abstract_factory_pattern.code.component.Chair;
import create_abstract_factory_pattern.code.component.SeatCushion;

public interface Factory {

    Chair buildChair();

    SeatCushion buildSeatCushion();
}
