package com.javarush.task.task18.task1816;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            File file = new File(args[0]);
            FileInputStream input = new FileInputStream(file);
            long charCount = 0;
            byte[] buffer = new byte[1024 * 1024];
            while (input.available() > 0) {
                int size = input.read(buffer);
                for (int i = 0; i < size; i++) {
                    byte ch = buffer[i];
                    if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                        charCount++;
                    }
                }
            }
            input.close();
            System.out.println(charCount);
        }
    }
}
