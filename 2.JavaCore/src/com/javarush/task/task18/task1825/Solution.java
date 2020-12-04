package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> fileParts = new ArrayList<>();
        String fileName;
        while(!(fileName = reader.readLine()).equals("end")) {
            fileParts.add(fileName);
        }
        fileParts.sort(Comparator.comparingInt(o -> Integer.parseInt(o.substring(o.lastIndexOf(".part") + 5))));
        fileName = fileParts.get(0).split("\\.part")[0];
        try (FileOutputStream out = new FileOutputStream(fileName)) {
            for (String part: fileParts) {
                try (FileInputStream in = new FileInputStream(part)) {
                    byte[] buffer = new byte[1024 * 1024];
                    while (in.available() > 0) {
                        int count = in.read(buffer);
                        out.write(buffer, 0, count);
                    }
                }
            }
        }
    }
}
