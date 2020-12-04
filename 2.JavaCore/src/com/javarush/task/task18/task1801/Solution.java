package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        int max = Byte.MIN_VALUE;
        byte[] buf = new byte[1024 * 1024];
        while (fis.available() > 0) {
            int size = fis.read(buf);
            for (int i = 0; i < size; i++) {
                if (buf[i] > max) {
                    max = buf[i];
                }
            }
        }
        fis.close();
        System.out.println(max);
    }
}
