package com.javarush.task.task19.task1910;

import java.io.*;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {

            while (fileReader.ready()) {
                fileWriter.write(fileReader.readLine().replaceAll("\\p{P}", ""));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
