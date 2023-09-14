package ru.geekbrains.lesson3.actor;

import ru.geekbrains.lesson3.vehicles.Vehicle;
import ru.geekbrains.lesson3.commands.Command;

public abstract class Driver {

    public abstract void doCommand(Command command);

    public abstract Vehicle getVehicle();

}
