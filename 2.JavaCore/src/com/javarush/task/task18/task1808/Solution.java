package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[file1.available()];
        int size = file1.read(buffer);
        file2.write(buffer, 0, size / 2 + size % 2);
        file3.write(buffer, size / 2 + size % 2, size - size / 2 - size % 2);
        file1.close();
        file2.close();
        file3.close();
    }
}
