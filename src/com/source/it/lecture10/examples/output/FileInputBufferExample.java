package com.source.it.lecture10.examples.output;

import java.io.*;

public class FileInputBufferExample {
    private static final String FILE_NAME =
            "/Users/kblyumkin/Projects/AprilLectures/resources/someBigFile.mp3";


    public static void main(String[] args) {
        File file = new File(FILE_NAME);
        InputStream is = null;
        try {
            for (int bufferSize = 1; bufferSize <= 32 * 1024; bufferSize *= 2) {
                long startTime = System.currentTimeMillis();
                is = new BufferedInputStream(
                        new FileInputStream(file), 8 * 1024);

                readWithBuffer(is, bufferSize);
                long endTime = System.currentTimeMillis();

                System.out.println("Elapsed time " + (endTime - startTime) + " ms with buffer " + bufferSize);
            }
        } catch (IOException e) {
            System.out.println("Error opening or reading file " + file.getName());
        } finally {
            closeSilentlyInAndOut(is);
        }

    }

    private static void readWithBuffer(InputStream is, int bufferSize) throws IOException {
        int count;
        byte[] buffer = new byte[bufferSize];
        while ((count = is.read(buffer)) != -1) {
            //String read = Arrays.toString(buffer);
        }
    }

    private static void closeSilentlyInAndOut(InputStream in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignore) {/*NOP*/}
        }
    }
}
