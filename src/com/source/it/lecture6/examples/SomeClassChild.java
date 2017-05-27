package com.source.it.lecture6.examples;

import com.source.it.lecture6.examples.accessmodifiers.SomeClass;

public class SomeClassChild extends SomeClass {

    public SomeClassChild() {

    }

    @Override
    public void doWork() { //Don't never-ever do such way!
        super.doWork();
    }
}
