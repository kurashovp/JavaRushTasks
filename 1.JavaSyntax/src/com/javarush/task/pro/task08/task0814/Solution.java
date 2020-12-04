package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/
public class Solution {

    public static int setFlag(int number, int flagPos) {
        //напишите тут ваш код
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        //напишите тут ваш код
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        //напишите тут ваш код
        return ((number & (1 << flagPos)) == (1 << flagPos));
    }

//    public static void main(String[] args) {
//        int n = 0;
//        for (int i = 0; i < 31; i++) {
//            System.out.println(setFlag(n, i));
//        }
//    }
}
