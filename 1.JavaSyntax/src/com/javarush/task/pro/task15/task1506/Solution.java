package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        var str = Files.readAllLines(Path.of(sc.nextLine()));
        for (String s: str) {
            System.out.println(s.replaceAll("[., ]", ""));
        }

    }
}

