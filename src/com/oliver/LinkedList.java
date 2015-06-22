package com.oliver;

public class LinkedList<T> {

    private LinkedListEntry<T> head;

    LinkedList() {

        head = null;
    }

    public void insert(T data) {

        LinkedListEntry<T> entry = new LinkedListEntry<T>(data);

        if(head == null) {
            head = entry;
        } else {
            LinkedListEntry<T> tail = head;
            while (true) {
                if(tail.getNext() == null) {
                    tail.setNext(entry);
                    break;
                } else {
                    tail = tail.getNext();
                }
            }
        }
    }

    public void insert(LinkedListEntry<T> entry) {

        if(head == null) {
            head = entry;
        } else {
            LinkedListEntry<T> tail = head;
            while (true) {
                if(tail.getNext() == null) {
                    tail.setNext(entry);
                    break;
                } else {
                    tail = tail.getNext();
                }
            }
        }
    }

    public LinkedListEntry<T> getHead() {

        return head;
    }

    public void setHead(LinkedListEntry<T> head) {

        this.head = head;
    }

    public void print() {

        LinkedListEntry<T> entry = head;

        while(entry != null) {
            System.out.print(entry.getData() + " ");
            entry = entry.getNext();
        }

        System.out.println();
    }
}
