package dealership.factory.with.pattern.store;

import dealership.factory.with.pattern.factory.DealershipFactory;

public class DealershipStore {
    public Car sellCar(String carModel) {
        Car chosenCar = DealershipFactory.getInstance(carModel);

        System.out.println("Sold a: " + chosenCar.getModel());

        return chosenCar;
    }
}

