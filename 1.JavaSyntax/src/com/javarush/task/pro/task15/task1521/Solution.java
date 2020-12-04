package com.javarush.task.pro.task15.task1521;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;

/* 
Временное сохранение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        URL url = new URL(bfr.readLine());
        InputStream input = url.openStream();
        byte[] buf = input.readAllBytes();
        Files.write(Files.createTempFile(null,null),buf);
        input.close();
    }
}