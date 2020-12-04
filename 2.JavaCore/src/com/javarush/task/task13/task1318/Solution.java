package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(bf.readLine());
        bf.close();
        byte[] buf = new byte[1024 * 1024];
        while (fis.available() > 0) {
            int count = fis.read(buf);
            System.out.write(buf, 0, count);
        }
        fis.close();
    }
}