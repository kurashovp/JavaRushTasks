package com.javarush.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/

public class Solution {
    public static void main(String[] args) {

    }

    public A getOriginalObject(ObjectInputStream objectStream) {
        A a = new A();
        try {
            a = (A) objectStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            return null;
        }
        return a instanceof A ? a : null;
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }
}
