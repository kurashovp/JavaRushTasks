package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable {
    transient private final String pattern = "dd MMMM yyyy, EEEE";
    String string;
    transient private Date currentDate;
    transient private int temperature;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    public static void main(String[] args) {
        System.out.println(new Solution(4));
        File file = new File("Solution.save");
        try (FileOutputStream fos = new FileOutputStream(file);
             FileInputStream fis = new FileInputStream(file)) {
            Solution savedObject = new Solution(-18);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(savedObject);
            oos.flush();
            ObjectInputStream ois = new ObjectInputStream(fis);
            Solution loadedObject = new Solution(-4);
            loadedObject = (Solution) ois.readObject();
            System.out.println("savedObject.string.equals(loadedObject.string) = " + savedObject.string.equals(loadedObject.string));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Override
    public String toString() {
        return this.string;
    }
}
