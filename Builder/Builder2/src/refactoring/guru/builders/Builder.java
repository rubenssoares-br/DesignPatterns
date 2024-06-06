package refactoring.guru.builders;

import refactoring.guru.cars.CarType;
import refactoring.guru.components.Engine;
import refactoring.guru.components.GPSNavigator;
import refactoring.guru.components.Transmission;
import refactoring.guru.components.TripComputer;

/**
 *
 *
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}