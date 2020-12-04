package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            switch (args[0]) {
                case "-c": // -c name sex bd
                    if (args.length > 3) {
                        createPerson(args[1], args[2], args[3]);
                    }
                    break;
                case "-u": // -u id name sex bd
                    if (args.length > 4) {
                        updatePerson(args[1], args[2], args[3], args[4]);
                    }
                    break;
                case "-d": // -d id
                    if (args.length > 1) {
                        deletePerson(args[1]);
                    }
                    break;
                case "-i": // -i id
                    if (args.length > 1) {
                        getInfoPerson(args[1]);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    static void createPerson(String name, String sex, String bd) {
        switch (sex) { //  "м" или "ж"
            case "м":
                try {
                    allPeople.add(Person.createMale(name,
                            new SimpleDateFormat("d/M/y",Locale.ENGLISH).parse(bd)));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case "ж":
                try {
                    allPeople.add(Person.createFemale(name,
                            new SimpleDateFormat("d/M/y",Locale.ENGLISH).parse(bd)));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
        }
        System.out.println(allPeople.size() - 1);
    }

    static void updatePerson(String id, String name, String sex, String bd) {
        int index = Integer.parseInt(id);
        allPeople.get(index).setName(name);
        allPeople.get(index).setSex("м".equals(sex) ? Sex.MALE : Sex.FEMALE);
        try {
            allPeople.get(index).setBirthDate(new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(bd));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    static void deletePerson(String id) {
        int index = Integer.parseInt(id);
        allPeople.get(index).setName(null);
        allPeople.get(index).setSex(null);
        allPeople.get(index).setBirthDate(null);
    }

    static void getInfoPerson(String id) {
        int index = Integer.parseInt(id);
        Person p = allPeople.get(index);
        System.out.print(p.getName() + " ");
        System.out.print(p.getSex() == Sex.MALE ? "м " : "ж ");
        System.out.println(new SimpleDateFormat("dd-MMM-yyy", Locale.ENGLISH).format(p.getBirthDate()));
    }
}
