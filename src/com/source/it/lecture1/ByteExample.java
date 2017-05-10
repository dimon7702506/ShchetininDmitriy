package com.source.it.lecture1;

public class ByteExample {
    public static void main(String[] args) {
        byte b = 127;
        byte c = 3;

        System.out.println(b + 1);
        System.out.println(++b);
        System.out.println(b);
        System.out.println(c++ + ++c);

        System.out.println((5 + b) * ++c);

        System.out.println(63 % 10);
    }
}
