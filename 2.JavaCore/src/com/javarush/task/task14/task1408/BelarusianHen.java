package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 13;
    }

    @Override
    String getDescription() {
        return String.format(descrFormat, super.getDescription(), Country.BELARUS, getCountOfEggsPerMonth());
    }
}
