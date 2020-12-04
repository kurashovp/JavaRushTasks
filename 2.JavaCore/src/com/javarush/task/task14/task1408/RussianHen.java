package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 12;
    }

    @Override
    String getDescription() {
        return String.format(descrFormat, super.getDescription(), Country.RUSSIA, getCountOfEggsPerMonth());
    }
}
