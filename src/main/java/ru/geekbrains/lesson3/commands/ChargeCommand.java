package ru.geekbrains.lesson3.commands;

import ru.geekbrains.lesson3.locations.Refueling;
import ru.geekbrains.lesson3.vehicles.Vehicle;

public class ChargeCommand extends Command{

    private final Vehicle vehicle;
    private final Refueling refuelingStation;
    public ChargeCommand(Vehicle vehicle, Refueling refuelingStation) {
        this.vehicle = vehicle;
        this.refuelingStation = refuelingStation;
    }
    @Override
    public void run() {
        System.out.println("Going to charge");
        this.vehicle.charge(refuelingStation);
        System.out.println("Charged");
    }
}
