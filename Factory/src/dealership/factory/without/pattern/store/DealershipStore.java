package dealership.factory.without.pattern.store;

public class DealershipStore {
    public Car sellCar(String carModel) {
        Car chosenCar = (carModel.equals("SPORTS")) ? new SportCar() : new PopularCar();

        System.out.println("Sold a: " + chosenCar.getModel());

        return chosenCar;
    }
}

