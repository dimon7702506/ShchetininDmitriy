package com.source.it.lecture4.homework.visitors;

import java.util.Calendar;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(new Date().getYear(), new Date().getMonth(), new Date().getDate(), 0, 0, 0);
        long startWork = calendar.getTime().getTime() + 9 * 60 * 60 * 1000;
        System.out.println(calendar.getTime());
    }
}
