package com.source.it.lecture4.examples;

import com.source.it.lecture4.examples.oop.Employee;
import com.source.it.lecture4.examples.oop.Manager;

public class Example {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        manager.setName("John");
        manager.setLastName("Smith");


        System.out.println(manager);

    }
}
