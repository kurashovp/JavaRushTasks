package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int slash3 = path.indexOf('/', 1 + path.indexOf('/',1 + path.indexOf('/')));
        int slash4 = path.indexOf('/',1 + slash3);
        return path.substring(0, 1 + slash3) + jdk + path.substring(slash4);
    }
}
