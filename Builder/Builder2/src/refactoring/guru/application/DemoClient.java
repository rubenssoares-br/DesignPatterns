package refactoring.guru.application;

import refactoring.guru.builders.CarBuilder;
import refactoring.guru.builders.CarManualBuilder;
import refactoring.guru.cars.Car;
import refactoring.guru.cars.CarType;
import refactoring.guru.cars.Manual;
import refactoring.guru.director.Director;

import static refactoring.guru.cars.CarType.CITY_CAR;

/**
 * Demo class. Everything comes together here.
 */
public class DemoClient {

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


        CarBuilder builder1 = new CarBuilder();
        director.constructCityCar(builder1);
        Car x = builder1.getResult();
        System.out.println("\nCar built: \n" + x.getCarType());

        CarManualBuilder builder2 = new CarManualBuilder();
        director.constructCityCar(builder2);
        Manual z = builder2.getResult();
        System.out.println("\nCar manual built: \n" + z.print());
    }
}
