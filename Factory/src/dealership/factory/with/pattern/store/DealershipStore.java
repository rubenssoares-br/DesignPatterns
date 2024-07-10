package factory.store;

import dealership.factory.with.pattern.store.Car;
import dealership.factory.with.pattern.store.PopularCar;
import dealership.factory.with.pattern.store.SportCar;

public class DealershipStore {
    public Car sellCar(String carModel) {
        Car chosenCar = (carModel.equals("SPORTS")) ? new SportCar() : new PopularCar();

        System.out.println("Sold a: " + chosenCar.getModel());

        return chosenCar;
    }
}

