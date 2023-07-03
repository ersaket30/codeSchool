package com.coding.school.datastructure.linkedList;

import practice.datastructure.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class DetectALoopInLinkedList {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insert(20);
        llist.insert(4);
        llist.insert(15);
        llist.insert(10);
        llist.head.next.next.next.next = llist.head;
        containsLoop(llist);
    }

    private static void containsLoop(LinkedList myLink) {
        Set<LinkedList.Node> myset = new HashSet<>();
        LinkedList.Node currentNode = myLink.head;
        LinkedList.Node previousNode = null;
        while (currentNode!=null){
            if(myset.contains(currentNode)) {
                System.out.println("Linked list contains loop...");
                System.out.println("deleting ...");
                previousNode.next = null;
                break;
            }
            else myset.add(currentNode);
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        myLink.display();
    }
}
