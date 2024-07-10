package program;

import entities.Car;
import entities.MotorAnalysis;
import entities.Plane;

import java.lang.module.ModuleReader;
import java.util.Objects;

public class Application {
    public static void main(String[] args) {

        Car gol = new Car(null);
        Plane boeing = new Plane("CFM56");

//        if (Objects.isNull(gol.getMotor())) {
//            System.out.println("Motor not found for car!");
//        }
//
//        if (Objects.isNull(boeing.getMotor())) {
//            System.out.println("Motor not found for plane!");
//        }

//        processAnalysis(gol, boeing);
        processAnalysisWild(gol);
        processAnalysisWild(boeing);

    }

//    static void processAnalysis(Car car, Plane plane) {
//        if (Objects.isNull(car.getMotor())) {
//            System.out.println("Motor not found!");
//        }
//
//        if (Objects.isNull(plane.getMotor())) {
//            System.out.println("Motor not found!");
//        }
//    }
//
    static void processAnalysisWild (MotorAnalysis vehicle) {
        if (Objects.isNull(vehicle.checkMotor()))  {
            System.out.println("Motor not found!");
        }
    }

}
