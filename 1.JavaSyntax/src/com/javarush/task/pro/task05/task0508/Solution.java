package com.javarush.task.pro.task05.task0508;

import java.util.Arrays;
import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            strings[i] = sc.nextLine();
        }
        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i] != null) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[i].equals(strings[j])) {
                        isDuplicate = true;
                        strings[j] = null;
                    }
                }
                if (isDuplicate){ strings[i] = null;}
            }
        }
        Arrays.stream(strings).forEach(System.out::println);
    }
}
