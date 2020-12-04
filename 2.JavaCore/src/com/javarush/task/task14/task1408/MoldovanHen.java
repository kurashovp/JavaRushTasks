package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 14;
    }

    @Override
    String getDescription() {
        return String.format(descrFormat, super.getDescription(), Country.MOLDOVA, getCountOfEggsPerMonth());
    }
}
