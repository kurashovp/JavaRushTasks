package com.javarush.task.pro.task07.task0710;

/* 
Массив значений
*/
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(int [] array, int value){
        Arrays.fill(array,value);
    }
}
