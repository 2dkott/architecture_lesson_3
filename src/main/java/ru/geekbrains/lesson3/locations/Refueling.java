package ru.geekbrains.lesson3.locations;

import ru.geekbrains.lesson3.vehicles.FuelType;

import java.util.List;

/**
 * Заправочная станция
 */
public interface Refueling{

    /**
     * Заправка
     */
    void getFuel(FuelType fuelType);

    List<FuelType> getAvailableFuels();


}
