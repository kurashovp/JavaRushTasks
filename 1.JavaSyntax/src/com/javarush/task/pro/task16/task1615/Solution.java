package com.javarush.task.pro.task16.task1615;

import java.time.Instant;

public class Solution {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);                             //  1970-01-01T00:00:10Z
        System.out.println(plusMinutes(instant, 2));      //  1970-01-01T00:02:10Z
        System.out.println(plusHours(instant, 2));          //  1970-01-01T02:00:10Z
        System.out.println(plusDays(instant, 2));            //  1970-01-03T00:00:10Z
        System.out.println(plusWeeks(instant, 2));          //  1970-01-15T00:00:10Z
        System.out.println(minusMinutes(instant, 2));      //  1969-12-31T23:58:10Z
        System.out.println(minusHours(instant, 2));          //  1969-12-31T22:00:10Z
        System.out.println(minusDays(instant, 2));            //  1969-12-30T00:00:10Z
        System.out.println(minusWeeks(instant, 2));          //  1969-12-18T00:00:10Z
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
        return instant.plusSeconds(minutes * 60);
    }

    static public Instant plusHours(Instant instant, long hours) {
        return plusMinutes(instant,hours * 60);
    }

    static public Instant plusDays(Instant instant, long days) {
        return plusHours(instant,days * 24);
    }

    static public Instant plusWeeks(Instant instant, long weeks) {
        return plusDays(instant, weeks * 7);
    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        return instant.minusSeconds(minutes * 60);
    }

    static public Instant minusHours(Instant instant, long hours) {
        return minusMinutes(instant, hours * 60);
    }

    static public Instant minusDays(Instant instant, long days) {
        return minusHours(instant,days * 24);
    }

    static public Instant minusWeeks(Instant instant, long weeks) {
        return minusDays(instant, weeks * 7);
    }
}
