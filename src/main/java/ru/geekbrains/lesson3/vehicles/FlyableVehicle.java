package ru.geekbrains.lesson3.vehicles;

import java.awt.*;

public class FlyableVehicle extends Vehicle implements Fueling {

    private int height;
    public FlyableVehicle(String make, String model, Color color) {
        super(make, model, color, FuelType.GASOLINE);
        setWheelsCount(4);
    }

    @Override
    public void move() {
        System.out.println(String.format("Fly with speed %sm", this.velocity));
    }

    public void takeOff(int height){
        this.height = height;
        System.out.println(String.format("Take off to %sm height", this.height));
    }

    public void land(){
        this.height = 0;
        System.out.println(String.format("Land to ground", this.height));
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void charge() {

    }
}
