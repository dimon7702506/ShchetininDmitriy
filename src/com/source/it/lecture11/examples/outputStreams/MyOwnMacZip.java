package com.source.it.lecture11.examples.outputStreams;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class MyOwnMacZip {
    private static final String PATH =
            "/Users/kblyumkin/Projects/AprilLectures/resources/";
    private static final String[] TEXTS =
            {"fadeToBlack.txt", "nothingElseMatters.txt", "unforgiven.txt"};

    public static void main(String[] args) {
        for (String text : TEXTS) {
            File inFile = new File(PATH + text);
            File outFile = new File(PATH + text.replace(".txt", ".zip"));
            InputStream is = null;
            CounterOutputStream fos = null;
            try {
                is = new FileInputStream(inFile);
                fos = new CounterOutputStream(new BufferedOutputStream(new GZIPOutputStream(
                        new FileOutputStream(outFile))));
                readAndWriteWithBuffer(is, fos);
                System.out.println(fos.getCount() + " bytes written");
            } catch (IOException e) {
                System.out.println("Error opening or reading file " + inFile.getName());
            } finally {
                closeSilentlyInAndOut(is, fos);
            }
        }
    }

    private static void readAndWriteWithBuffer(InputStream is, OutputStream out) throws IOException {
        int count;
        byte[] buffer = new byte[10];
        while ((count = is.read(buffer)) != -1) {
            out.write(buffer, 0,  count);
        }
    }


    private static void closeSilentlyInAndOut(InputStream in, OutputStream out) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignore) {/*NOP*/}
        }
        if (out != null) {
            try {
                if ("GZIPOutputStream".equals(out.getClass().getSimpleName())) {
                    System.out.println("I'm GZipOS");
                }
                if (out instanceof GZIPOutputStream) {
                    GZIPOutputStream gzipOutputStream = (GZIPOutputStream) out;
                    gzipOutputStream.finish();
                }
                out.flush();
            } catch (IOException stillTryToClose) {
            } finally {
                try {
                    out.close();
                } catch (IOException ignore) {/*NOP*/}
            }
        }
    }
}
