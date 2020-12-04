package com.javarush.task.pro.task15.task1516;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        var path = Path.of(bfr.readLine());
        do {
            if (Files.isDirectory(path)) {
                System.out.println(path + THIS_IS_DIR);
            } else {
                if (Files.isRegularFile(path)) {
                    System.out.println(path + THIS_IS_FILE);
                }
            }
            path = Path.of(bfr.readLine());
        } while (Files.isRegularFile(path) || Files.isDirectory(path));
    }
}

