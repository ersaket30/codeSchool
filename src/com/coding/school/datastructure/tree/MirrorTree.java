package com.coding.school.datastructure.tree;

class Node2
{
    int data;
    Node2 left = null, right = null;

    Node2(int data) {
        this.data = data;
    }
}

class MirrorTree
{
    // Function to perform preorder traversal on a given binary tree
    public static void preorder(Node2 root)
    {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Utility function to swap left subtree with right subtree
    public static void swap(Node2 root)
    {
        if (root == null) {
            return;
        }

        Node2 temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    // Function to convert a given binary tree into its mirror
    public static void convertToMirror(Node2 root)
    {
        // base case: if the tree is empty
        if (root == null) {
            return;
        }

        // convert left subtree
        convertToMirror(root.left);

        // convert right subtree
        convertToMirror(root.right);

        // swap left subtree with right subtree
        swap(root);
    }

    public static void main(String[] args)
    {
        /* Construct the following tree
                  1
                /   \
               /     \
              2       3
             / \     / \
            4   5   6   7
        */

        Node2 root = new Node2(1);
        root.left = new Node2(2);
        root.right = new Node2(3);
        root.left.left = new Node2(4);
        root.left.right = new Node2(5);
        root.right.left = new Node2(6);
        root.right.right = new Node2(7);

        convertToMirror(root);
        preorder(root);
    }
}
