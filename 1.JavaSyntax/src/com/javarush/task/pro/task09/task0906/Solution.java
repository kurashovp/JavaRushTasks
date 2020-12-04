package com.javarush.task.pro.task09.task0906;


/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
        StringBuffer binStr = new StringBuffer();
        while (decimalNumber > 0) {
            binStr = binStr.insert(0, decimalNumber % 2);
            decimalNumber /= 2;
        }
        return binStr.toString();
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.equals("")) {
            return 0;
        }
        int dec = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            dec += (binaryNumber.charAt(binaryNumber.length() - 1 - i) - '0') * (1 << i);
        }
        return dec;
    }


}
