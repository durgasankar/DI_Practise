package com.bridgelabz.datastructure.linkedlist;
/**
 * Circular LinkedList Implementation
 * => converting from singly to circular linked list
 * => insert to circular linkedList
 * => display all data of circular LinkedList.
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-04
 */
public class CircularLinkedList {
    public static class Node {
        private int data;
        private Node next;
    }

    public  void convertSinglyLinkedListToCircular( Node head ) {
        Node start = head;
        while (head.next != null)
            head = head.next;
        head.next = start;
    }

    public Node insertToCircularLinkedList( Node head, int data ) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        return head;
    }

    public void displayCircularLinkedList( Node node ) {
        Node start = node;
        while (node.next != start) {
            System.out.print( node.data + " -> " );
            node = node.next;
        }
        System.out.print( node.data );
    }

}
