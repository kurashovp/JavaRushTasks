package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] person = reader.readLine().split("\\s+");
                int pLen = person.length;
                int year = Integer.parseInt(person[pLen - 1]);
                int month = Integer.parseInt(person[pLen - 2]) - 1;
                int day = Integer.parseInt(person[pLen - 3]);
                Calendar birthDate = Calendar.getInstance();
                birthDate.set(year, month, day);
                String name = Arrays.stream(Arrays.copyOf(person, pLen - 3)).sequential().collect(Collectors.joining(" "));
                PEOPLE.add(new Person(name, birthDate.getTime()));
            }
        } catch (IOException e) {
            /*NOP*/
        }
//        PEOPLE.forEach(p -> {System.out.printf("%s %2$te/%2$tm/%2$tY \n", p.getName(), p.getBirthDate());});
    }
}
