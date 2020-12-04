package com.javarush.task.pro.task15.task1519;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Поверхностное копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());

        var files = Files.newDirectoryStream(sourceDirectory);
        for (Path file: files) {
            if (Files.isRegularFile(file)) {
                    Files.copy(file, targetDirectory.resolve(file.getFileName()) );
                }
        }
//        Files.walk(sourceDirectory).forEach(path -> {
//            try {
//                if (Files.isRegularFile(path)) {
//                    Files.copy(path, targetDirectory.resolve(path.getFileName()) );
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
    }
}

