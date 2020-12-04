package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOut = new FileOutputStream(reader.readLine());
        FileInputStream fileIn1 = new FileInputStream(reader.readLine());
        FileInputStream fileIn2 = new FileInputStream(reader.readLine());
        byte[] buf = new byte[1024 * 1024];
        while (fileIn1.available() > 0) {
            int count = fileIn1.read(buf);
            fileOut.write(buf, 0, count);
        }
        fileIn1.close();
        while (fileIn2.available() > 0) {
            int count = fileIn2.read(buf);
            fileOut.write(buf, 0, count);
        }
        fileIn2.close();
        fileOut.close();
    }
}
