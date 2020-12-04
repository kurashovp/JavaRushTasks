package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 15;
    }

    @Override
    String getDescription() {
        return String.format(descrFormat, super.getDescription(), Country.UKRAINE, getCountOfEggsPerMonth());
    }
}
