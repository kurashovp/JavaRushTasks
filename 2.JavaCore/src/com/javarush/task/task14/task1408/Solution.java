package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
//        System.out.println(HenFactory.getHen(Country.RUSSIA).getDescription());
//        System.out.println(HenFactory.getHen(Country.UKRAINE).getDescription());
//        System.out.println(HenFactory.getHen(Country.MOLDOVA).getDescription());
//        System.out.println(HenFactory.getHen(Country.BELARUS).getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            switch (country) {
                case Country.RUSSIA:
                    return new RussianHen();
                case Country.BELARUS:
                    return new BelarusianHen();
                case Country.UKRAINE:
                    return new UkrainianHen();
                case Country.MOLDOVA:
                    return new MoldovanHen();
                default:
                    return null;
            }
        }
    }


}
