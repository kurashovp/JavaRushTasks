package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальные элемент массива
*/
public class Solution {

    public static void main(String[] args) {
        int[] stringArray = getArrayOfTenElements();
        System.out.println(min(stringArray));
    }

    public static int min(int[] ints) {
        int min = ints[0];
        for (int anInt : ints) {
            min = Math.min(min, anInt);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner sc = new Scanner(System.in);
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = sc.nextInt();
        }
        return ints;
    }
}
