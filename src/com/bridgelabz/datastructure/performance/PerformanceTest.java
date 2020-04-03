package com.bridgelabz.datastructure.performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Performance testing between ArrayList and LinkedList
 * => time consumption on adding
 * => time consumption on removing
 * => time consumption on iterating
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-03
 */
public class PerformanceTest {

    private void iterateTillEnd( List<Long> integers ) {
        for (long i = 0; i < integers.size(); i++)
            if (i == integers.size() - 1) {
                System.out.println( "End reached" );
                break;
            }
    }

    private void addElements( List<Long> integerList, long range ) {
        for (long i = 1; i <= range; i++) integerList.add( i );
    }

    private void updateLastElement( List<Long> integerList ) {
        integerList.add( 0, (long) 5 );
    }

    public static void main( String[] args ) {
        PerformanceTest test = new PerformanceTest();
        List<Long> arrayList = new ArrayList<>();
        List<Long> linkedList = new LinkedList<>();

//        Adding data performance checking
//        ArrayList
        long beforeStart = System.currentTimeMillis();
        test.addElements( arrayList, 25000000 );
        long afterEnd = System.currentTimeMillis();
        System.out.println( "Time taken in ms to add 25 million elements in ArrayList : " + (afterEnd - beforeStart) );

//        LinkedList
        long beforeAddToLinkedList = System.currentTimeMillis();
        test.addElements( linkedList, 25000000 );
        long afterAddToLinkedList = System.currentTimeMillis();
        System.out.println( "Time taken in ms to add 25 million elements in LinkedList : " + (afterAddToLinkedList - beforeAddToLinkedList) );

//        Time taken in ms to add 10 million elements in ArrayList : 2338
//        Time taken in ms to add 10 million elements in LinkedList : 6249

//        Iterate till end Performance checking.
//        ArrayList
        long beforeIterateArrayList = System.currentTimeMillis();
        test.iterateTillEnd( arrayList );
        long afterIterateArrayList = System.currentTimeMillis();
        System.out.println( "Time taken in ms to iterate 25 million elements in ArrayList : " + (afterIterateArrayList - beforeIterateArrayList) );

//        LinkedList
        long beforeIterateLinkedList = System.currentTimeMillis();
        test.iterateTillEnd( linkedList );
        long afterIterateLinkedList = System.currentTimeMillis();
        System.out.println( "Time taken in ms to iterate 25 million elements in Linked : " + (afterIterateLinkedList - beforeIterateLinkedList) );

//        Time taken in ms to iterate 25 million elements in ArrayList : 50
//        Time taken in ms to iterate 25 million elements in Linked : 36 (keeps on changing)


//        update operation in linked list
//        ArrayList
        long beforeUpdatingArrayList = System.currentTimeMillis();
        test.updateLastElement( arrayList );
        long afterUpdatingArrayList = System.currentTimeMillis();
        System.out.println( "Time taken in ms to update 25 million th elements in ArrayList : " + (afterUpdatingArrayList - beforeUpdatingArrayList) );

//        LinkedList
        long beforeUpdatingLinkedList = System.currentTimeMillis();
        test.updateLastElement( linkedList );
        long afterUpdatingLinkedList = System.currentTimeMillis();
        System.out.println( "Time taken in ms  to update 25 million th elements in Linked : " + (afterUpdatingLinkedList - beforeUpdatingLinkedList) );

//        Time taken in ms to update first elements in ArrayList : 130
//        Time taken in ms to first elements in Linked : 0


    }
}
