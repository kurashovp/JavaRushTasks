package com.javarush.task.pro.task10.task1009;

/* 
Сравнение строк
*/
public class Solution {

    public static void main(String[] args) {
        var s1 = new String("JavaRush");
        s1 = "JavaRush";
        var s2 = "JavaRush";
//        s2 = new String("JavaRush");
        var s3 = "JavaRush";
//        s3 = new String("JavaRush");
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}
