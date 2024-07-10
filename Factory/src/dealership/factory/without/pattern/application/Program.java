package dealership.factory.without.pattern.application;

import dealership.factory.without.pattern.store.DealershipStore;

public class Program {
    public static void main(String[] args) {

         String carModel = "SPORTS";

         DealershipStore dealership = new DealershipStore();

         dealership.sellCar(carModel);

    }
}
