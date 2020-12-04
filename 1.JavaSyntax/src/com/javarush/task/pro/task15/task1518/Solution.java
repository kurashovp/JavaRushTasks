package com.javarush.task.pro.task15.task1518;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
А что же внутри папки?
*/

public class Solution {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        var dir = Path.of(bfr.readLine());
        try (var files = Files.newDirectoryStream(dir)) {
            for (Path p: files) {
                if (Files.isRegularFile(p)) System.out.println(p + THIS_IS_FILE);
                else if (Files.isDirectory(p)) System.out.println(p + THIS_IS_DIR);
            }
        }
    }
}

