package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = reader.readLine()).equals("exit")) {
            int value;
            if (input.matches("[-+]?\\d*\\.\\d*[fFdD]?")) {
                print(Double.parseDouble(input));
            } else if (input.matches("[-+]?\\d+[lL]?")) {
                value = Integer.parseInt(input);
                if (value > 0 && value < 128) {
                    print((short) value);
                } else print(value);
            } else {
                print(input);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
