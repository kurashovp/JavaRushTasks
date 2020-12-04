package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            FileWriter writer = new FileWriter(args[1])) {
            CharArrayWriter cbuf = new CharArrayWriter();
            while (reader.ready()) {
                String[] words = reader.readLine().split("\\s+");
                for (String word : words) {
                    if (word.length() > 6) {
                        cbuf.write(word);
                        cbuf.write(',');
                    }
                }
            }
            String[] array = {"1", "tow", "three"};
            StringJoiner sj = new StringJoiner(" ### ");
//            System.out.println(sj.add(Arrays.deepToString(array)));
            Arrays.stream(array).forEach(sj::add);
            System.out.println(sj);
            System.out.println(String.join(" ## ", array));
            writer.write(cbuf.toCharArray(), 0, cbuf.size() - 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
