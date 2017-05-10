package com.source.it.lecture2.examples;

public class SwitchStringExample {
    public static void main(String[] args) {
        String s = "ttt";

        switch (s) {
            case "ttt" :
                System.out.println("Right value");
                break;
            default:
                System.out.println("Wrong value");
        }
    }
}
