package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    static class Thread1 extends Thread { // бесконечная нить
        @Override
        public void run() {
            while (true) {}
        }
    }

    static class Thread2 extends Thread { // "InterruptedException"
        @Override
        public void run() {
            try {
                while (!isInterrupted()){
                    sleep(0);
                }
                throw new InterruptedException();
            }
            catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    static class Thread3 extends Thread { // "Ура"; каждые полсекунды
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Thread4 extends Thread implements Message {
        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
            while (!isInterrupted()){}
        }
    }

    static class Thread5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            try {
                String input = reader.readLine();
                while (!input.equals("N")) {
                    sum += Integer.parseInt(input);
                    input = reader.readLine();
                }
                System.out.println(sum);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {



    }


}