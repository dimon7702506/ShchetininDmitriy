package com.source.it.lecture10.examples.input;

import java.io.*;
import java.net.URL;

public class ReadByByteExampleFixed {
    private final static char NEW_LINE = '\n';
    public static void main(String[] args) {
        InputStream fromFile = null;
        try {
            fromFile = new FileInputStream(
                    new File("/Users/kblyumkin/Projects/AprilLectures/resources/fadeToBlack.txt"));
            readByByte(fromFile);
        } catch (IOException e) {
            System.out.println("Couldn't open file!!");
        } finally {
            closeInputStream(fromFile);
        }

        InputStream fromUrl = null;
        try {
            fromUrl = new URL("http://www.google.com").openStream();
            readByByte(fromUrl);
        } catch (IOException e) {
            System.out.println("Couldn't open url!!");
        } finally {
            closeInputStream(fromUrl);
        }


        try (InputStream fromByteArray = new ByteArrayInputStream(
                new byte[]{65, 12, 39, 64, 75, 86, 97})) {
            readByByte(fromByteArray);
        } catch (IOException e) {
            System.out.println("Exception! " + e.getMessage());
        }
    }

    /*private static void readByByte(InputStream is) throws IOException{
        int oneByte;
        while (true) {
            oneByte = is.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.println(NEW_LINE + "The end!" + NEW_LINE);
                break; //while
            }
        }
    }*/

    private static void readByByte(InputStream is) throws IOException{
        int oneByte;
        while ((oneByte = is.read()) != -1) {
            System.out.print((char) oneByte);
        }
        System.out.println(NEW_LINE + "The end!" + NEW_LINE);
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
