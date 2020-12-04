package com.javarush.task.pro.task05.task0510;

/* 
Бином Ньютона
*/

public class Solution {

    public static int[][] PASCALS_TRIANGLE = new int[10][];

    public static void main(String[] args) {
        PASCALS_TRIANGLE[0] = new int[1];
        PASCALS_TRIANGLE[0][0] = 1;
        for (int i = 1; i < PASCALS_TRIANGLE.length; i++) {
            PASCALS_TRIANGLE[i] = new int[i + 1];
            PASCALS_TRIANGLE[i][0] = 1;
            PASCALS_TRIANGLE[i][PASCALS_TRIANGLE[i].length - 1] = 1;
            for (int j = 1; j < PASCALS_TRIANGLE[i].length - 1 ; j++) {
                PASCALS_TRIANGLE[i][j] = PASCALS_TRIANGLE[i - 1][j -1] + PASCALS_TRIANGLE[i - 1][j];
            }
        }
        for (int i = 0; i < PASCALS_TRIANGLE.length; i++) {
            for (int j = 0; j < PASCALS_TRIANGLE[i].length; j++) {
                System.out.print(PASCALS_TRIANGLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}
