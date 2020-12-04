package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());

        byte[] readBuffer = new byte[1024 * 1024];
        int comaCount = 0;
        while (fis.available() > 0) {
            int size = fis.read(readBuffer);
            for (int i = 0; i < size; i++) {
                if (readBuffer[i] == ',') {
                    comaCount++;
                }
            }
        }
        fis.close();
        System.out.println(comaCount);
    }
}
