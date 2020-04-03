package com.bridgelabz.datastructure.linkedlist;

public class Implementation {

    public static void main( String[] args ) {

        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtStart( 10 );
        list.insertAtStart( 20 );
        list.insertAtStart( 30 );
        list.insertAtLast( 40 );
        list.remove();
        list.print();
        System.out.println("length : " + list.getLength());
    }
}
