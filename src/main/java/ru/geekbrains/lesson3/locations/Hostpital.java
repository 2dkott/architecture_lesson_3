package ru.geekbrains.lesson3.locations;

import ru.geekbrains.lesson3.actor.Pilot;

public class Hostpital extends Location{

    public Hostpital() {
        super("Hospital");
    }

    public void examPilot(Pilot pilot) {
        pilot.runHealthExam();
    }
}
