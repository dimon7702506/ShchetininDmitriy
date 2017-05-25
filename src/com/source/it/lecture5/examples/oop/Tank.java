package com.source.it.lecture5.examples.oop;

import static java.lang.Math.*;

public class Tank {
    private int x;
    private int y;
    private int speed = 20;
    private GunInterface gun;
    private int ammo = 2;

    public Tank(int x, int y, GunInterface gun) {
        this.x = x;
        this.y = y;
        this.gun = gun;
    }

    public void move(int x, int y) {

        double length = sqrt(pow(x - this.x, 2) + pow(y - this.y, 2));
        double time = length / speed;
        System.out.println("Movement took " + time + " s");
        this.x = x;
        this.y = y;
    }

    public void shoot() {
        if (!gun.isLoaded()) {
            if (ammo == 0) {
                System.out.println("Out of ammo");
                return;
            }
            gun.load();
            ammo--;
        }
        gun.shoot();
    }
}
