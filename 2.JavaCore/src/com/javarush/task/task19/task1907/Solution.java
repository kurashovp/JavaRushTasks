package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileReader fileReader = new FileReader(reader.readLine())) {
            char[] cb = new char[1024 * 1024];
            StringBuilder sb = new StringBuilder();
            while (fileReader.ready()) {
                int charsRead = fileReader.read(cb);
                sb.append(cb, 0, charsRead);
            }
//            int wCount = 0;
            Pattern p = Pattern.compile("\\bworld\\b");
            Matcher m = p.matcher(sb);
            System.out.println(m.results().count()); // result() since 9, not implemented in JavaRush
//            m.reset();
//            while (m.find()) {
//                wCount++;
//            }
//            System.out.println(wCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
