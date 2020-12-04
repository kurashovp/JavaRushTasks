package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Есть ли кто?
*/
public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
      int[] clonedArray = array.clone();
//      int[] clonedArray = Arrays.copyOf(array, array.length);
        /* копирование массива с помощью copyOf() не пропускается валидатором, эту же проблему обсуждают
        * в соответствующей лекции, задал вопрос в помощи по этой задаче https://javarush.ru/help/59726
        * */
        Arrays.sort(clonedArray);
        System.out.println(Arrays.binarySearch(clonedArray, element) >= 0);
    }
}
