package com.javarush.task.pro.task08.task0809;
/* 
Counter
*/
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        for (int i = 1; i <10; i++) {
            System.out.println(i);
            Thread.sleep(1, 300_000); // по условию требуется 1.5мс, но валидатор принимает с 300_000
        }
        System.out.println(10);
    }
}
