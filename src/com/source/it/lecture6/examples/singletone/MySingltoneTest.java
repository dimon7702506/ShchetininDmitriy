package com.source.it.lecture6.examples.singletone;

public class MySingltoneTest {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        MySingleton anotherMySingleton = MySingleton.getInstance();

        MySingleton.printInstancesCount();
        System.out.println(mySingleton.equals(anotherMySingleton));


    }
}
