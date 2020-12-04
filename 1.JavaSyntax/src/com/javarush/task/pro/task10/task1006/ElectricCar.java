package com.javarush.task.pro.task10.task1006;

/* 
Кто тут наследник?
*/
public class ElectricCar extends Car {

    public ElectricCar() {
        super("ElectricCar");
    }


    public static void main(String[] args) {
        new ElectricCar();
        new GasCar();
        new HybridCar();
    }
 }