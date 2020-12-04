package com.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Глубокое копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());

//        var files = Files.newDirectoryStream(sourceDirectory);
//        for (Path file: files) {
//            if (Files.isRegularFile(file)) {
//                Files.copy(file, targetDirectory.resolve(file.getFileName()) );
//            }
//        }
        Files.walk(sourceDirectory).forEach(path -> {
            try {
//                if (true /*Files.isRegularFile(path) */) {
                    Files.copy(path, targetDirectory.resolve(sourceDirectory.relativize(path)));
//                    System.out.println("path " + path + " tg " + targetDirectory.resolve(sourceDirectory.relativize(path)));
//                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}

