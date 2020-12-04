package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        while (!"exit".equals(fileName)) {
            new ReadThread(fileName).start();
            fileName = reader.readLine();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (FileInputStream fis = new FileInputStream(fileName)) {
                byte[] bytes = new byte[256];
                int maxByte = 0;
                int indexMax = 0;
                while (fis.available() > 0) {
                    int index = fis.read();
                    bytes[index]++;
                    if (bytes[index] > maxByte) {
                        maxByte = bytes[index];
                        indexMax = index;
                    }
                }
                resultMap.put(fileName, indexMax);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
