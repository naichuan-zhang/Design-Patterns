package com.refactoring_guru.builder.builders;

import com.refactoring_guru.builder.cars.Car;
import com.refactoring_guru.builder.cars.CarType;
import com.refactoring_guru.builder.components.Engine;
import com.refactoring_guru.builder.components.GPSNavigator;
import com.refactoring_guru.builder.components.Transmission;
import com.refactoring_guru.builder.components.TripComputer;

/**
 * Concrete builders implement steps define in the common interface.
 */
public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
