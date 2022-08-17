package create_abstract_factory_pattern.code.furniture.factories;

import create_abstract_factory_pattern.code.furniture.component.Chair;
import create_abstract_factory_pattern.code.furniture.component.SeatCushion;

public interface Factory {

    Chair buildChair();

    SeatCushion buildSeatCushion();
}
