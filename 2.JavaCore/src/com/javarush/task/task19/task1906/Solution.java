package com.javarush.task.task19.task1906;

import java.io.*;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (FileReader fileReader = new FileReader(reader.readLine());
             FileWriter fileWriter = new FileWriter(reader.readLine())) {
            while (fileReader.ready()) {
                fileReader.read();
                fileWriter.write(fileReader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
    }
}
