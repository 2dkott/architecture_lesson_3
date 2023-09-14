package ru.geekbrains.lesson3.locations;

import ru.geekbrains.lesson3.vehicles.FuelType;

import java.util.List;

public class RefuelingStation extends Location implements Refueling {

    private final List<FuelType> availableFuels;

    public RefuelingStation(String name, List<FuelType> fuels) {
        super(name);
        this.availableFuels = fuels;
    }

    public RefuelingStation(List<FuelType> fuels) {
        super("Refueling Station");
        this.availableFuels = fuels;
    }

    @Override
    public void getFuel(FuelType fuelType) {
        System.out.printf("Garging with %s ...%n", fuelType);
    }

    @Override
    public List<FuelType> getAvailableFuels() {
        return availableFuels;
    }
}
