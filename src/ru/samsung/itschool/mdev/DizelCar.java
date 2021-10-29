package ru.samsung.itschool.mdev;

public class DizelCar extends Car {
    private boolean dizelFull;

    public DizelCar(String name, int maxspeed, double power, boolean dizelFull) {
        super(name, maxspeed, power);
        this.dizelFull = dizelFull;
    }
}
