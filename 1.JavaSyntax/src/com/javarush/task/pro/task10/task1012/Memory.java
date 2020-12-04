package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментация памяти
*/
public class Memory {
    public static final String[] MEMORY = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};

    public static void defragmentation(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == null) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null){
                        array[i] = array[j];
                        array[j] = null;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        defragmentation(MEMORY);
        Arrays.stream(MEMORY).forEach(System.out::println);
    }
}
