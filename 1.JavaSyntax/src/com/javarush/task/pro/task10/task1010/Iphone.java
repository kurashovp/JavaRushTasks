package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/
public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Iphone iphone = (Iphone) o;

        if (price != iphone.price) return false;
        if (!Objects.equals(model, iphone.model)) return false;
        return Objects.equals(color, iphone.color);
    }


    public static void main(String[] args) {
        var iphone1 = new Iphone("X", "Black", 999);
        var iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
