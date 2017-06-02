package com.source.it.lecture7.examples.enumExamples;

public class SimpleEnumExample {
    public static void main(String[] args) {
        SimpleEnum simpleEnum = SimpleEnum.ELEMENT1;
        SimpleEnum simple = SimpleEnum.ELEMENT1;
        System.out.println(simple == simpleEnum);
    }
}
