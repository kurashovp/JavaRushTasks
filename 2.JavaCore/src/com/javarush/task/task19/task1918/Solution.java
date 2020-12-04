package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
             FileReader reader = new FileReader(bf.readLine())) {

            char[] cb = new char[1024];
            while (reader.ready()) {
                int charsRead = reader.read(cb);
                sb.append(cb, 0, charsRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String shtml = sb.toString().replaceAll("\r|\n", "");
        String openTag = "<" + args[0] + "[^>]*>";
        String closingTag = "</" + args[0] + ">";
        Pattern pattern = Pattern.compile(openTag + "|" + closingTag);
        Matcher matcher = pattern.matcher(shtml);

        Stack<Integer> tagsPosition = new Stack<>();
        Stack<String> strings = new Stack<>();
        int s = 0;
        while (matcher.find(s)) {
            s = matcher.start() + 1;

            if (!matcher.group().startsWith("</")) {
                tagsPosition.push(matcher.start());
            } else {
                strings.push(shtml.substring(tagsPosition.pop(), matcher.start() + closingTag.length()));
            }
            if (tagsPosition.empty()) {
                while (!strings.empty()) {
                    System.out.println(strings.pop());
                }
            }
        }
    }
}
