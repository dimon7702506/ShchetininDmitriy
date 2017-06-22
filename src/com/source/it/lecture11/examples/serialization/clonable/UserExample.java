package com.source.it.lecture11.examples.serialization.clonable;

public class UserExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User(25, "John", "Black",
                new Address("Kharkov", "Sumska", 5));
        User copy;// = new User(user.getAge(), user.getName(), user.getLastName());
        //copy = user.copy();
        //System.out.println(copy);
        User clone = (User)user.clone();
        user.setAge(26);
        user.setName("Mike");
        user.getAddress().setCity("Kiev");
        System.out.println(clone);

    }
}
