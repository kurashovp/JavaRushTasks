package com.javarush.task.pro.task11.task1122;

/* 
Затенение поля класса
*/

public class Solution {
    public static int intA;

    public static void add(int intB) {
//        int intA = Solution.intA;
        Solution.intA += intB;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(intA);
    }
}