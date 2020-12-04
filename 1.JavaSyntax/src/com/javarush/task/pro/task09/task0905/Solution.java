package com.javarush.task.pro.task09.task0905;

/*
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 8;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0){
            return 0;
        }
        int octal = 0;
        int i = 0;
        while (decimalNumber > 0) {
            octal += (decimalNumber % 8) * pow(10, i);
            decimalNumber /= 8;
            i++;
        }
        return octal;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0) {
            return 0;
        }
        int dec = 0;
        int i = 0;
        while (octalNumber > 0) {
            dec += (octalNumber % 10) * pow(8, i);
            octalNumber /= 10;
            i++;
        }
        return dec;
    }

    public static int pow(int base, int exp){
        int pow = 1;
        for (int i = 1; i <= exp ; i++) {
            pow *= base;
        }
        return pow;
    }

}
