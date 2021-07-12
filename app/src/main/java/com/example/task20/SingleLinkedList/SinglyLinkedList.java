package com.example.task20.SingleLinkedList;

import android.util.Log;

public class SinglyLinkedList {
    public Node head;
    public Node rear;
    int counter;

    public SinglyLinkedList() {
        this.head = null;
        this.counter = 0;
        this.rear = head;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
            Log.d("caution", "added");
            counter++;
        }
    }

    public void removeLast() {
        Node tail = null;
        if (head == null) {
            return;
        }
        if (head != tail) {
            Node current = head;

            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            tail.next = null;
        } else {
            head = tail = null;
        }
    }


    public void remove(int value) {
        Node temp = null;
        if (head == null) {
            return;
        }
        Node runner = head;
        if (runner.next != null && runner.value == value) {
            head = runner.next;
            return;
        }
        while (runner != null && runner.value != value) {
            temp = runner;
            runner = runner.next;

        }
        temp.next = runner.next;
        counter--;
    }

    public void printList() {
        Node newNode = head;
        while (newNode != null) {
            System.out.print(newNode.value + "   ");
            newNode = newNode.next;
        }
    }

    public int find(int value) {
        Node current = head;
        int index = 0;
        if (head == null) {
            return -1;
        }
        while (current.next != null) {
            index++;
            if (current.value == value) {
                return index;
            }
        }
        return -1;


    }

}


