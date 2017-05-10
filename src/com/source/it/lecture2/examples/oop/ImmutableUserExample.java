package com.source.it.lecture2.examples.oop;

import com.sun.org.apache.bcel.internal.generic.IUSHR;

public class ImmutableUserExample {
    public static void main(String[] args) {
        //new ImmutableUser();
        ImmutableUser user = new ImmutableUser("John", "Smith", 25);

        ImmutableUser.sayHi();
        user.sayHi();
        user.greet();
    }
}
