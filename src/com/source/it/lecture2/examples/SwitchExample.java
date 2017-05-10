package com.source.it.lecture2.examples;

public class SwitchExample {
    public static void main(String[] args) {
        int i = 5;
        switch (i) {
            case 1 :
                System.out.println("i == " + i);
                break;

            case 2 :
                i *= 2;
                System.out.println("i == " + i);
                break;

            case 3 :
                i *= 3;
                System.out.println("i == " + i);
                break;

            default :
                System.out.println("Error");
                break;
        }
    }
}
