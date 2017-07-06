package com.source.it.lecture10.examples.output;

import java.io.*;

public class FileToByteArrayByByteExample {
    public static final String PATH = "D:\\java\\projects\\resources\\";
    private static final String[] TEXTS = {"fadeToBlack.txt", "nothingElseMatters.txt", "unforgiven.txt"};

    public static void main(String[] args) {
        for (String text : TEXTS) {
            File file = new File(PATH + text);
            //InputStream is = null;
            //ByteArrayOutputStream baos = null;
            try (InputStream is = new FileInputStream(file);
                 ByteArrayOutputStream baos = new ByteArrayOutputStream()){
                /*is = new FileInputStream(file);*/
                //baos = new ByteArrayOutputStream();
                System.out.println(new String(readAndWriteByByte(is, baos)) + "\n \n The END! \n \n ");
                baos.flush();
            } catch (IOException e) {
                System.out.println("Error opening or reading file " + file.getName());
            } /*finally {
                closeSilentlyInAndOut(is, baos);
            }*/
        }
    }

    private static byte[] readAndWriteByByte(InputStream is, ByteArrayOutputStream out) throws IOException {
        int oneByte;
        while ((oneByte = is.read()) != -1) {
            out.write(oneByte);
        }
        return out.toByteArray();
    }


    private static void closeSilentlyInAndOut(InputStream in, OutputStream out) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignore) {/*NOP*/}
        }
        if (out != null) {
            try {
                out.flush();
            } catch (IOException stillTryToClose) {
                try {
                    out.close();
                } catch (IOException ignore) {/*NOP*/}
            }
        }
    }
}
