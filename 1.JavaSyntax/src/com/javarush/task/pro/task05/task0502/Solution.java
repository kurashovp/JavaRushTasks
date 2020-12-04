package com.javarush.task.pro.task05.task0502;

/* 
Четные и нечетные ячейки массивы
*/
public class Solution {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[20];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length - 1; i += 2) {
            strings[i] = EVEN;
            strings[i + 1] = ODD;
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print("index = " + i);
            System.out.println(" value = " + strings[i]);
        }
    }
}
