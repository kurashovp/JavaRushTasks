package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> salary = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] entry = reader.readLine().split(" ");
                salary.merge(entry[0], Double.parseDouble(entry[1]), Double::sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        salary.forEach((s, d) -> {System.out.println(s + " " + d);});
    }
}
