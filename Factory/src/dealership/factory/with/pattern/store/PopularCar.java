package dealership.factory.with.pattern.store;

public class PopularCar extends Car {

    @Override
    int motorPower() {
        return 5;
    }

    @Override
    String name() {
        return "Onix";
    }

}
