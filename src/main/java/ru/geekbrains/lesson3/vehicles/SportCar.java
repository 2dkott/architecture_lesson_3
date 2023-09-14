package ru.geekbrains.lesson3.vehicles;

import java.awt.*;

public class SportCar extends Vehicle{

    private final CarType type = CarType.SPORT_CAR;
    public SportCar(String make, String model, Color color) {
        super(make, model, color, FuelType.GASOLINE);
    }
    @Override
    public void move() {
        System.out.printf("Riding with speed %sm%n", this.velocity);
    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }
}
