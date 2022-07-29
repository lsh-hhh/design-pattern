package create_builder_partner.code.car.builders;

import create_builder_partner.code.car.cars.CarType;
import create_builder_partner.code.car.cars.components.Engine;
import create_builder_partner.code.car.cars.components.GPSNavigator;
import create_builder_partner.code.car.cars.components.Transmission;
import create_builder_partner.code.car.cars.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
