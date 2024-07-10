package entities;

public class Car implements MotorAnalysis {

    private String motor;

    public Car(String motor) {
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    @Override
    public String checkMotor() {
      return getMotor();
    }
}
