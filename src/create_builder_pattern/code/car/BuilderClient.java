package create_builder_pattern.code.car;

import create_builder_pattern.code.car.builders.CarBuilder;
import create_builder_pattern.code.car.builders.CarManualBuilder;
import create_builder_pattern.code.car.cars.Car;
import create_builder_pattern.code.car.cars.Manual;
import create_builder_pattern.code.car.director.Director;

public class BuilderClient {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

        director.constructCityCar(builder);
        Car result = builder.getResult();
        System.out.println("Car built:\n" + result.getCarType());

        director.constructCityCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + manual.print());

    }
}
