package com.javarush.task.pro.task10.task1020;

public class Computer {
    private SystemUnit sysUnit;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer() {
        this.sysUnit = new SystemUnit();
        this.monitor = new Monitor();
        this.keyboard = new Keyboard();
        this.mouse = new Mouse();
    }
}
