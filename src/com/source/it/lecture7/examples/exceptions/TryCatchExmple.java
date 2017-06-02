package com.source.it.lecture7.examples.exceptions;

public class TryCatchExmple {
    public static void main(String[] args) {
        try {
            //int i = 0 / 0;
            throw new Throwable();
        } catch (RuntimeException | Error e) {
            System.out.println("RuntimeException caught");
        } catch(Throwable t) {
            System.out.println("Throwable caught");
        }
        System.out.println("Continue work");
    }
}
