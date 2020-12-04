package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream file1Input = new FileInputStream(file1);
        byte[] file1Content = new byte[file1Input.available()];
        file1Input.read(file1Content);
        file1Input.close();
        FileOutputStream file1Out = new FileOutputStream(file1);
        FileInputStream file2Input = new FileInputStream(file2);
        while (file2Input.available() > 0) {
            file1Out.write(file2Input.read());
        }
        file2Input.close();
        file1Out.write(file1Content);
        file1Out.close();

    }
}
