package com.source.it.lecture10.examples;

import com.source.it.lecture9.examples.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork {

    private final static char NEW_LINE = '\n';

    public static void main(String[] args) {
        InputStream fromFile = null;
        try {
            fromFile = new FileInputStream(
                    new File("D:\\java\\projects\\resources\\creditBureau.properties"));
            readByByte(fromFile);
        } catch (IOException e) {
            System.err.println("Couldn't open file!!");
        } finally {
            closeInputStream(fromFile);
        }
    }

    private static void readByByte(InputStream is) throws IOException {
        int oneByte;

        Set<String> strings = new TreeSet<>();
        String tempString = "";

        while ((oneByte = is.read()) != -1) {
            tempString += (char) oneByte;
        }

        String[] split = tempString.split("\n");
        for (String current : split) {
            if (!current.startsWith("#") /*&& (!current.isEmpty()) && ("".equals(current))*/) {
                strings.add(current);
               // System.out.println("add ");
            }
            System.out.println(current);
        }
        System.out.println("====================================");
        System.out.print(strings);

    }

    private static void closeInputStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException ignore) {
                System.out.println("Couldn't close input stream");
            }
        } else {
            System.out.println("Input stream is null!!");
        }
    }
}