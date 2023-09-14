package ru.geekbrains.lesson3.vehicles;

import ru.geekbrains.lesson3.locations.Refueling;
import ru.geekbrains.lesson3.locations.Location;

import java.awt.*;

public abstract class Vehicle {

    protected int velocity = 0;
    private Location direction;
    private String make;
    private String model;
    private Color color;
    private int wheelsCount;
    protected FuelType fuelType;
    private GearboxType gearboxType;
    private double engineCapacity;
    private boolean fogLights = false;
    protected CarType type;

    public Vehicle(String make, String model, Color color, FuelType fuelType) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
    }

    public abstract void move();
    public void stop() {
        this.velocity = 0;
    }

    // Обслуживание
    public abstract void maintenance();
    // Переключение передач
    public abstract boolean gearShifting();
    // Включение фар
    public abstract boolean switchHeadlights();
    // Включение дворников
    public abstract boolean switchWipers();

    public void charge(Refueling station) {
        station.getAvailableFuels().stream().filter(fuel -> fuel.equals(fuelType)).findFirst().ifPresentOrElse(
                fuel -> station.getFuel(this.fuelType),
                () -> System.out.printf("Ups there is no %s ...%n", fuelType)
        );
    }


    public boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }

    protected void setWheelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public Location getDirection() {
        return direction;
    }

    public void setDirection(Location direction) {
        this.direction = direction;
    }
}
