package com.javarush.task.pro.task10.task1005;

/* 
Многосерийный предприниматель
*/
public class Building {
    private String type;

    public void initialize(String type) {
        this.type = type;
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        var building = new Building(/* "Ресторан" */);
        building.initialize("Барбершоп");
    }
}