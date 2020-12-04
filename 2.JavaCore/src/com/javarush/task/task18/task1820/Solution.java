package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (FileInputStream fis = new FileInputStream(reader.readLine());
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(reader.readLine()))) {
            reader = new BufferedReader(new InputStreamReader(fis));
            String[] doubles = reader.readLine().split("\\s+");

            for (String d: doubles) {
                printWriter.printf("%d ", Math.round(Double.parseDouble(d)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
