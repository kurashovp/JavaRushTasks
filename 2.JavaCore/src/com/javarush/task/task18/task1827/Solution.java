package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String crudFile = reader.readLine();
        ArrayList<Integer> id = new ArrayList<>();
        try (BufferedReader fr = new BufferedReader(new FileReader(crudFile))) {
            while (fr.ready()) {
                id.add(Integer.parseInt(fr.readLine().substring(0,8).trim()));
            }
        }
//        id.forEach(System.out::println);
        int idMax = id.stream().max(Integer::compare).get();
        if (args.length > 3 && "-c".equals(args[0])) {
            try (PrintWriter pw = new PrintWriter(new FileOutputStream(crudFile, true))) {
    //            System.out.printf("%8d%30s%8s%4s\n", ++idMax, args[1], args[2], args[3]);
                int prodId = idMax + 1;
                String price = args[args.length - 2];
                if (price.length() > 8) price = price.substring(0, 8);
                String quantity = args[args.length - 1];
                if (quantity.length() > 4) quantity = quantity.substring(0, 4);
                StringBuilder sb = new StringBuilder(args[1]);
                for (int i = 2; i < args.length - 2; i++) {
                    sb.append(" " + args[i]);
                }
                if (sb.length() > 30) sb.subSequence(0, 30);
                String prodName = sb.toString();
                pw.printf("\n%-8d%-30s%-8s%-4s", prodId, prodName, price, quantity);
            }
        }
    }
}
