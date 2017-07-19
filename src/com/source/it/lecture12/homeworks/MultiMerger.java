package com.source.it.lecture12.homeworks;

public class MultiMerger extends Thread {

    private int[] array, sorted;

    private static final int MAX_THREADS = 9;

    public MultiMerger(int[] array) {
        this.array = array;
    }

    public void run() {
        int middle;
        int[] left, right;

        if ( array.length <= 1 ) {
            sorted = array;
        } else {

            middle = array.length / 2;

            left = new int[middle];
            right = new int[array.length - middle];

            System.arraycopy( array, 0, left, 0, middle );
            System.arraycopy( array, middle, right, 0, array.length - middle );

            if ( activeCount() < MAX_THREADS ) {
                MultiMerger leftSort = new MultiMerger( left );
                MultiMerger rightSort = new MultiMerger( right );

                leftSort.start();
                rightSort.start();

                try {
                    leftSort.join();
                    rightSort.join();

                    sorted = SimpleMerger.merge( leftSort.getSorted(), rightSort.getSorted() );
                } catch ( Exception e ) {

                }

            } else {
                SimpleMerger leftSort = new SimpleMerger( left );
                SimpleMerger rightSort = new SimpleMerger( right );

                leftSort.sort();
                rightSort.sort();

                sorted = SimpleMerger.merge( leftSort.getSorted(), rightSort.getSorted() );
            }

        }
    }

    public int[] getSorted() {
        return sorted;
    }
}