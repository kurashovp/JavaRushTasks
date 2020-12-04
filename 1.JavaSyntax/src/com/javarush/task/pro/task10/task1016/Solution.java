package com.javarush.task.pro.task10.task1016;

/*
Прогноз погоды
*/
public class Solution {

    public static void showWeather(City city) {
        System.out.printf("В городе %s сегодня температура воздуха %d", city.getName(), city.getTemperature());
    }

    public static void main(String[] args) {
        showWeather(new City("Новосибирск", -1));
    }
}
