package com.javarush.task.pro.task06.task0610;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    protected String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    protected String getFullName(){
        return name + " " + surname;
    }
}
