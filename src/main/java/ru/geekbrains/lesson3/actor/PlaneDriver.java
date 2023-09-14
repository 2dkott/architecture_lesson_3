package ru.geekbrains.lesson3.actor;

import ru.geekbrains.lesson3.vehicles.FlyableVehicle;
import ru.geekbrains.lesson3.commands.Command;

public class PlaneDriver extends Driver implements Pilot{

    private FlyableVehicle vehicle;

    public PlaneDriver(FlyableVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void doCommand(Command command) {
        command.run();
    }

    @Override
    public FlyableVehicle getVehicle() {
        return vehicle;
    }

    @Override
    public void runHealthExam() {
        System.out.println("Perform health examination before flight");
    }
}
