package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;
import java.util.Arrays;

/* 
Reverse
*/
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        if (n % 2 == 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } else {
            for (int j : array) {
                System.out.println(j);
            }
        }
    }

}
