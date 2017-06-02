package com.source.it.lecture7.examples.custom;

import java.util.Random;

public class VirtualConnector implements AutoCloseable{
    private Random random = new Random();

    public String read() throws CustomException{
        int value = random.nextInt(5);
        if (value == 0) {
            throw new CustomException("read wasn't successfull");
        }
        return "String was read";
    }

    public void close() throws CustomException {
        int value = random.nextInt(5);
        if (value == 0) {
            throw new CustomException("Connection wasn't closed");
        }
        System.out.println("Closing connection");
    }
}
