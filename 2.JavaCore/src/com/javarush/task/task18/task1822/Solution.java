package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try ( BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while (fileReader.ready()) {
                String prodEntry = fileReader.readLine();
                if (prodEntry.startsWith(args[0] + " ")) {
                    System.out.println(prodEntry);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
