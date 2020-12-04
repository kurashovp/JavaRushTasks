package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/
public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        for (int i = 0; i < 5; i++) {
            grades.put("Студент" + i, 3d + Math.random() * 2);
        }
    }
}
