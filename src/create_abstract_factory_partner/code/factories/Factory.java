package create_abstract_factory_partner.code.factories;

import create_abstract_factory_partner.code.component.Chair;
import create_abstract_factory_partner.code.component.SeatCushion;

public interface Factory {

    Chair buildChair();

    SeatCushion buildSeatCushion();
}
