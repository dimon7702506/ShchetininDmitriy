package com.source.it.lecture4.examples.oop;

public class Manager extends Employee {
    private Employee[] employees;

    public Manager() {
        System.out.println("In Manager constuctor");
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
