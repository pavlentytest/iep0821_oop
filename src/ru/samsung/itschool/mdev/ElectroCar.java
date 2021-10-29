package ru.samsung.itschool.mdev;

public class ElectroCar extends Car {
    private int batteryCapacity;

    public ElectroCar() {

    }

    public ElectroCar(String name, int maxspeed, double power, int batteryCapacity) {
        super(name, maxspeed, power);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void doBeep() {
        super.doBeep();
    }
}
class TTT {

}
