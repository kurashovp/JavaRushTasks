package com.javarush.task.pro.task16.task1620;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        // 4 9.3.19 06:03:07.319180500 Europe/Kiev
        // 4 - номер дня недели, т.е. четверг; 9 - день месяца; 3 - месяц; 19 - год; 06 - часы; 03 - минуты;
        // 07 - секунды; 319180500 - наносекунды; Europe/Kiev
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        System.out.println(dtf.format(zonedDateTime));
    }
}
