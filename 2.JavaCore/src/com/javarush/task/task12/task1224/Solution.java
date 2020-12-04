package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String[] oTypes =  {"Кот", "Тигр", "Лев", "Бык", "Животное"};
        int classNum = oTypes.length - 1;
        if (o.getClass().getSimpleName().equals("Cat")) classNum = 0;
        if (o.getClass().getSimpleName().equals("Tiger")) classNum = 1;
        if (o.getClass().getSimpleName().equals("Lion")) classNum = 2;
        if (o.getClass().getSimpleName().equals("Bull")) classNum = 3;

        return oTypes[classNum];
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
