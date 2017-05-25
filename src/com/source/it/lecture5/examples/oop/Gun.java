package com.source.it.lecture5.examples.oop;

public class Gun extends AbstractGun {

    @Override
    public void shoot() {
        System.out.println("Shoot!!!!");
        System.out.println("Damage done 5");
        loaded = false;
    }
}
