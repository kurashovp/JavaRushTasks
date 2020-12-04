package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length < 3) return;
            try (FileInputStream inFile = new FileInputStream(args[1]);
                 FileOutputStream outFile = new FileOutputStream(args[2])) {

                switch (args[0]) {
                    case "-e":
                        encrypt(inFile, outFile);
                        break;
                    case "-d":
                        decrypt(inFile, outFile);
                        break;
                    default:
                }
                } catch (IOException e) {
                e.printStackTrace();
            }

        }

    static void encrypt(FileInputStream in, FileOutputStream out) throws IOException {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] buffer = new byte[3 * 1024];
        while (in.available() > 0) {
            int count = in.read(buffer);
            out.write(encoder.encode(Arrays.copyOf(buffer, count)));
        }
        out.close();
    }

    static void decrypt(FileInputStream in, FileOutputStream out) throws IOException {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] buffer = new byte[4 * 1024];
        while (in.available() > 0) {
            int count = in.read(buffer);
            out.write(decoder.decode(Arrays.copyOf(buffer, count)));
        }
        out.close();
    }

}
