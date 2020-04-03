package com.bridgelabz.datastructure.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<G> {
    private class Node<G> {
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

    public boolean isEmpty(){
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

    public boolean insertAtStart( G data ) {
        Node<G> newNode = new Node<>( data );
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
        return true;
    }

    public boolean insertAtLast( G data ) {
        Node<G> newNode = new Node<G>( data );
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<G> current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
        length++;
        return true;
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


}
