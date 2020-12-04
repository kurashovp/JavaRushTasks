package com.javarush.task.pro.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var path1 = Path.of(br.readLine());
        if (path1.isAbsolute()) System.out.println(path1);
        else {
            System.out.println(path1.toAbsolutePath());
        }
    }
}

