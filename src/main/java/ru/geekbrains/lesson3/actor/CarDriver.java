package ru.geekbrains.lesson3.actor;

import ru.geekbrains.lesson3.commands.Command;
import ru.geekbrains.lesson3.vehicles.Vehicle;

public class CarDriver extends Driver implements CivilDriver{

    private Vehicle vehicle;

    public CarDriver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void checkId() {
        System.out.println("Check Ids are in car");
    }

    @Override
    public void doCommand(Command command) {
        command.run();
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
