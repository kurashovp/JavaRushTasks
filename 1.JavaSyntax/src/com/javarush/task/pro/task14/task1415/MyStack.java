package com.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        return storage.remove(0);
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.size() < 1;
    }

    public int search(String s) {
        return storage.indexOf(s);
    }
}
