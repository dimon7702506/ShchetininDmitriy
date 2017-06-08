package com.source.it.lecture10.examples.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ReadWithBufferExample {
    public static final String FILE_NAME =
            /*"/Users/kblyumkin/Projects/AprilLectures/resources/fadeToBlack.txt"*/
        "/Users/kblyumkin/Projects/AprilLectures/resources/someBigFile.mp3";

    public static final int BUFFER_SIZE  = 2048;

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_NAME);
        InputStream is = null;
        try {

            for (int size = 128; size <= 32 * 1024; size*=2) {
                is = new FileInputStream(file);
                readWithBuffer(is, size);
                is.close();
            }
        } catch (IOException e) {
            throw new IOException("Error opening or reading file " + FILE_NAME, e);
        } finally {
            closeSilently(is);
        }
    }

    private static void closeSilently(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException ignore){
                /*NOP*/
            }
        }
    }

    private static void readWithBuffer(InputStream is, int size) throws IOException {
        byte[] buffer = new byte[size];
        int count;
        long start = System.currentTimeMillis();
        while ((count = is.read(buffer)) != -1) {
           /* System.out.println("Read " + count
                    + " bytes - " + Arrays.toString(buffer)
                    + new String(buffer, 0, count));*/
        }
        long end = System.currentTimeMillis();

        System.out.println("Size = " + size + " Taken " + (end - start) + " ms");
        //System.out.println("\n" + "The end!\n");
    }
}
