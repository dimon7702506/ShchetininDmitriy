package com.source.it.lecture5.examples.queue.homework;

import com.source.it.lecture5.examples.queue.NodeQueueWrapper;
import com.source.it.lecture5.examples.queue.QueueNode;

public class QueueNodeTestAddNode {
    public static void main(String[] args) {
        NodeQueueWrapper queue = new NodeQueueWrapper(new QueueNode(1));
        queue.addNode(new QueueNode(20));
        queue.addNode(new QueueNode(5));
        queue.printQueue();

        queue.addNode(2, new QueueNode(666));
        queue.printQueue();

    }
}
