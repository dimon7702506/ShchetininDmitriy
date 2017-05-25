package com.source.it.lecture5.examples.oop;

import com.source.it.lecture2.examples.oop.User;

public class SuperGun extends AbstractGun {

    @Override
    public void shoot() {
        System.out.println("Shoot!!!!");
        System.out.println("Damage done 1000");
        loaded = false;
    }
}
