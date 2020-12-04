package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e); // 1
        }

        try {
            Integer.parseInt("фигня");
        } catch (NumberFormatException e) {
            exceptions.add(e); // 2
        }
         String s = null;
        try {
            s.equals("null");
        } catch (Exception e) {
            exceptions.add(e); //3
        }
        exceptions.add(new ArrayIndexOutOfBoundsException("Инекс аут оф границы")); // 4
        exceptions.add(new ArrayStoreException("Аррай сторе")); // 5
        exceptions.add(new ClassCastException("класс каст")); // 6
        exceptions.add(new TimeoutException("таймаут")); // 7
        exceptions.add(new IOException("ИО")); // 8
        exceptions.add(new IllegalArgumentException("илегал аргум")); // 9
        exceptions.add(new InterruptedException("прерывание")); // 10


    }
}
