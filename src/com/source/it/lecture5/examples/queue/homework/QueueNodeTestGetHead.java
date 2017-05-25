package com.source.it.lecture5.examples.queue.homework;

import com.source.it.lecture5.examples.queue.NodeQueueWrapper;
import com.source.it.lecture5.examples.queue.QueueNode;

public class QueueNodeTestGetHead {
    public static void main(String[] args) {
        NodeQueueWrapper queue = new NodeQueueWrapper(new QueueNode(1));
        queue.addNode(new QueueNode(2));
        queue.addNode(new QueueNode(5));
        queue.printQueue();

        System.out.println(queue.getHead().getValue());
        queue.printQueue();

        System.out.println(queue.getHead().getValue());
        queue.printQueue();

        System.out.println(queue.getHead().getValue());
        queue.printQueue();

        System.out.println(queue.getHead().getValue());
        queue.printQueue();
    }
}
