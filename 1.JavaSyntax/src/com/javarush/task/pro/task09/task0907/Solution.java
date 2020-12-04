package com.javarush.task.pro.task09.task0907;


/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
        StringBuilder hex = new StringBuilder();
        while (decimalNumber > 0){
            hex.insert(0, HEX.charAt(decimalNumber % 16));
            decimalNumber /= 16;
        }
        return hex.toString();
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || hexNumber.equals("")) {
            return 0;
        }
        int dec = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            dec = dec * 16 + HEX.indexOf(hexNumber.charAt(i));
        }
        return dec;
    }
}
