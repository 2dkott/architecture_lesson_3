package ru.geekbrains.lesson3.commands;

import ru.geekbrains.lesson3.vehicles.FlyableVehicle;
import ru.geekbrains.lesson3.locations.Location;

public class FlyToCommand extends Command {

    private final FlyableVehicle vehicle;
    private final Location location;

    private final int height;
    public FlyToCommand(int speed, int height, FlyableVehicle vehicle, Location location) {
        this.vehicle = vehicle;
        this.vehicle.setVelocity(speed);
        this.vehicle.setDirection(location);
        this.height = height;
        this.location = location;
    }
    @Override
    public void run() {
        System.out.printf("Going to %s%n", location.getName());
        this.vehicle.takeOff(this.height);
        this.vehicle.move();
        this.vehicle.land();
        System.out.printf("Reached %s%n", location.getName());
    }
}
