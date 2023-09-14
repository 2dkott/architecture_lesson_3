package ru.geekbrains.lesson3;

import ru.geekbrains.lesson3.actor.CarDriver;
import ru.geekbrains.lesson3.actor.Driver;
import ru.geekbrains.lesson3.actor.PlaneDriver;
import ru.geekbrains.lesson3.commands.ChargeCommand;
import ru.geekbrains.lesson3.commands.DriveToCommand;
import ru.geekbrains.lesson3.commands.FlyToCommand;
import ru.geekbrains.lesson3.locations.Hostpital;
import ru.geekbrains.lesson3.locations.Location;
import ru.geekbrains.lesson3.locations.RefuelingStation;
import ru.geekbrains.lesson3.vehicles.FlyableVehicle;
import ru.geekbrains.lesson3.vehicles.FuelType;
import ru.geekbrains.lesson3.vehicles.SportCar;

import java.awt.*;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        FlyableVehicle hellicopter = new FlyableVehicle("Ka", "53", Color.BLUE);
        PlaneDriver pilot = new PlaneDriver(hellicopter);
        Hostpital hostpital = new Hostpital();
        hostpital.examPilot(pilot);

        Location hotelRoof = new Location("Hotel Roof");
        RefuelingStation roofRefuelingStation = new RefuelingStation(List.of(FuelType.GASOLINE, FuelType.KEROSENE));

        pilot.doCommand(new FlyToCommand(100, 50, pilot.getVehicle(), hotelRoof));
        pilot.doCommand(new ChargeCommand(pilot.getVehicle(), roofRefuelingStation));

        Location hotel = new Location("Hotel");

        SportCar sportCar = new SportCar("Skyline", "330", Color.BLUE);
        CarDriver driver = new CarDriver(sportCar);
        driver.checkId();
        driver.doCommand(new DriveToCommand(100, driver.getVehicle(), hotel));

    }

}
