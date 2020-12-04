package com.javarush.task.pro.task15.task1517;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

/* 
Файловые операции
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        var file1 = Path.of(bfr.readLine());
        var file2 = Path.of(bfr.readLine());

        if (Files.notExists(file1)) {
            Files.createFile(file1);
        } else if (Files.notExists(file2)) {
            Files.move(file1, file2);
        } else {
            Files.delete(file1);
        }

    }
}

