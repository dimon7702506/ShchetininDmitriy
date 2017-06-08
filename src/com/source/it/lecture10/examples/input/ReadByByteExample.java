package com.source.it.lecture10.examples.input;

import java.io.*;
import java.net.URL;


/* Not correct example - streams haven't been closed */
public class ReadByByteExample {
    private final static char NEW_LINE = '\n';
    public static void main(String[] args) throws IOException {

        InputStream fromFile = new FileInputStream(
                new File("/Users/kblyumkin/Projects/AprilLectures/resources/fadeToBlack.txt"));
        readByByte(fromFile);

        InputStream fromUrl = new URL("http://www.google.com").openStream();
        readByByte(fromUrl);

        InputStream fromByteArray = new ByteArrayInputStream(
                new byte[]{65, 12, 39, 64, 75, 86, 97});
        readByByte(fromByteArray);

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

}
