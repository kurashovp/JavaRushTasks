package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String crudFile = reader.readLine();
        Map<Integer, String> id = new LinkedHashMap<>();
        try (BufferedReader fr = new BufferedReader(new FileReader(crudFile))) {
            while (fr.ready()) {
                String line = fr.readLine();
                id.put(Integer.parseInt(line.substring(0, 8).trim()), line.substring(8));
            }
        }
//        id.forEach((k, v) -> System.out.printf("%-8d%-42s\n", k, v));
        if (args.length > 1 && "-d".equals(args[0])) {
            id.remove(Integer.parseInt(args[1]));
        } else
        if (args.length > 3 && "-u".equals(args[0])) {

            int prodId = Integer.parseInt(args[1]);
            String price = args[args.length - 2];
            if (price.length() > 8) price = price.substring(0, 8);
            String quantity = args[args.length - 1];
            if (quantity.length() > 4) quantity = quantity.substring(0, 4);
            StringBuilder sb = new StringBuilder();
            for (int i = 2; i < args.length - 2; i++) {
                sb.append(args[i]).append(" ");
            }
            if (sb.length() > 30) sb.subSequence(0, 30);
            String prodName = sb.toString();
            id.replace(prodId, String.format("%-30s%-8s%-4s", prodName, price, quantity));

        }
//        System.out.println();
//        id.forEach((k, v) -> System.out.printf("%-8d%-42s\n", k, v));

        try (PrintWriter pw = new PrintWriter(crudFile)) {
            id.forEach((k, v) -> pw.printf("%-8d%-42s\n", k, v));
        }

    }
}
