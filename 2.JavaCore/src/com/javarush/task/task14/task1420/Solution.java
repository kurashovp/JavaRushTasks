package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        if (num1 <= 0 || num2 <= 0) {
            throw new Exception("ну не могу я поняти шо за числа такие!");
        }


        System.out.println(gcd(num1, num2));

    }

    static int gcd( int a, int b) {
       return b == 0? a: gcd(b, a % b);
    }
}
