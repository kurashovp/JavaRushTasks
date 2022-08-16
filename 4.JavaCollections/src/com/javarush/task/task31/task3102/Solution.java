package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        Deque<File> fileDeque = new ArrayDeque<>();
        List<String> fileTree = new ArrayList<>();
        fileDeque.add(new File(root));
        while (!fileDeque.isEmpty()) {
            File file = fileDeque.poll();
            for (File f : file.listFiles()) {
                if (f.isDirectory()) {
                    fileDeque.add(f);
                } else {
                    fileTree.add(f.getAbsolutePath());
                }
            }
        }
        return fileTree;

    }

    public static void main(String[] args) throws IOException {
//        getFileTree(".").forEach(System.out::println);
    }
}
