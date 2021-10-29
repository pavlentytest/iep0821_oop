package ru.samsung.itschool.mdev;

public class Car {
    String name; // ""
    protected int maxspeed; // 0
    protected double power; // 0.0
     /*
    Инкапсуляция (incapsulation)
    Полиморфизм (polymorphism)
    Наследование (inheritance)
     */

    public void doBeep() {
        System.out.println("Car beep!");
    }

    public Car() {

    }

    public Car(String name, int maxspeed, double power) {
        this.name = name;
        this.maxspeed = maxspeed;
        this.power = power;
    }


    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public String getName() {
        return name;
    }
}
