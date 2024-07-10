package dealership.factory.with.pattern.store;

public abstract class Car {
    abstract int motorPower();

    abstract String name();

    public String getModel() {
        return name();
    }
}


