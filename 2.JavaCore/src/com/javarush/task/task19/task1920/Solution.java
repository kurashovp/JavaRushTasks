package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> list = new TreeMap<>();
        double dmax = Double.MIN_VALUE;
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] entry = reader.readLine().split(" ");
                String name = entry[0];
                double val = Double.parseDouble(entry[1]);
                list.merge(name, val, Double::sum);
                if (dmax < list.get(name)) {
                    dmax = list.get(name);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        final double max = dmax;
        list.forEach(((s, d) -> {if (d.equals(max)) System.out.printf("%s ", s);}));
    }
}
