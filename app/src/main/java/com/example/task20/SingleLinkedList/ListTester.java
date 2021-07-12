package com.example.task20.SingleLinkedList;

public class ListTester {
    public static void main (String[] args ) {
        SinglyLinkedList link = new SinglyLinkedList() ;
        link.add(4);
        link.add(3);
        link.add(5);
        link.add(1);
        link.remove(4);
        link.removeLast();
        link.printList();
    }
}
