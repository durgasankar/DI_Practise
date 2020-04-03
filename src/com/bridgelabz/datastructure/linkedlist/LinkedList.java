package com.bridgelabz.datastructure.linkedlist;

import java.util.NoSuchElementException;

/**
 * Linked list class which has the functionality of
 * => adding a node at first
 * => adding a node at last
 * => removing a node from last
 * => print all nodes
 * => print alternate nodes of a linked list using recursion
 *
 * @param <G> generic type
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-05-03
 */

public class LinkedList<G> {
    /**
     * Generic type inner Node class
     *
     * @param <G> generic type
     * @author Durgasankar Mishra
     * @version 1.8
     * @created 2020-04-03
     */
    public class Node<G> {
        private G data;
        private Node<G> next;

        public Node( G data ) {
            this.data = data;
            this.next = null;
        }

        public G getData() {
            return data;
        }
    }

    private Node<G> head;
    private long length;

    public LinkedList() {
        this.head = null;
        this.length = 0;
    }

    public long getLength() {
        return length;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void print() {
        Node<G> current = head;
        while (current != null) {
            System.out.print( current.data + " -> " );
            current = current.next;
        }
        System.out.println( "null" );
    }

    public Node<G> insertAtStart( G data ) {
        Node<G> newNode = new Node<>( data );
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
        return newNode;
    }

    public Node<G> insertAtLast( G data ) {
        Node<G> newNode = new Node<G>( data );
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<G> current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
        length++;
        return newNode;
    }

    public G remove() {
        Node<G> current = head;
        if (isEmpty()) {
            throw new NoSuchElementException( "\nEmpty List! Deletion not possible..." );
        } else if (length == 1) {
            head = null;
            length--;
            return current.data;
        } else {
            while (current.next.next != null) {
                current = current.next;
            }
            G removedData = current.next.data;
            current.next = null;
            length--;
            return removedData;
        }
    }

    public void printAlternativeNodesUsingRecursion(Node headNode, boolean isOdd){
        if (headNode == null) return;
        if (isOdd)
            System.out.print( headNode.data + " " );
        printAlternativeNodesUsingRecursion( headNode.next, !isOdd );
    }

    public Node removeDuplicateFromSortedList( Node headNode){
        if (headNode == null)
            return null;
        /*Remove duplicate from the list after head node*/
        headNode.next = removeDuplicateFromSortedList( headNode.next );

        if (headNode.next != null && headNode.next.data == headNode.data)
            return headNode.next;
        return headNode;
    }

}
