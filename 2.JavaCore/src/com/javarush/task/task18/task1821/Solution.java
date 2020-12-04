package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        if (args.length > 0) {
            int[] ascii = new int[256];
            try (FileInputStream input = new FileInputStream(args[0])) {
                while (input.available() > 0) {
                    ascii[input.read()]++;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < ascii.length; i++) {
                if (ascii[i] > 0) {
                    System.out.printf("%c %d\n", (char) i, ascii[i]);
                }
            }
        }
    }
}
