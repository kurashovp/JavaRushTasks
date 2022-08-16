package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

/* 
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) {
        String dir;
        String resultFileAbsolutePath;
        if (args.length > 1) {
            dir = args[0];
            resultFileAbsolutePath = args[1];
        } else return;
        File source = new File(resultFileAbsolutePath);
        File destination = new File(source.getParent() + "\\allFilesContent.txt");
        if (FileUtils.isExist(source)) {
            FileUtils.renameFile(source, destination);
        }


        File fileDir = new File(dir);
        Deque<File> fileDeque = new ArrayDeque<>();
        fileDeque.add(fileDir);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destination))) {
            while (!fileDeque.isEmpty()) {
                File f = fileDeque.poll();
                for (File file : f.listFiles()) {
                    if (file.isDirectory()) {
                        fileDeque.add(file);
                    } else if (file.length() <= 50) {
                        BufferedReader br = new BufferedReader(new FileReader(file));
                        while (br.ready()) {
                            bw.write(br.readLine());
                        }
                        bw.write("\n");
                        br.close();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("can't open file for writing");
        }
    }
}
