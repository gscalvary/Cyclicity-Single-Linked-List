package com.oliver;

import java.util.HashSet;

public class LinkedListCycleChecker {

    public LinkedListEntry checkCycle(LinkedList ll) {

        if(ll == null) throw new IllegalArgumentException();

        HashSet<LinkedListEntry> hs = new HashSet<LinkedListEntry>();
        LinkedListEntry entry = ll.getHead();
        LinkedListEntry prev = null;

        while(entry != null) {
            if(hs.contains(entry)) {
                return prev;
            } else {
                hs.add(entry);
                prev = entry;
                entry = entry.getNext();
            }
        }

        return null;
    }
}