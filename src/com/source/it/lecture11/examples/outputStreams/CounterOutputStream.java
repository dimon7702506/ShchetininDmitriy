package com.source.it.lecture11.examples.outputStreams;

import java.io.IOException;
import java.io.OutputStream;

public class CounterOutputStream extends OutputStream {
    private OutputStream outputStream;
    private int count;

    public CounterOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void write(int b) throws IOException {
        count++;
        outputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        count += len;
        outputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        outputStream.close();
    }
}
