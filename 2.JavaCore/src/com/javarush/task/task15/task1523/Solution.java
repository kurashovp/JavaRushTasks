package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public Solution() {
    }
    protected Solution(String str) {
        System.out.println("str = " + str);
    }
    Solution(int i) {
        System.out.println("i = " + i);
    }
    private Solution(char ch) {
        System.out.println("ch = " + ch);
    }


    public static void main(String[] args) {

    }
}

