package dealership.factory.with.pattern.application;

import dealership.factory.with.pattern.store.DealershipStore;

public class Program {
    public static void main(String[] args) {

         String carModel = "f";

         DealershipStore dealership = new DealershipStore();

         dealership.sellCar(carModel);

    }
}
