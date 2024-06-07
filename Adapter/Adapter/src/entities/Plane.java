package entities;

public class Plane implements MotorAnalysis {

    private String motor;

    public Plane(String motor) {
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
