package com.source.it.lecture10.examples.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class ReadWithDecorator {
    public static final String FILE_NAME = "/Users/kblyumkin/Projects/AprilLectures/resources/unforgiven.zip";
    public static final int BUFFER_SIZE  = 10;

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_NAME);
        InputStream is = null;
        try {
            is = new GZIPInputStream(new FileInputStream(file));
            readWithBuffer(is);
        } catch (IOException e) {
            throw new IOException("Error opening or reading file " + FILE_NAME, e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException ignoreMe) {
                    /*NOP*/
                }
            }
        }
    }

    private static void readWithBuffer(InputStream is) throws IOException {
        byte[] buffer = new byte[BUFFER_SIZE];
        int count;
        while ((count = is.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, count));
        }
        System.out.println("\n" + "The end!\n");
    }

}
