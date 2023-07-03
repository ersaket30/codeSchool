package com.coding.school.datastructure.linkedList;

public class SinglyLinkedList {

    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    private void reverseList() {
        Node previous = null;
        Node current = head;
        while (current!=null){
            Node nextPointer = current.next;
            current.next = previous;
            previous = current;
            current = nextPointer;
        }
    }
    private void findMiddleElement() {
        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer !=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        System.out.println("Middle element is::::: "+slowPointer.data+ " ::::");
    }
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            Node last = head;
            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void display(){
        Node current = head;
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {

        SinglyLinkedList sList = new SinglyLinkedList();

        //Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        //Displays the nodes present in the list
        sList.display();
    }
}
