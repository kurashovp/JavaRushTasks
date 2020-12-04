package com.javarush.task.pro.task09.task0915;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "com.javarush.task.pro.task09.task0915";
        String[] tokens = getTokens(packagePath, ".a");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer strTk = new StringTokenizer(query,delimiter);
        ArrayList<String> tokens = new ArrayList<>();
        while (strTk.hasMoreTokens()) {
            tokens.add(strTk.nextToken());
        }
        return tokens.toArray(new String[tokens.size()]);
    }
}
