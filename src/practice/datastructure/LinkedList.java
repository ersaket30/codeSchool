package practice.datastructure;

public class LinkedList {
    public Node head;
    public class Node{
        public int data;
        public Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList myLinkList = new LinkedList();
        myLinkList.insert(12);
        myLinkList.insert(1);
        myLinkList.insert(10);
        myLinkList.insert(90);
        myLinkList.insert(23);
        myLinkList.insert(40);
        myLinkList.display();
        myLinkList.findMiddleElement();
        myLinkList.reverseList();
        myLinkList.display();

        // 1,12,90,10,40,23
    }

    public void reverseList() {
        Node previous = null;
        Node current = head;
        while (current!=null){
            Node nextPointer = current.next;
            current.next = previous;
            previous = current;
            current = nextPointer;
        }
    }
    public void findMiddleElement() {
        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer !=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        System.out.println("Middle element is::::: "+slowPointer.data+ " ::::");
    }

    public void display() {
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

     public void insert(int i) {
        Node node = new Node(i);
        if(head == null){
            head = node;
        }else {
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next = node;
        }
    }
}
