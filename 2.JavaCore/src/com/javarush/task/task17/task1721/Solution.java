package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            reader.close();

            reader = new BufferedReader(new FileReader(file1));
            while (reader.ready()) {
                allLines.add(reader.readLine());
            }
            reader.close();

            reader = new BufferedReader(new FileReader(file2));
            while (reader.ready()) {
                forRemoveLines.add(reader.readLine());
            }

            new Solution().joinData();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
