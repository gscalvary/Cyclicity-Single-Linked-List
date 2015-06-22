package com.oliver;

public class LinkedListEntry<T> {

    private T data;
    private LinkedListEntry<T> next;

    LinkedListEntry(T data) {

        this.data = data;
        next = null;
    }

    public T getData() {

        return data;
    }

    public LinkedListEntry<T> getNext() {

        return next;
    }

    public void setNext(LinkedListEntry<T> next) {

        this.next = next;
    }
}
