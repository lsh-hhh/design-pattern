package create_builder_pattner.code.car;

import create_builder_pattner.code.car.builders.CarBuilder;
import create_builder_pattner.code.car.builders.CarManualBuilder;
import create_builder_pattner.code.car.cars.Car;
import create_builder_pattner.code.car.cars.Manual;
import create_builder_pattner.code.car.director.Director;

public class BuilderClient {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
