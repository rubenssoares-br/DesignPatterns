package dealership.factory.with.pattern.store;

public class SportCar extends Car {

    @Override
    int motorPower() {
        return 10;
    }

    @Override
    String name() {
        return "Golf";
    }

}
