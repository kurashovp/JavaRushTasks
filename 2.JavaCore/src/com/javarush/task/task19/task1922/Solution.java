package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(br.readLine()))) {
            StringBuilder pattern = new StringBuilder("\\b");
            for (String word: words) {
                pattern.append(word).append("\\b|\\b");
            }
            pattern.replace(pattern.length() - 3, pattern.length(), "");
            Pattern p = Pattern.compile(pattern.toString());
            while (reader.ready()) {
                String str = reader.readLine();
                Matcher m = p.matcher(str);
                int count = 0;
                int start = 0;
                while (m.find(start)) {
                    count++;
                    start = m.start() + 1;
                }
                if (count == 2) {
                    System.out.println(str);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
