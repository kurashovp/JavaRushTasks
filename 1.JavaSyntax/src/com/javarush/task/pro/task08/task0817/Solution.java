package com.javarush.task.pro.task08.task0817;

public class Solution {

    public static void main(String[] args) {
        int a = 3;
        int b = ++a + a-- * a++; // Валидатор принял решение с результатом 20, хотя в условии стоит 16
//        int b = a++ + (--a * a++);

        System.out.println(b);
    }
}