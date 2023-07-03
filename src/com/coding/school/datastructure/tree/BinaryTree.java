package com.coding.school.datastructure.tree;

public class BinaryTree {

    Node root;

    class Node{
        int data;
        Node left;
        Node right;

        Node(int value){
            this.data = value;
            right = null;
            left = null;
        }
    }

     private Node addRecursivly(Node current, int data){
        if(current == null){
            return new Node(data);
        }
        if(data<current.data){
            current.left = addRecursivly(current.left, data);
        }else if (data>current.data){
            current.right = addRecursivly(current.right,data);
         }else{
            return current;
         }
        return current;
    }

    public void add(int value){
        root = addRecursivly(root,value);
    }

    public boolean containsValue(int value){
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(Node current, int value) {
        if(current == null){
            return false;
        }
        if(current.data == value){
            return true;
        }

        return value < current.data ? containsRecursive(current.left,value) : containsRecursive(current.right,value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public void showTreeElement(){
        traverseInOrder(root);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        System.out.println(bt.containsValue(4));
        bt.showTreeElement();
    }
}
