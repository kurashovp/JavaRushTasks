package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        // http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
        String[] params = url.substring(url.indexOf("?") + 1).split("&"); // lvl=15, view, name=Amigo
        for (String par: params) {
            System.out.print(par.split("=")[0] + " ");
        }
        System.out.println();
        for (String par: params) {
            if("obj".equals(par.split("=")[0])) {
                if (par.split("=")[1].matches("[-+]?\\d*.\\d*")) {
                    alert(Double.parseDouble(par.split("=")[1]));
                } else alert(par.split("=")[1]);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
