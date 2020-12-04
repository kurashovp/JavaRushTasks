package com.javarush.task.pro.task09.task0908;

//import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/


public class Solution {

    private static final String HEX = "0123456789abcdef";
    private static final String[] OCT = {   "0000", "0001", "0010", "0011",
                                            "0100", "0101", "0110", "0111",
                                            "1000", "1001", "1010", "1011",
                                            "1100", "1101", "1110", "1111",  };

    public static void main(String[] args) {
        String binaryNumber =  "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.equals("") || !binaryNumber.matches("[01]+")) {
            return "";
        }
        String[] pad = {"", "000", "00", "0"};
        binaryNumber = pad[binaryNumber.length() % 4] + binaryNumber;
        StringBuilder binNum = new StringBuilder();
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            binNum.append(HEX.charAt(toDecimal(binaryNumber.substring(i, i + 4))));
        }

        return binNum.toString();
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.equals("") || !hexNumber.matches("[0-9a-f]+")) {
            return "";
        }
        StringBuilder binNum = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            binNum.append(OCT[HEX.indexOf(hexNumber.charAt(i))]);
        }

        return binNum.toString();
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
