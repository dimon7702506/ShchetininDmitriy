package com.source.it.lecture11.examples.readerwriter;

import java.io.*;

public class ReaderWriterExample {
    private static final String PATH = "/Users/kblyumkin/Projects/AprilLectures/resources/";
    private static final String[] TEXTS = {"fadeToBlack.txt", "nothingElseMatters.txt", "unforgiven.txt"};
    public static void main(String[] args) throws IOException {
        for (String text : TEXTS) {

            BufferedReader reader = new BufferedReader(
                    new FileReader(
                            new File(PATH + text)));
            Writer writer = new BufferedWriter(
                    new FileWriter(
                            new File(PATH + text.replace(".txt", ".bak"))));


            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.write(line + "\n");
            }



            writer.flush();
            writer.close();
            reader.close();
            System.out.println("\n \n THE END! \n \n");
        }
    }
}
