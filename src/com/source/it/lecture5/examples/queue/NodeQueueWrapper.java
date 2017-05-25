package com.source.it.lecture5.examples.queue;

public class NodeQueueWrapper {
    private QueueNode tail;

    public NodeQueueWrapper(QueueNode node) {
        tail = node;
    }

    public void addNode(QueueNode node) {
        node.setNext(tail);
        tail = node;
    }

    public QueueNode getHead() {
        QueueNode prev = tail;

        if (prev.getNext() != null) {
            QueueNode current = tail.getNext();

            while (current.getNext() != null) {
                current = current.getNext();
                prev = prev.getNext();
            }
            prev.setNext(null);

            return current;
        } else {
            return prev;
        }
    }

    public void printQueue() {
        QueueNode current = tail;
        while (current != null) {
            System.out.print(current.getValue() + " --> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public void printQueueRecurcive() {
        printRecurcive(tail);
        System.out.println("null");
    }

    private void printRecurcive(QueueNode current) {
        System.out.print(current.getValue() + " --> ");
        if (current.getNext() != null) {
            printRecurcive(current.getNext());
        }
    }

    /**
     * Removes Node from list that is located on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     **/
    public int remove(int position) {
        /*Your code here*/
        int QueueSize = 0;

        QueueNode current = tail;
        QueueNode prev = tail;

        while (current != null) {
            current = current.getNext();
            QueueSize ++;
        }

        if (position > QueueSize) {
            System.out.println("The position is more than list size. Queue size is " + QueueSize);
            return 0;
        }

        current = tail;
        prev = tail;

        int pos = QueueSize;

        while (current != null){
            //System.out.println("pos " + pos);

            if (pos == position){
                prev.setNext(current.getNext());
                return current.getValue();
            }

            current = current.getNext();

            if (pos != QueueSize) {
                prev = prev.getNext();
            }
            //System.out.println("prev = " + prev.getValue() + " current = " + current.getValue());
            pos --;
        }
        return -1;
        }

    /**
     * Adds Node to list on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     * @param node node should be inserted at position
     */
    public void addNode(int position, QueueNode node) {
        /*Your code here*/
        int QueueSize = 0;
        QueueNode current = tail;

        while (current != null) {
            current = current.getNext();
            QueueSize ++;
        }
        if (position > QueueSize) {
            System.out.println("The position is more than list size. Queue size is " + QueueSize);
            return;
        }

        int pos = QueueSize;
        current = tail;

        while (current != null){

            if (pos == position){
                node.setNext(current.getNext());
                current.setNext(node);
                break;
            }
            current = current.getNext();
            pos --;
        }
    }

    /**
     * Gets then Node that located on the position starting from the tail (end of the list)
     * if position is more than list size - prints error message
     * @param position number of the Node starting from the tail
     * @return Node that located on the position from the tail (end of list) if position exists in list
     */
    public QueueNode getFromHead(int position) {
        /*Your code here and please remove "return null". I've put it for ability to compile code*/
        return null;
    }
}
