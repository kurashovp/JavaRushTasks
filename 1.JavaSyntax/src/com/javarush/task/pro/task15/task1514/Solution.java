package com.javarush.task.pro.task15.task1514;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var path1 = Path.of(br.readLine());
        var path2 = Path.of(br.readLine());
        try {
            Path rel = path1.relativize(path2);
            System.out.println(rel);
            return;
        } catch (IllegalArgumentException e ) {}
        try {
            Path rel = path2.relativize(path1);
            System.out.println(rel);
        } catch (IllegalArgumentException e) {}
    }
}

