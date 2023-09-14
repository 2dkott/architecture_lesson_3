package ru.geekbrains.lesson3.commands;

import ru.geekbrains.lesson3.locations.Location;
import ru.geekbrains.lesson3.vehicles.Vehicle;

public class DriveToCommand extends Command {

    private final Vehicle vehicle;
    private final Location location;
    private final int velocity;
    public DriveToCommand(int speed, Vehicle vehicle, Location location) {
        this.vehicle = vehicle;
        this.location = location;
        this.velocity = speed;
    }
    @Override
    public void run() {
        System.out.printf("Going to %s%n", location.getName());
        this.vehicle.setVelocity(this.velocity);
        this.vehicle.setDirection(this.location);
        this.vehicle.move();
        System.out.printf("Reached %s%n", location.getName());
    }
}
