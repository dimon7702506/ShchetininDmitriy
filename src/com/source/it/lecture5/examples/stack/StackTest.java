package com.source.it.lecture5.examples.stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(5) {{
            //System.out.println(pop());
            print();
            push(1);
            push(5);
            push(10);
            push(17);
            push(33);
            push(179);
            push(180);
            push(181);
        }};
        stack.print();
        System.out.println("Peeking " + stack.peek());
        System.out.println("Popping " + stack.pop());
        System.out.println("Popping " + stack.pop());
        System.out.println("Popping " + stack.pop());
        System.out.println("Popping " + stack.pop());
        System.out.println("Popping " + stack.pop());
        stack.print();
    }
}
