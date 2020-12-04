package com.javarush.task.pro.task15.task1507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in)))
        {   var allLines = Files.readAllLines(Path.of(console.readLine()));
            for (int i = 0; i < allLines.size(); i += 2) {
                System.out.println(allLines.get(i));
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

