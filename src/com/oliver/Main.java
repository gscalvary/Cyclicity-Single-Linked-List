package com.oliver;

public class Main {

    private static LinkedListCycleChecker linkedListCycleChecker;

    public static void main(String[] args) {

        LinkedList<Integer> nonCyclicalLinkedList = new LinkedList<Integer>();
        nonCyclicalLinkedList.insert(1);
        nonCyclicalLinkedList.insert(2);
        nonCyclicalLinkedList.insert(3);
        //nonCyclicalLinkedList.print();

        LinkedList<Integer> cyclicalLinkedList = new LinkedList<Integer>();
        cyclicalLinkedList.insert(1);
        cyclicalLinkedList.insert(2);
        LinkedListEntry<Integer> cycle = new LinkedListEntry<Integer>(3);
        cycle.setNext(cyclicalLinkedList.getHead());
        cyclicalLinkedList.insert(cycle);
        //cyclicalLinkedList.print();

        linkedListCycleChecker = new LinkedListCycleChecker();
        check("nonCyclicalLinkedList", nonCyclicalLinkedList);
        check("cyclicalLinkedList", cyclicalLinkedList);
    }

    private static void check(String name, LinkedList ll) {

        LinkedListEntry entry = linkedListCycleChecker.checkCycle(ll);

        if(entry == null) {
            System.out.println("\n" + name + " has no cycle.");
        } else {
            System.out.println("\n" + name + " has a cycle in the entry whose data is: " + entry.getData());
        }
    }
}
