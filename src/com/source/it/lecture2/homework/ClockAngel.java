package com.source.it.lecture2.homework;

public class ClockAngel {
    public static void main(String[] args) {
        int hours = 11;
        int mins = 25;
        int result = 0;

        /*Your code here*/
        if (hours >= 0 && hours < 12 && mins >= 0 && mins < 60) {
            result = Math.abs(30 * hours - 6 * mins);
            if (result > 180) {
                result = 360 - result;
            }
            System.out.println("Angle between hours and minute narrows is " + result);
        } else {
            System.out.println("Error. Invalid time value.");
        }
    }
}
