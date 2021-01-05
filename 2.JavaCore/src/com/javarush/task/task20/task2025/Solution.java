package com.javarush.task.task20.task2025;

import java.util.Arrays;

/* 
Алгоритмы-числа
*/

public class Solution {

    static long narcis[] = {
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            153,
            370,
            371,
            407,
            1634,
            8208,
            9474,
            54748,
            92727,
            93084,
            548834,
            1741725,
            4210818,
            9800817,
            9926315,
            24678050,
            24678051,
            88593477,
            146511208,
            472335975,
            534494836,
            912985153,
            4679307774L,
            32164049650L,
            32164049651L,
            40028394225L,
            42678290603L,
            44708635679L,
            49388550606L,
            82693916578L,
            94204591914L,
            28116440335967L,
            4338281769391370L,
            4338281769391371L,
            21897142587612075L,
            35641594208964132L,
            35875699062250035L,
            1517841543307505039L,
            3289582984443187032L,
            4498128791164624869L,
            4929273885928088826L // 50th narcis number (count from 1)
    };
    static long[][] numPower = new long[10][19];

    static {
        for (int i = 0; i <= 9; i++) {
            numPower[i][0] = i;
        }
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j < 19; j++) {
                numPower[i][j] = numPower[i][j - 1] * i;
            }
        }
    }

    public static long[] getNumbers(long N) {
        if (N <= 0) return new long[0];
        int n = narcis.length;
        for (int i = 0; i < narcis.length; i++) {
            if (narcis[i] >= N) {
                n = i;
                break;
            }
        }
        return Arrays.copyOfRange(narcis, 0, n);
/*
        ArrayList<Long> list = new ArrayList<>();
        for (long i = 1; i < N; i++) {
            if (isSelfPowered(i)) {
                list.add(i);
            }
        }
        long[] result = new long[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
*/
    }

    private static boolean isSelfPowered(long i) {
        int p = 1 + (int) Math.log10(i);
        long sum = 0;
        long num = i;
        for (int j = 0; j < p; j++) {
            sum += numPower[(int) num % 10][p - 1];
            if (sum > i) {
                return false;
            }
            num /= 10;
        }
        return sum == i;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
