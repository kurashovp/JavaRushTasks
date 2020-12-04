package com.javarush.task.task18.task1817;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            File file = new File(args[0]);
            FileInputStream input = new FileInputStream(file);
            long spaceCount = 0;
            long fileSize = 0;
            byte[] buffer = new byte[1024 * 1024];
            while (input.available() > 0) {
                int size = input.read(buffer);
                fileSize +=size;
                for (int i = 0; i < size; i++) {
                    byte ch = buffer[i];
                    if (ch == ' ') {
                        spaceCount++;
                    }
                }
            }
            input.close();
            if (fileSize > 0) {
                System.out.printf("%.2f", (float) spaceCount / fileSize * 100);
            }
        }
    }
}
