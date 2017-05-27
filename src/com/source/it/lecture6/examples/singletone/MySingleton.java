package com.source.it.lecture6.examples.singletone;

public class MySingleton {
    private static MySingleton instance;
    private static int counter = 0;

    /*static {
        instance = new MySingleton();
    }*/

    private MySingleton() {
        counter++;
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }

    public static void printInstancesCount() {
        System.out.println("Totaly " + counter + " instances were created");
    }
}
