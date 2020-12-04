package com.javarush.task.pro.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");

        InputStream input = url.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        while (reader.ready()) {
            System.out.println(reader.readLine());
        }

    }
}