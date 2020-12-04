package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        var con = url.openConnection();

        con.setDoOutput(true);
        var sender = con.getOutputStream();
        var input = con.getInputStream();

        sender.write(127);
//        byte[] res = input.readAllBytes();
        input.transferTo(System.out);
//                for (int i = 0; i < res.length; i++) {
//            System.out.print((char)res[i]);
//        }
//        System.out.println(res.length);
        sender.close();
        input.close();

    }
}

