package com.coding.school.datastructure.tree;

class Node6
{
    int data;
    Node6 left, right;

    Node6(int item)
    {
        data = item;
        left = right = null;
    }
}

class PrintNodesDontHaveSiblings
{
    Node6 root;

    // Function to print all non-root nodes
    // that don't have a sibling
    void printSingles(Node6 Node6)
    {
        // Base case
        if (Node6 == null)
            return;

        // If this is an internal node, recur for left
        // and right subtrees
        if (Node6.left != null && Node6.right != null)
        {
            printSingles(Node6.left);
            printSingles(Node6.right);
        }

        // If left child is NULL and right
        // is not, print right child
        // and recur for right child
        else if (Node6.right != null)
        {
            System.out.print(Node6.right.data + " ");
            printSingles(Node6.right);
        }

        // If right child is NULL and left
        // is not, print left child
        // and recur for left child
        else if (Node6.left != null)
        {
            System.out.print( Node6.left.data + " ");
            printSingles(Node6.left);
        }
    }
    // Driver program to test the above functions
    public static void main(String args[])
    {
        PrintNodesDontHaveSiblings tree = new PrintNodesDontHaveSiblings();
 
        /* Let us construct the tree
           shown in above diagram */
        tree.root = new Node6(1);
        tree.root.left = new Node6(2);
        tree.root.right = new Node6(3);
        tree.root.left.right = new Node6(4);
        tree.root.right.left = new Node6(5);
        tree.root.right.left.right = new Node6(6);
        tree.printSingles(tree.root);
    }
}
