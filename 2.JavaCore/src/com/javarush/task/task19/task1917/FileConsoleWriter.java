package com.javarush.task.task19.task1917;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

/* 
Свой FileWriter
*/

public class FileConsoleWriter {
    private final FileWriter fileWriter;

    public FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(String filename) throws IOException {
        fileWriter = new FileWriter(filename);
    }

    public FileConsoleWriter(String filename, boolean append) throws IOException {
        fileWriter = new FileWriter(filename, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        fileWriter = new FileWriter(fd);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        for (int i = off; i < len + off && i < cbuf.length; i++) {
            System.out.print(cbuf[i]);
        }
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.print(cbuf);
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.write(c);
        System.out.flush();
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.write(str.getBytes());
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.write(str.substring(off, off + len).getBytes());
    }

    public void close() throws IOException {
        fileWriter.close();
    }


    public static void main(String[] args) /*throws IOException*/ {

/*
        FileConsoleWriter fcw = new FileConsoleWriter("file1.txt");
        char[] cbuf = "Test string, тестовая строка".toCharArray();
        fcw.write("Test string, тестовая строка");
        fcw.write('\n');
        fcw.write(cbuf);
        fcw.close();
*/
    }

}
