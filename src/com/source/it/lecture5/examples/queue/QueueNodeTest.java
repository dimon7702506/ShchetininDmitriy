package com.source.it.lecture5.examples.queue;

public class QueueNodeTest {
    public static void main(String[] args) {
        NodeQueueWrapper queue = new NodeQueueWrapper(new QueueNode(1));
        queue.addNode(new QueueNode(2));
        queue.addNode(new QueueNode(5));
        queue.printQueue();
        //queue.printQueueRecurcive();

        System.out.println(queue.remove(2));
        queue.printQueue();

/*        System.out.println(queue.getHead().getValue());
        queue.printQueue();

        System.out.println(queue.getHead().getValue());
        queue.printQueue();

        System.out.println(queue.getHead().getValue());
        queue.printQueue();
*/
      //  System.out.println(queue.getHead().getValue());
       // queue.printQueue();
    }
}
