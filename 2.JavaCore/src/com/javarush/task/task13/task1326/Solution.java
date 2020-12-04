package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(bf.readLine());
        bf = new BufferedReader(new InputStreamReader(input));
        List<Integer> arr = new ArrayList<>();

        while (bf.ready()) {
            int n = Integer.parseInt(bf.readLine());
            if (n % 2 == 0) arr.add(n);
        }
        bf.close();
        input.close();

        arr.sort(Integer::compareTo);
        arr.forEach(System.out::println);
    }
}
