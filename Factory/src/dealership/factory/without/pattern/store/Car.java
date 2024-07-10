package dealership.factory.without.pattern.store;

public abstract class Car {
    abstract int motorPower();

    abstract String name();

    public String getModel() {
        return name();
    }
}

class SportCar extends Car {

    @Override
    int motorPower() {
        return 10;
    }

    @Override
    String name() {
        return "Golf";
    }

}

class PopularCar extends Car {

    @Override
    int motorPower() {
        return 5;
    }

    @Override
    String name() {
        return "Onix";
    }

}
