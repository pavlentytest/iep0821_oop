package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args) {

        Car bmw = new Car();
        //bmw.power = 100;
        //bmw.maxspeed = 250;
       // bmw.name = "BMW";
        bmw.setName("BMW");
        System.out.println(bmw.getName());
        System.out.println(bmw.getMaxspeed());


        Car opel = new Car("Opel",56,123);
        opel.doBeep();

        ElectroCar tesla = new ElectroCar();
        tesla.doBeep();

        Car leaf = new ElectroCar();
        leaf.setName("Leaf");
        leaf.setPower(1231);
        leaf.doBeep();

    }
}
