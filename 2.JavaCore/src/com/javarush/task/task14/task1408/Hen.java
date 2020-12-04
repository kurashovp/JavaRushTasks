package com.javarush.task.task14.task1408;

public abstract class Hen {

    final static String descrFormat = "%s Моя страна - %s. Я несу %d яиц в месяц.";

    abstract int getCountOfEggsPerMonth();

    String getDescription() {
        return  "Я - курица.";
    }
}
