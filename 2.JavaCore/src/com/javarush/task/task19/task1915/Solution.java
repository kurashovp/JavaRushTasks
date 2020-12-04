package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream fileOutputStream = new  FileOutputStream(reader.readLine())) {
            PrintStream console = System.out;
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(stream);

            System.setOut(printStream);
            testString.printSomething();
            System.setOut(console);

            stream.writeTo(System.out);
            stream.writeTo(fileOutputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

