package com.source.it.lecture8.examples.lists;

import java.util.Random;

public class SimpleClass {
    private int i;
    private String str;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
/*
    @Override
    public boolean equals(Object o) {
       return new Random().nextBoolean();
   }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleClass)) return false;

        SimpleClass that = (SimpleClass) o;

        if (i != that.i) return false;
        return !(str != null ? !str.equals(that.str) : that.str != null);

    }

    @Override
    public int hashCode() {
        return new Random().nextInt(3);
    }

    @Override
    public String toString() {
        return "SimpleClass{" +
                "i=" + i +
                ", str='" + str + '\'' +
                '}';
    }
}
