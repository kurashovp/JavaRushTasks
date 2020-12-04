package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двухмерный массив
*/

public class Solution {

    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiArray = new int[n][];
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[sc.nextInt()];
        }
    }
}
