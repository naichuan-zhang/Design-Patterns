package com.refactoring_guru.builder.builders;

import com.refactoring_guru.builder.cars.CarType;
import com.refactoring_guru.builder.components.Engine;
import com.refactoring_guru.builder.components.GPSNavigator;
import com.refactoring_guru.builder.components.Transmission;
import com.refactoring_guru.builder.components.TripComputer;

/**
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
