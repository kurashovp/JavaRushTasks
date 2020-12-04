package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
             BufferedReader file2 = new BufferedReader(new FileReader(reader.readLine()))) {


            Deque<String> flist1 = new ArrayDeque<>();
            Deque<String> flist2 = new ArrayDeque<>();
            while (file1.ready()){
                flist1.add(file1.readLine());
            }
            while (file2.ready()){
                flist2.add(file2.readLine());
            }

            while (!flist1.isEmpty() && !flist2.isEmpty()) {
                String s1 = flist1.poll();
                String s2 = flist2.poll();
                if (s1.equals(s2)) {
                    lines.add(new LineItem(Type.SAME, s1));
                } else if (!flist2.isEmpty() && s1.equals(flist2.peek())) {
                    lines.add(new LineItem(Type.ADDED, s2));
                    flist1.push(s1);
                } else if (!flist1.isEmpty() && s2.equals(flist1.peek())) {
                    lines.add(new LineItem(Type.REMOVED, s1));
                    flist2.push(s2);
                }
            }

            if (flist1.isEmpty() && !flist2.isEmpty()) {
                lines.add(new LineItem(Type.ADDED, flist2.poll()));
            } else if (!flist1.isEmpty() && flist2.isEmpty()) {
                lines.add(new LineItem(Type.REMOVED, flist1.poll()));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
//        lines.forEach((t) -> { System.out.printf("%s %s\n", t.type, t.line); });
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
