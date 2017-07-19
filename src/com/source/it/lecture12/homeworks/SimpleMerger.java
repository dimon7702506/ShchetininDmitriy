package com.source.it.lecture12.homeworks;

public class SimpleMerger {

    private int[] array, sorted;

    public SimpleMerger( int[] array ) {
        this.array = array;
    }

    public void sort() {
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

            SimpleMerger leftSort = new SimpleMerger( left );
            SimpleMerger rightSort = new SimpleMerger( right );

            leftSort.sort();
            rightSort.sort();

            sorted = merge( leftSort.getSorted(), rightSort.getSorted() );
        }
    }

    public static int[] merge( int[] leftPart, int[] rightPart ) {
        int cursorLeft = 0, cursorRight = 0, counter = 0;
        int[] merged = new int[leftPart.length + rightPart.length];

        while ( cursorLeft < leftPart.length && cursorRight < rightPart.length ) {
            if ( leftPart[cursorLeft] <= rightPart[cursorRight] ) {
                merged[counter] = leftPart[cursorLeft];
                cursorLeft++;
            } else {
                merged[counter] = rightPart[cursorRight];
                cursorRight++;
            }
            counter++;
        }

        if ( cursorLeft < leftPart.length ) {
            System.arraycopy( leftPart, cursorLeft, merged, counter, merged.length - counter );
        }
        if ( cursorRight < rightPart.length ) {
            System.arraycopy( rightPart, cursorRight, merged, counter, merged.length - counter );
        }

        return merged;
    }

    public int[] getSorted() {
        return sorted;
    }
}
