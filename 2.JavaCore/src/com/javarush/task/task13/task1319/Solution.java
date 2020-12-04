package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(bf.readLine()));
        ArrayList<String> strings = new ArrayList<>();
        String str = "";
        do {
            str = bf.readLine();
            strings.add(str);
        } while (!str.equals("exit"));
        bf.close();

        for (String s: strings) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
    }
}
