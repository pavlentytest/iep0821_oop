package ru.samsung.itschool.mdev;

public class GazCar extends ElectroCar {
    private int gazCapacity;

    public GazCar(String name, int maxspeed, double power, int batteryCapacity, int gazCapacity) {
        super(name, maxspeed, power, batteryCapacity);
        this.gazCapacity = gazCapacity;
    }
}
