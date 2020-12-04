package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(new FileInputStream("persons.txt"));
//        System.out.println(new PersonScannerAdapter(scanner).read());
//        System.out.println(new PersonScannerAdapter(scanner).read());
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] pers = fileScanner.nextLine().split("\\s+");
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
            Date birthDay = null;
            try {
                birthDay = sdf.parse(pers[3] + pers[4] + pers[5]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(pers[1], pers[2], pers[0], birthDay);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
