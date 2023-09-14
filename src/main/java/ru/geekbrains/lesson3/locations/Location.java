package ru.geekbrains.lesson3.locations;

public class Location {
    private final int x;
    private final int y;
    private final int z;

    private final String name;

    public Location(String name, int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public Location(String name) {
        this(name,0,0,0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String getName() {
        return name;
    }
}
