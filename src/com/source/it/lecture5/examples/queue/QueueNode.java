package com.source.it.lecture5.examples.queue;

public class QueueNode {
    private int value;
    private QueueNode next;

    public QueueNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    public QueueNode getNext() {
        return next;
    }
}
