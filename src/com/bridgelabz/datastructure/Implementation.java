package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.linkedlist.CircularLinkedList;
import com.bridgelabz.datastructure.linkedlist.LinkedList;

/**
 * Linked list Implementation class
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-03
 */

public class Implementation {

    public static void main( String[] args ) {
//        Linked list operations
        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtStart( 50 );
        list.insertAtStart( 40 );
        list.insertAtStart( 30 );
        list.insertAtStart( 30 );
        list.insertAtStart( 20);
        list.insertAtStart( 10 );
        list.insertAtStart( 10 );
        list.insertAtLast( 70 );
        LinkedList<Integer>.Node<Integer> headNode = list.insertAtStart( 5 );
        list.remove();
        list.print();
        System.out.println( "length : " + list.getLength() );

        System.out.println( "Alternate nodes of a linked list using Recursion : \n" );
        list.printAlternativeNodesUsingRecursion( headNode, true );
        list.removeDuplicateFromSortedList(headNode);
        System.out.println("after removing duplicates : ");
        list.print();


//        Bubble sort operations
        int[] intArray = {2, 5, 8, 1, 2, 6, 4, 7, 9, 2, 1, 8, 2, 5, 1, 6, 8, 5, 3, 4, 3, 4, 12, 6, 62};
        int[] sortedArray = new BubbleSorting().bubbleSort( intArray );
        System.out.println( "\nAfter sorting by bubble sort : " );
        for (int i : sortedArray) System.out.print( i + ", " );

        System.out.println( "\n\nAfter sorting by bubble sort : " );
        String[] stringArray = {"Ali", "All", "Zal", "Nal", "Hal"};
        String[] sortedStringArray = new BubbleSorting().bubbleSort( stringArray );
        for (String str : sortedStringArray) System.out.print( str + ", " );


        System.out.println("\n\nCircular linkedList : ");
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        CircularLinkedList.Node head = null;
        head = circularLinkedList.insertToCircularLinkedList( head, 15 );
        head = circularLinkedList.insertToCircularLinkedList( head, 14 );
        head = circularLinkedList.insertToCircularLinkedList( head, 13 );
        head = circularLinkedList.insertToCircularLinkedList( head, 22 );
        head = circularLinkedList.insertToCircularLinkedList( head, 17 );
        circularLinkedList.convertSinglyLinkedListToCircular( head );
        System.out.print( "Display Circular Linked List : \n" );
        circularLinkedList.displayCircularLinkedList( head );


    }
}
