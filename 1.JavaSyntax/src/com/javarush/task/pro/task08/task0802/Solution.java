package com.javarush.task.pro.task08.task0802;

/* 
Утильный класс: часть 2
*/
public class Solution {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
//        return Math.pow(number,power);
        double result = number;
        if(power == 0) {
            return 1;
        }
        for(int i = 1; i < Math.abs(power); i++) {
            result *= number;
        }
        return power < 0 ? 1d / result : result;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(4));                //  2.0
        System.out.println(cbrt(8));                //  2.0
        System.out.println(pow(2, -5));   //  0.03125
        System.out.println(pow(2, -4));   //  0.0625
        System.out.println(pow(2, -3));   //  0.125
        System.out.println(pow(2, -2));   //  0.25
        System.out.println(pow(2, -1));   //  0.5
        System.out.println(pow(2, 0));    //  1.0
        System.out.println(pow(2, 1));    //  2.0
        System.out.println(pow(2, 2));    //  4.0
        System.out.println(pow(2, 3));    //  8.0
        System.out.println(pow(2, 4));    //  16.0
        System.out.println(pow(2, 5));    //  32.0
        System.out.println(pow(2, 31));   //  2.147483648E9 (double result = number;)
        System.out.println(pow(2, 63));   //  9.223372036854776E18
        System.out.println(pow(2, 127));   //  1.7014118346046923E38
//        System.out.println(pow(1, Integer.MAX_VALUE)); // 1.0 - задержка 3-4 секунды
        System.out.println(pow(Integer.MAX_VALUE, 2)); // 4.6116860141324206E18
        System.out.println(Math.pow(987, 102));
        System.out.println(pow(987, 102));
        System.out.println(Math.pow(10000, 10));
        System.out.println(pow(10000, 10));
    }
}
