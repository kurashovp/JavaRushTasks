package com.javarush.task.pro.task10.task1002;

/* 
Построим новый жилой комплекс JavaRush Towers
*/
public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int floors){
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
    }

    public Skyscraper(String developer){
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }

    public static void main(String[] args) {
        var skyscraper = new Skyscraper();
        var skyscraperTower = new Skyscraper(50);
        var skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}

