package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);
             var input =  Files.newInputStream(Path.of(sc.nextLine()));
             var output = Files.newOutputStream(Path.of(sc.nextLine()))
            )
        {
            byte[] buf = new byte[2 << 20]; // buffer 2**20 / 1024 * 1024 / 1Mib
            while (input.available() > 0) {
                int count = input.read(buf);
                for (int i = 0; i < count - 1; i += 2) {
                    buf[i] ^= buf[i + 1];
                    buf[i + 1] ^= buf[i];
                    buf[i] ^= buf[i + 1];
                }
                output.write(buf, 0, count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

/*
Перепутанные байты
*/

