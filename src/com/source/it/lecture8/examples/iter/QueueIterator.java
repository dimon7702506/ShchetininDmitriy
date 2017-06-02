package com.source.it.lecture8.examples.iter;

import java.util.Iterator;

public class QueueIterator<T> implements Iterator<T> {

    private Node<T> current;

    public QueueIterator(Node<T> tail) {
        current = tail;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T result = current.getValue();
        current = current.getNext();
        return result;
    }

    @Override
    public void remove() {
        throw new IllegalStateException();
    }


}
