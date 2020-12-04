package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1999,Calendar.SEPTEMBER, 06);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        return new String[]{null, "Воскресенье", "Понедельник", "Вторник", "Среда",
                            "Четверг", "Пятница", "Суббота"}[calendar.get(Calendar.DAY_OF_WEEK)];
//        return switch (calendar.get(Calendar.DAY_OF_WEEK)) {
//            case Calendar.SUNDAY -> "Воскресенье";
//            case Calendar.MONDAY -> "Понедельник";
//            case Calendar.TUESDAY -> "Вторник";
//            case Calendar.WEDNESDAY -> "Среда";
//            case Calendar.THURSDAY -> "Четверг";
//            case Calendar.FRIDAY -> "Пятница";
//            case Calendar.SATURDAY -> "Суббота";
//            default -> null;
//        };
    }
}
