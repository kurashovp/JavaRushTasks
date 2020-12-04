package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine())) ) {

            Pattern numbers = Pattern.compile("\\b\\d+\\b");
            while (fileReader.ready()) {
                StringBuilder line = new StringBuilder(fileReader.readLine());
                Matcher m = numbers.matcher(line);
                while (m.find()) {
                    fileWriter.write(m.group() + " ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
