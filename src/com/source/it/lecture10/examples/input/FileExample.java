package com.source.it.lecture10.examples.input;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("/Users/kblyumkin/Projects/AprilLectures/resources/fadeToBlack.txt");

        for (char x = 65; x < 88; x++) {
            System.out.print(x);
        }
    }
}
