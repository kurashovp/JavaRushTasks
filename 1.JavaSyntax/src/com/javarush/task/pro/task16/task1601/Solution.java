package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

public class Solution {

    static Date birthDate = new Date("Sep 06 1999");

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        return new String[]{"Воскресенье", "Понедельник", "Вторник", "Среда",
                        "Четверг", "Пятница", "Суббота"}[date.getDay()];
    }
}
