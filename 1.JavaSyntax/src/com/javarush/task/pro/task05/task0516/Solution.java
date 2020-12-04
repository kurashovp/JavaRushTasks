package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/
public class Solution {

    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        Arrays.fill(array, 0, array.length / 2 + array.length % 2, valueStart);
        Arrays.fill(array, array.length / 2 + array.length % 2, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
