package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/


public class Solution {
    public static void main(String[] args) {
        Outer.Nested on = new Outer.Nested();
        Outer outer = new Outer();
        Outer.Inner oi = outer.new Inner();
    }
}
