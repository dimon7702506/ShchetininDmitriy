package com.source.it.lecture6.examples.binaryTree;

public class StringExample {
    public static void main(String[] args) {
        int length = 50;
        int x = 1500001;
        System.out.println(("" + x).length());
        int startPosition = (length / 2) - (("" + x).length() / 2);
        String out = "";
        for (int i = 0; i < startPosition; i++) {
            out += " ";
        }
        /*out += x;
        System.out.println(out);
        System.out.printf("%s" + "" + x, "  ");*/
        String temp = "%s %d";

        System.out.println(String.format(temp, out, x));


    }
}
