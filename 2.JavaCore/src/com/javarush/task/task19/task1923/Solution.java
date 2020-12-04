package com.javarush.task.task19.task1923;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            FileWriter writer = new FileWriter(args[1])) {
            Pattern p = Pattern.compile(".*\\d+.*");
            while (reader.ready()) {
                String[] words = reader.readLine().split("\\s+");
                for (String word: words) {
                    if (p.matcher(word).matches()) {
                        writer.write(word + " ");
                    }
                }
            }
        } catch (IOException io) {
            /*NOP*/
        }
    }
}
