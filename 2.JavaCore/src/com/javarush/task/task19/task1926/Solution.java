package com.javarush.task.task19.task1926;

import java.io.*;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            StringBuilder sb = new StringBuilder();
            while (fileReader.ready()) {
                sb.append(fileReader.readLine());
                System.out.println(sb.reverse());
                sb.delete(0, sb.length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
