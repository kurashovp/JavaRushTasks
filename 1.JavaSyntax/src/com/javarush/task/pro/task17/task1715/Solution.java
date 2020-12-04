package com.javarush.task.pro.task17.task1715;

import java.util.ArrayList;

/* 
Вилларибо и Виллабаджо.
*/
public class Solution {
    static ArrayList<Keyboard> keyboardOrchestra = new ArrayList<>();
    static ArrayList<Stringed> stringedOrchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playKeyboardOrchestra();
        playStringedOrchestra();
    }


    public static void createKeyboardOrchestra(){
        keyboardOrchestra.add(new Organ());
        keyboardOrchestra.add(new Piano());
        keyboardOrchestra.add(new Piano());
        keyboardOrchestra.add(new Piano());
    }

    public static void createStringedOrchestra(){
        stringedOrchestra.add(new Violin());
        stringedOrchestra.add(new Violin());
        stringedOrchestra.add(new Guitar());
    }

    public static void playKeyboardOrchestra(){
        for (Keyboard k: keyboardOrchestra) {
            if (k instanceof Keyboard) k.playKeys();
        }
    }


    public static void playStringedOrchestra(){
        for (Stringed s: stringedOrchestra) {
            if (s instanceof Stringed) s.playStrings();
        }
    }

}
