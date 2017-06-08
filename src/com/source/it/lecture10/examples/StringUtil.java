package com.source.it.lecture10.examples;

public class StringUtil {
    public static void main(String[] args) {
        String s = "# User's settings\n" +
                "user.age.min=18\n" +
                "user.age.max=55\n" +
                "user.income.ratio=3.0\n" +
                "user.income.statistic.age=12\n" +
                "\n" +
                "# Credit setting\n" +
                "credit.sum.min=200\n" +
                "credit.sum.max=100000\n" +
                "\n" +
                "# Central office credentials\n" +
                "central.office.address=Some address\n" +
                "central.office.phone=09999887766\n" +
                "\n" +
                "# Local office credentials\n" +
                "local.office.address=Some address\n" +
                "local.office.phone=09999887766\n";

        String[] split = s.split("\n");
        for (String current : split) {
            if (current.startsWith("#")) {
                System.out.print("Comment ");
            }

            if (current.isEmpty()) {
                System.out.print("Empty!!! ");
            }

            if ("".equals(current)) {
                System.out.print("Current is empty!!!  ");
            }
            System.out.println(current);
        }
    }
}
