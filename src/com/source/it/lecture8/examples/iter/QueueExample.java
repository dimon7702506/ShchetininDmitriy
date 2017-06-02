package com.source.it.lecture8.examples.iter;

import java.util.Iterator;

public class QueueExample {
    public static void main(String[] args) {
       /* Queue<Integer> queue = new Queue<>();
        queue.add(5);
        queue.add(15);
        queue.add(51);
        queue.add(17);
        System.out.println(queue);*/

        Queue<String> stringQueue = new Queue<>();
        stringQueue.add("123");
        stringQueue.add("XZD");
        stringQueue.add("Gftaf");
        stringQueue.add("234");
        stringQueue.add("rfv");

        System.out.println("Before: " + stringQueue);

        stringQueue.iterator();

        /*for (String s : stringQueue) {
            System.out.print(s + " -> ");
        }*/
    }
}
