package com.javarush.task.task18.task1809;

import java.io.*;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        FileOutputStream fos = new FileOutputStream(reader.readLine());

        byte[] buffer;
        fis.read(buffer = new byte[fis.available()]);
        for (int i = 0; i < buffer.length / 2; i++) {
            buffer[i] ^= buffer[buffer.length - 1 - i];
            buffer[buffer.length - 1 - i] ^= buffer[i];
            buffer[i] ^= buffer[buffer.length - 1 - i];
        }
        fos.write(buffer);
        fis.close();
        fos.close();
    }
}
