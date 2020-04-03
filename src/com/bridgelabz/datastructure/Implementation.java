package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.linkedlist.LinkedList;

/**
 *  Linked list Implementation class
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-03
 */

public class Implementation {

    public static void main( String[] args ) {
//        Linked list operations
        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtStart( 10 );
        list.insertAtStart( 20 );
        list.insertAtStart( 30 );
        list.insertAtLast( 40 );
        list.remove();
        list.print();
        System.out.println("length : " + list.getLength());

//        Bubble sort operations
        int[] intArray = {2, 5, 8, 1, 2, 6, 4, 7, 9, 2, 1, 8, 2, 5, 1, 6, 8, 5, 3, 4, 3, 4, 12, 6, 62};
        int[] sortedArray = new BubbleSorting().bubbleSort( intArray );
        System.out.println( "After sorting by bubble sort : " );
        for (int i : sortedArray) System.out.print( i + ", " );

        System.out.println( "\n\nAfter sorting by bubble sort : " );
        String[] stringArray = {"Ali", "All", "Zal", "Nal", "Hal"};
        String[] sortedStringArray = new BubbleSorting().bubbleSort( stringArray );
        for (String str : sortedStringArray) System.out.print( str + ", " );
    }
}
