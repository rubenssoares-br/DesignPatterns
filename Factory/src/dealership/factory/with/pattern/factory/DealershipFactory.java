package dealership.factory.with.pattern.factory;

import dealership.factory.with.pattern.store.Car;
import dealership.factory.with.pattern.store.PopularCar;
import dealership.factory.with.pattern.store.SportCar;

public class DealershipFactory {
    public static Car getInstance(String carModel) {
        return (carModel.equals("SPORTS")) ? new SportCar() : new PopularCar();
    }

}
