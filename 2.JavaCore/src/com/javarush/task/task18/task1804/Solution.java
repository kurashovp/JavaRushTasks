package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());

        int[] bytes = new int[256];
        byte[] buf = new byte[1024 * 1024];
        while (fis.available() > 0) {
            int size = fis.read(buf);
            for (int i = 0; i < size; i++) {
                bytes[buf[i] + 128]++;
            }
        }

        fis.close();
        int min = Arrays.stream(bytes).filter(x -> x > 0).min().getAsInt();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == min) {
                System.out.printf("%d ", i - 128);
            }
        }

    }
}
